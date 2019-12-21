package com.leyou;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import tk.mybatis.spring.annotation.MapperScan;

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

    private static Logger log = LoggerFactory.getLogger(LyItemApplication.class);

    public static void main(String[] args) {
        log.info("商品服务提交成功");
        log.info("dev分支少时诵诗书所 ");
        log.info("dev分支少时诵诗凄凄切切群群群群书所 ");
        SpringApplication.run(LyItemApplication.class);
    }
}
