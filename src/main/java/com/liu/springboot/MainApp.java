package com.liu.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * scanBasePackages = {"com.liu"}，指定要扫描的包，这里是个数组，所以可以写多个包
 */
@SpringBootApplication(scanBasePackages = {"com"})
public class MainApp {
    public static void main(String[] args) {
        ConfigurableApplicationContext ioc = SpringApplication.run(MainApp.class, args);
//        查看容器中注入的组件
        String[] beanDefinitionNames = ioc.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println("beanDefinitionName--"+beanDefinitionName);
        }
    }
}
