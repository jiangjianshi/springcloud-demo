package com.show.api.service;

import com.show.common.entity.User;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description TODO
 * @Classname UserServiceApiFallbackFactory
 * @Author jianshi.jiang
 * @Date 2019/10/16 17:52
 * @Version V1.0
 */
@Component
public class UserServiceApiFallbackFactory implements FallbackFactory<UserServiceApi> {

    @Override
    public UserServiceApi create(Throwable throwable) {

        return new UserServiceApi() {

            @Override
            public User getUserInfo(Integer uid) {
                User user = new User();
                user.setName("***");
                user.setAge(18);
                return user;
            }

            @Override
            public String saveUser(User user) {
                return "from hystrix 服务降级";
            }
        };
    }
}