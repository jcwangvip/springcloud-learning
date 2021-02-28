package com.springcloud.learn.feginlearn.user.controller;

import com.springcloud.learn.feginlearn.client.EurekaClientService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private EurekaClientService eurekaClientService;


    @GetMapping("/feign/user/findByUserName")
    public String findByUserName(String userName) {
        return eurekaClientService.findByUserName(userName);
    }
}
