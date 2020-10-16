package com.ncuedu.bookshopserver.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2020/3/15 12:44
 **/
@RestController
public class FileController {

    @RequestMapping("/file/upload")
    public Map<String, Object> fileupload(MultipartFile file) throws IOException {
        //封装返回结果
        Map<String, Object> result = new HashMap<>();
        result.put("code", 1);
        //判断文件及文件名不能为空
        if (file != null && file.getOriginalFilename() != null && file.getOriginalFilename().length() > 0) {
            //设置文件存储路径
            String filepath = "D:\\book\\imgupload\\";
//            String filepath="/book/imgupload/";
            String originalFilename = file.getOriginalFilename();
            //取出文件的扩展名
            String extendName = originalFilename.substring(originalFilename.indexOf("."));
            //将文件重命名避免与服务器已有文件重名
            String newfilename = UUID.randomUUID().toString() + extendName;
            File uploadfile = new File(filepath + newfilename);
            file.transferTo(uploadfile);
            //将新文件名封装到返回结果中
            result.put("data", newfilename);
            result.put("code", 0);
        }
        return result;
    }
}
