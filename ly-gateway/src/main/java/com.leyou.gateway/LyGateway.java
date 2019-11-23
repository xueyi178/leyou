package com.leyou.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 网关的控制访问层接口
 *
 * @ProjectName leyou
 * @ClassName LyGateway
 * @Description TODO
 * @Author Lenovo
 * @Date 2019/11/9 16:20
 * @Version 1.0
 */
@EnableZuulProxy    //开启网关
@SpringBootApplication
public class LyGateway {

    public static void main(String[] args) {
        SpringApplication.run(LyGateway.class);
    }
}
