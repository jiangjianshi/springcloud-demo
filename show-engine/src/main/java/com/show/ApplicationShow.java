package com.show;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Description TODO
 * @Classname ApplicationShow
 * @Author jianshi.jiang
 * @Date 2019/10/16 11:06
 * @Version V1.0
 */

@SpringBootApplication
@EnableEurekaClient //本服务启动后会自动注册进eureka服务中
//@EnableDiscoveryClient //服务发现（如果选用的非eureka注册中心， 推荐使用此注解）
@EnableCircuitBreaker//对hystrixR熔断机制的支
public class ApplicationShow {

    public static void main(String[] args) {

        SpringApplication.run(ApplicationShow.class, args);
    }
}