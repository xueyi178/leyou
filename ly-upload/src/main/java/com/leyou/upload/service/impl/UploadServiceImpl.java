package com.leyou.upload.service.impl;

import com.leyou.item.common.utils.R;
import com.leyou.upload.service.IUploadService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Arrays;
import java.util.List;

/**
 * 文件上传的业务逻辑层实现类
 */
@Service
public class UploadServiceImpl implements IUploadService {

    private static final Logger logger = LoggerFactory.getLogger(UploadServiceImpl.class);

    // 支持的文件类型
    private static final List<String> suffixes = Arrays.asList("image/png", "image/jpeg");

    /**
     * 文件上传
     * @param file
     * @return
     */
    @Override
    public R uploadImage(MultipartFile file) {
        try {
            // 1、图片信息校验
            // 1)校验文件类型
            String type = file.getContentType();
            if (!suffixes.contains(type)) {
                logger.info("上传失败，文件类型不匹配：{}", type);
                return R.error().put("msg", "上传失败，文件类型不匹配");
            }

            // 2)校验图片内容
            BufferedImage image = ImageIO.read(file.getInputStream());
            if (image == null) {
                logger.info("上传失败，文件内容不符合要求");
                return R.error().put("msg", "上传失败，文件内容不符合要求");
            }

            // 2、保存图片
            // 2.1、生成保存目录
            File dir = new File("J:\\heima\\upload");
            //如果上传文件路径不存在
            if (!dir.exists()) {
                //就创建这个文件路径
                dir.mkdirs();
            }
            // 2.2、保存图片
            file.transferTo(new File(dir, file.getOriginalFilename()));

            // 2.3、拼接图片地址
            String url = "http://image.leyou.com/upload/" + file.getOriginalFilename();

            return R.ok().put("url",url);
        } catch (Exception e) {
            return R.error().put("msg", e.getMessage());
        }
    }
}
