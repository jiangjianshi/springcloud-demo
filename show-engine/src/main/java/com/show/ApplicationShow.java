package com.show;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

/**
 * @Description TODO
 * @Classname ApplicationShow
 * @Author jianshi.jiang
 * @Date 2019/10/16 11:06
 * @Version V1.0
 */

@SpringBootApplication
@EnableDiscoveryClient //服务发现（如果选用的非eureka注册中心， 推荐使用此注解）
@EnableCircuitBreaker//对hystrixR熔断机制的支
public class ApplicationShow {

    public static void main(String[] args) {

        SpringApplication.run(ApplicationShow.class, args);
    }

    @Bean
    public ServletRegistrationBean ServletRegistrationBeangetServlet() {
        HystrixMetricsStreamServlet streamServlet = new HystrixMetricsStreamServlet();
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(streamServlet);
        registrationBean.setLoadOnStartup(1);
        registrationBean.addUrlMappings("/actuator/hystrix.stream");
        registrationBean.setName("HystrixMetricsStreamServlet");
        return registrationBean;
    }
}