package com.leyou.gateway;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    private static Logger log = LoggerFactory.getLogger(LyGateway.class);

    public static void main(String[] args) {
        SpringApplication.run(LyGateway.class);
        log.info("LyGateway网关启动成功");
    }
}
