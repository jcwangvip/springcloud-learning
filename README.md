这个名字是在注册中心显示的名字
spring:
  application:
    name: eureka-client-application-name
    
遇到的问题:
在启动ribbon项目的时候遇见如下问题：
Unregistering application RIBBON-LEARN-NAME with eureka with status DOWN
解决方法：
pom文件中加上
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
</dependency>
由此引发代解决的问题：为啥现在和client项目没有问题。

feign 客户端请求的时候报出的问题：
feign.FeignException$MethodNotAllowed: [405] during [GET] to [http://eureka-client-application-name/eurekaClient/user/findByUserName]
解决办法：
get 请求参数一定要加@RequestParam
post 一定要加@RequestBody