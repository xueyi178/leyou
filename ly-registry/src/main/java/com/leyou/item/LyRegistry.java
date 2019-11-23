package com.leyou.item;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 注册中心的控制访问层接口
 * @ProjectName leyou
 * @ClassName LyRegistry
 * @Description TODO
 * @Author Lenovo
 * @Date 2019/11/9 16:10
 * @Version 1.0
 */
@EnableEurekaServer     //服务端的启动类,接受其他服务注册进来
@SpringBootApplication
public class LyRegistry {

    public static void main(String[] args) {
        SpringApplication.run(LyRegistry.class);
    }
}
