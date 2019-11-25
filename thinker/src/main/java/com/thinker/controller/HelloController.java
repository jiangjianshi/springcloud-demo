package com.thinker.controller;

import com.alibaba.fastjson.JSON;
import com.show.api.service.UserServiceApi;
import com.show.common.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

/**
 * @Description 调用服务方式二：接口调用
 * @Classname HelloController
 * @Author jianshi.jiang
 * @Date 2019/10/16 16:00
 * @Version V1.0
 */

@RestController
@RequestMapping("/hello")
@Slf4j
@RefreshScope
public class HelloController {

    @Value("${test.config:hello nacos config}")
    private String testConfig;

    @GetMapping(value = "/man")
    public String man(String name) {
        return "test ok";
    }

    @Autowired
    private UserServiceApi userServiceApi;

    @GetMapping(value = "/getMyInfo")
    public User getMyInfo(Integer uid) {

        User user = userServiceApi.getUserInfo(uid);
        System.out.println("uid = " + uid + "user = " + JSON.toJSON(user));
        System.out.println(testConfig);
        return user;
    }

    @PostMapping(value = "saveMyInfo")
    public String saveMyInfo(User user) {

        log.info("saveMyInfo request user = {}", JSON.toJSONString(user));
        String result = userServiceApi.saveUser(user);
        log.info("服务提供者返回的信息={}", result);
        return result;
    }
}