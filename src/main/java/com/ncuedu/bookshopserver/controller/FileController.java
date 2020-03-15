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
        Map<String, Object> map = new HashMap<>();
        map.put("code", 1);
        if (file != null && file.getOriginalFilename() != null && file.getOriginalFilename().length() > 0) {
            String filepath = "D:\\book\\imgupload\\";
//            String filepath="/upload/";
            String originalFilename = file.getOriginalFilename();
            //扩展名
            String extendName = originalFilename.substring(originalFilename.indexOf("."));
            String newfilename = UUID.randomUUID().toString() + extendName;
            File uploadfile = new File(filepath + newfilename);
            file.transferTo(uploadfile);
            map.put("data", newfilename);
            map.put("code", 0);
        }
        return map;
    }
}
