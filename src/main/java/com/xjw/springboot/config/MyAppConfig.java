package com.xjw.springboot.config;

import com.xjw.springboot.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 指明当前类是一个配置类；就是来替代之前spring的配置文件xml
 * 在spring中是用<bean>标签来标明组件
 * 在springboot中是用@Bean注解
 */
@Configuration
public class MyAppConfig {

    //将方法的返回值添加到容器中；容器中这个组件默认的ID就是这个方法名
    @Bean
    public HelloService helloService(){
        System.out.println("配置类@Bean给容器中添加组件了");
        return new HelloService();
    }
}
