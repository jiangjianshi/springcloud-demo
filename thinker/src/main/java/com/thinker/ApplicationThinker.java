package com.thinker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Description TODO
 * @Classname ApplicationThinker
 * @Author jianshi.jiang
 * @Date 2019/10/16 14:14
 * @Version V1.0
 */

@RibbonClient(name="show-demo")
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages= {"com.show"})
@ComponentScan("com")
public class ApplicationThinker {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationThinker.class, args);
    }

}