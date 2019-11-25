package com.thinker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Description TODO
 * @Classname ApplicationThinker
 * @Author jianshi.jiang
 * @Date 2019/10/16 14:14
 * @Version V1.0
 */

//@RibbonClient(name="show-demo")
@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients(basePackages = {"com.show"})
@ComponentScan("com")
public class ApplicationThinker {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationThinker.class, args);
    }


//    @Bean
//    public ServletRegistrationBean ServletRegistrationBeangetServlet() {
//        HystrixMetricsStreamServlet streamServlet = new HystrixMetricsStreamServlet();
//        ServletRegistrationBean registrationBean = new ServletRegistrationBean(streamServlet);
//        registrationBean.setLoadOnStartup(1);
//        //http://localhost:8089/thinker/hystrix.stream
//        registrationBean.addUrlMappings("/actuator/hystrix.stream");
//        registrationBean.setName("HystrixMetricsStreamServlet");
//        return registrationBean;
//
//    }

}