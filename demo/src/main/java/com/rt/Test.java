package com.rt; /**
 * Created by dell on 2018/5/31.
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication //Spring Boot核心注解，用于开启自动配置
// 开启通用注解扫描
@ComponentScan
public class Test extends SpringBootServletInitializer {
    @RequestMapping("/")
    String index(){
        return "Hello Spring Boot";
    }
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        builder.sources(this.getClass());
        return super.configure(builder);
    }
    public static void main(String[] args) {
        SpringApplication.run(Test.class, args);
    }
}
