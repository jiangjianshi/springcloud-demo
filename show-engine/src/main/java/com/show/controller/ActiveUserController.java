package com.show.controller;

import com.alibaba.fastjson.JSON;
import com.show.common.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * @Description TODO
 * @Classname ActiveUserController
 * @Author jianshi.jiang
 * @Date 2019/10/16 11:29
 * @Version V1.0
 */
@RestController
@RequestMapping("/user")
@Slf4j
public class ActiveUserController {

    @GetMapping(value = "/getUserInfo")
    public User getUserInfo(Integer uid) {

        User user = new User();
        user.setUid(uid);
        user.setAge(20);
        user.setBirth(new Date());
        user.setGender(1);
        user.setName("张三");
        System.out.println(JSON.toJSONString(user));
        return user;
    }

    @PostMapping(value = "/saveUser")
    public String saveUser(@RequestBody User user) {

        log.info("show engine 接收到的信息={}", JSON.toJSONString(user));
        return "save success!";
    }

}