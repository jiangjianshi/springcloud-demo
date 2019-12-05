package com.thinker.config;

import com.alibaba.cloud.sentinel.annotation.SentinelRestTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Description TODO
 * @Classname RestTemplateConfig
 * @Author jianshi.jiang
 * @Date 2019/10/18 16:24
 * @Version V1.0
 */
@Configuration
public class RestTemplateConfig {

//    @Bean(name="httpClient")
//    public CloseableHttpClient httpClient() {
//        return HttpClientBuilder.create().build();
//    }
//
//    @Bean
//    @LoadBalanced
//    public RestTemplate restTemplate() {
//        RestTemplate restTemplate = new RestTemplate(clientHttpRequestFactory());
//        return restTemplate;
//    }

    @Bean
//    @LoadBalanced
    @SentinelRestTemplate
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

//    @Bean
//    public HttpComponentsClientHttpRequestFactory clientHttpRequestFactory() {
//        HttpComponentsClientHttpRequestFactory clientHttpRequestFactory = new HttpComponentsClientHttpRequestFactory();
//        clientHttpRequestFactory.setHttpClient(httpClient());
//        return clientHttpRequestFactory;
//    }
//
//    @Bean
//    public TaskScheduler taskScheduler() {
//        ThreadPoolTaskScheduler scheduler = new ThreadPoolTaskScheduler();
//        scheduler.setThreadNamePrefix("poolScheduler");
//        scheduler.setPoolSize(50);
//        return scheduler;
//    }

}