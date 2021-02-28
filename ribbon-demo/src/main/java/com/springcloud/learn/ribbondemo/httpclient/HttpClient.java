package com.springcloud.learn.ribbondemo.httpclient;

import com.netflix.ribbon.RequestTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 类描述
 *
 * @author jiancheng
 * @date 2021-2-28
 */
@Configuration
public class HttpClient {

    @Bean
    public RequestTemplate requestTemplate() {
//        return RequestBuilder.get("").build().;
//        return new HttpRequestTemplate();
        return null;
    }

}
