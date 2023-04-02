package com.liu.springboot;

import com.liu.springboot.bean.Dog;
import com.liu.springboot.bean.Monster;
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
//        String[] beanDefinitionNames = ioc.getBeanDefinitionNames();
//        for (String beanDefinitionName : beanDefinitionNames) {
//            System.out.println("beanDefinitionName--"+beanDefinitionName);
//        }
//        Object monster01 = ioc.getBean("monster01");
//        Object monster02 = ioc.getBean("monster01");
//        System.out.println("monster01.hashCode()"+monster01.hashCode());
//        System.out.println("monster02.hashCode()"+monster02.hashCode());
//        System.out.println(monster01.equals(monster02));

//        获取通过@import注入的bean
//        Dog bean01 = ioc.getBean(Dog.class);
//        Dog bean02 = ioc.getBean(Dog.class);
//        System.out.println(bean01.hashCode());
//        System.out.println(bean02.hashCode());

//        通过@ImportResource导入xml配置文件，将配置类和配置文件结合在一起
        Monster monsterXml = ioc.getBean("monsterXml", Monster.class);
        System.out.println(monsterXml.toString());
        Monster monster2Xml = ioc.getBean("monster2Xml", Monster.class);
        System.out.println(monster2Xml.toString());

    }
}
