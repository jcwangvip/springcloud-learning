package com.springcloud.learn.feginlearn.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 类描述
 *
 * @author jiancheng
 * @date 2021-2-28
 */
@FeignClient(name = "${eurekaClient.name}", path = "/eurekaClient")
public interface EurekaClientService {

    @GetMapping("/user/findByUserName")
    public String findByUserName(@RequestParam("userName") String userName);

}
