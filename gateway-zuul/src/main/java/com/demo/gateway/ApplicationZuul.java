package com.demo.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @Description TODO
 * @Classname ApplicationZuul
 * @Author jianshi.jiang
 * @Date 2019/10/23 19:25
 * @Version V1.0
 */

@SpringBootApplication
@EnableZuulProxy
@EnableCircuitBreaker
public class ApplicationZuul {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationZuul.class, args);
    }

}