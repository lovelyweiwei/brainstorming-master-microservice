package com.weiwei.brainstormingbackenduserservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.weiwei.brainstormingbackenduserservice.mapper")
@EnableScheduling
@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
@ComponentScan("com.weiwei") // 统一扫包
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"com.weiwei.brainstormingbackendserviceclient.service"})
public class BrainstormingBackendUserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BrainstormingBackendUserServiceApplication.class, args);
    }

}
