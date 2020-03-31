package com.ncuedu.bookshopserver.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.junit.platform.commons.util.StringUtils;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

import javax.websocket.*;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2020/3/30 19:08
 **/
@ServerEndpoint("/imserver/{isUser}/{id}") //1代表用户，0代表客服
@Component
public class WebSocketServer {

    /**concurrent包的线程安全Set，用来存放每个客户端对应的MyWebSocket对象。*/
    private static ConcurrentHashMap<String,WebSocketServer> userSocket = new ConcurrentHashMap<>();
    private static ConcurrentHashMap<String,WebSocketServer> adminSocket = new ConcurrentHashMap<>();
    /**与某个客户端的连接会话，需要通过它来给客户端发送数据*/
    private Session session;
    /**接收userId*/
    private String id="";
    private String isUser="";
    private boolean isConnect=false;

    @OnOpen
    public void onOpen(Session session, @PathParam("id") String id, @PathParam("isUser") String isUser) throws IOException {
        this.session = session;
        this.id=id;
        this.isUser=isUser;
        if("1".equals(isUser)){
            if(userSocket.containsKey(id)){
                userSocket.remove(id);
            }
            userSocket.put(id,this);
            if(adminSocket.size()==0){
                System.out.println("当前没有客服在线");
            }else{
                for (String s : adminSocket.keySet()) {
                    WebSocketServer webSocketServer = adminSocket.get(s);
                    if(webSocketServer.isConnect){
                        continue;
                    }
                    webSocketServer.isConnect=true;
                    Map<String,Object> message=new HashMap<>();
                    message.put("flag",0);
                    message.put("id",id);
                    sendInfo(JSON.toJSONString(message),s,"2");
                    message.put("id",s);
                    sendInfo(JSON.toJSONString(message),id,"1");
                }
            }
        }else if("0".equals(isUser)){
            if(adminSocket.containsKey(id)){
                adminSocket.remove(id);
            }
            adminSocket.put(id,this);
        }
    }

    @OnClose
    public void onClose() {
        if("1".equals(isUser)){
            userSocket.remove(id);

        }else if("0".equals(isUser)){
            adminSocket.remove(id);
        }
        System.out.println("用户退出");
    }

    @OnMessage
    public void onMessage(String message, Session session) {
        System.out.println("类型"+isUser+"消息:"+id+",报文:"+message);
        //可以群发消息
        //消息保存到数据库、redis
        if(StringUtils.isNotBlank(message)){
            try {
                //解析发送的报文
                JSONObject jsonObject = JSON.parseObject(message);
                //追加发送人(防止串改)
                jsonObject.put("fromUserId",this.id);
                jsonObject.put("flag",1);
                jsonObject.put("date",new Date());
                String toUserId=jsonObject.getString("toUserId");
                //传送给对应toUserId用户的websocket
                if("1".equals(isUser)){
                    if(StringUtils.isNotBlank(toUserId)&&adminSocket.containsKey(toUserId)){
                        adminSocket.get(toUserId).sendMessage(jsonObject.toJSONString());
                    }else{
                        System.out.println("请求的adminId:"+toUserId+"不在该服务器上");
                    }
                }else{
                    if(StringUtils.isNotBlank(toUserId)&&userSocket.containsKey(toUserId)){
                        userSocket.get(toUserId).sendMessage(jsonObject.toJSONString());
                    }else{
                        System.out.println("请求的userId:"+toUserId+"不在该服务器上");
                    }
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    @OnError
    public void onError(Session session, Throwable error) {
        System.out.println("类型"+isUser+"用户错误:"+this.id+",原因:"+error.getMessage());
        error.printStackTrace();
    }

    public void sendMessage(String message) throws IOException {
        this.session.getBasicRemote().sendText(message);
    }

    /**
     * 发送自定义消息
     * */
    public static void sendInfo(String message,@PathParam("id") String id,@PathParam("isUser") String isUser) throws IOException {
        System.out.println("类型"+isUser+"发送消息到:"+id+"，报文:"+message);
        if("1".equals(isUser)){
            if(StringUtils.isNotBlank(id)&&userSocket.containsKey(id)){
                userSocket.get(id).sendMessage(message);
            }else{
                System.out.println("用户"+id+",不在线！");
            }
        }else{
            if(StringUtils.isNotBlank(id)&&adminSocket.containsKey(id)){
                adminSocket.get(id).sendMessage(message);
            }else{
                System.out.println("用户"+id+",不在线！");
            }
        }

    }

}
