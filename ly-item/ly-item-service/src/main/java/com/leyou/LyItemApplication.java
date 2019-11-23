package com.leyou;

import tk.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ProjectName leyou
 * @ClassName LyItemAppcation
 * @Description TODO
 * @Author Lenovo
 * @Date 2019/11/9 17:46
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.leyou.item.mapper")
public class LyItemApplication {

    public static void main(String[] args) {
        SpringApplication.run(LyItemApplication.class);
    }
}
