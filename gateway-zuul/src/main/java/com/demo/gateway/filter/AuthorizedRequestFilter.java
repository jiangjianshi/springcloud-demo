package com.demo.gateway.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import lombok.extern.slf4j.Slf4j;

import java.nio.charset.Charset;
import java.util.Base64;

/**
 * @Description TODO
 * @Classname AuthorizedRequestFilter
 * @Author jianshi.jiang
 * @Date 2019/10/23 19:50
 * @Version V1.0
 */
@Slf4j
public class AuthorizedRequestFilter extends ZuulFilter {


    @Override
    public String filterType() {
        // 在进行Zuul过滤的时候可以设置其过滤执行的位置，那么此时有如下几种类型：
        // 1、pre：在请求发出之前执行过滤，如果要进行访问，肯定在请求前设置头信息
        // 2、route：在进行路由请求的时候被调用；
        // 3、post：在路由之后发送请求信息的时候被调用；
        // 4、error：出现错误之后进行调用
        log.info("AuthorizedRequestFilter filterType.......");
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }


    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        log.info("AuthorizedRequestFilter run.......");

        RequestContext currentContext = RequestContext.getCurrentContext() ; // 获取当前请求的上下文
        String auth = "studyjava:hello"; // 认证的原始信息
        byte[] encodedAuth = Base64.getEncoder()
                .encode(auth.getBytes(Charset.forName("US-ASCII"))); // 进行一个加密的处理
        // 在进行授权的头信息内容配置的时候加密的信息一定要与“Basic”之间有一个空格
        String authHeader = "Basic " + new String(encodedAuth);
        currentContext.addZuulRequestHeader("Authorization", authHeader);
        return null;
    }
}