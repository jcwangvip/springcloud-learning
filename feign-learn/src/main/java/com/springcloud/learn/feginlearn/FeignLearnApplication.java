package com.springcloud.learn.feginlearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * feign
 *
 * @author jiancheng
 */
@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class FeignLearnApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignLearnApplication.class, args);
    }

}
