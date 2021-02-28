package com.springcloud.learn.eurekaclient.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类描述
 *
 * @author jiancheng
 * @date 2021-2-28
 */
@RestController
public class UserController {

    @GetMapping("/eurekaClient/user/findByUserName")
    public String findByUserName(String userName) {
        return "userName = " + userName;
    }

}
