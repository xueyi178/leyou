package com.leyou.upload.service;

import com.leyou.item.common.utils.R;
import org.springframework.web.multipart.MultipartFile;

/**
 * 文件上传的业务逻辑层接口
 */
public interface IUploadService {

    /**
     * 文件上传
     * @param file
     * @return
     */
    public R uploadImage(MultipartFile file);
}
