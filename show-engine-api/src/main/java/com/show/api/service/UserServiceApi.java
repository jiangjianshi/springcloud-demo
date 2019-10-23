package com.show.api.service;

import com.show.common.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * @Description TODO
 * @Classname UserService
 * @Author jianshi.jiang
 * @Date 2019/10/16 17:50
 * @Version V1.0
 */
@FeignClient(value = "show-demo", fallbackFactory = UserServiceApiFallbackFactory.class)
public interface UserServiceApi {

    /**
     * 获取user
     *
     * @param uid
     * @return
     */
    @GetMapping(value = "user/getUserInfo")
    User getUserInfo(@RequestParam("uid") Integer uid);

    /**
     * 保存user
     *
     * @param user
     * @return
     */
    @PostMapping(value = "user/saveUser")
    String saveUser(User user);
}