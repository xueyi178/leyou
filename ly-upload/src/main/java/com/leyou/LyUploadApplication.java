package com.leyou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 文件上传的启动类
 * @ProjectName leyou
 * @ClassName Application
 * @Description TODO
 * @Author Lenovo
 * @Date 2019/11/24 15:08
 * @Version 1.0
 */
@EnableEurekaClient
@SpringBootApplication
public class LyUploadApplication {

    public static void main(String[] args) {
        SpringApplication.run(LyUploadApplication.class,args);
    }
}
