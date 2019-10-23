package com.demo.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * @Description TODO
 * @Classname ApplicationHystrixDashboard
 * @Author jianshi.jiang
 * @Date 2019/10/23 13:53
 * @Version V1.0
 */

@SpringBootApplication
@EnableHystrixDashboard
@EnableTurbine
public class ApplicationHystrixDashboard {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationHystrixDashboard.class, args);
    }

}