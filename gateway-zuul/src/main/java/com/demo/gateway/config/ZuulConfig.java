package com.demo.gateway.config;

import com.demo.gateway.filter.AuthorizedRequestFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description TODO
 * @Classname ZuulConfig
 * @Author jianshi.jiang
 * @Date 2019/10/23 19:55
 * @Version V1.0
 */
@Configuration
public class ZuulConfig {

    @Bean
    public AuthorizedRequestFilter getAuthorizedRequestFilter() {
        return new AuthorizedRequestFilter();
    }
}