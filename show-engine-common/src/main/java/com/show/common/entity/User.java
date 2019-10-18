package com.show.common.entity;

import lombok.Data;

import java.util.Date;

/**
 * @Description TODO
 * @Classname User
 * @Author jianshi.jiang
 * @Date 2019/10/16 17:38
 * @Version V1.0
 */
@Data
public class User {

    private Integer uid;
    private String name;
    private int gender = 1;
    private Integer age;
    private Date birth;
}