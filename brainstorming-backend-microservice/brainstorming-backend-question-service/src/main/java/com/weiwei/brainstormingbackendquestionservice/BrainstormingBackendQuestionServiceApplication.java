package com.weiwei.brainstormingbackendquestionservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.weiwei.brainstormingbackendquestionservice.mapper")
@EnableScheduling
@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
@ComponentScan("com.weiwei") // 统一扫包
public class BrainstormingBackendQuestionServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BrainstormingBackendQuestionServiceApplication.class, args);
    }

}
