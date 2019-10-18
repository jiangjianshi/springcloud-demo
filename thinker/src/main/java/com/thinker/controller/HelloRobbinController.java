package com.thinker.controller;

import com.show.common.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description 调用服务方式一：通过RestTemplate直接调用
 * @Classname HelloRobbinController
 * @Author jianshi.jiang
 * @Date 2019/10/18 15:56
 * @Version V1.0
 */
@RestController
@RequestMapping("/helloRobbin")
public class HelloRobbinController {

    private static final String REST_URL_PREFIX = "http://show-demo";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "getMyInfo")
    public User getMyInfo(Integer uid) {
        /**
         * restTemplate发送Get请求, 需要将请求Url用占位符
         * String url = "http://api.xxx.xxx?name={name}&age={age}";
         */
        Map params = new HashMap();
        params.put("uid", uid);
        return restTemplate.getForObject(REST_URL_PREFIX + "/show/user/getUserInfo"+"?uid={uid}", User.class, params);
    }
}