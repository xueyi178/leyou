package com.leyou.upload.controller;

import com.leyou.item.common.utils.R;
import com.leyou.upload.service.IUploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * @ProjectName leyou
 * @ClassName UploadController
 * @Description TODO
 * @Author Lenovo
 * @Date 2019/11/24 15:14
 * @Version 1.0
 */
@RestController
@RequestMapping(value = "/upload")
public class UploadController {

    @Autowired
    private IUploadService uploadService;

    /**
     * 文件上传
     * @param file
     * @return
     */
    @PostMapping(value = "/image")
    public R uploadImage(@RequestParam("file")MultipartFile file){
        return uploadService.uploadImage(file);
    }
}
