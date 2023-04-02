package com.liu.springboot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
//通过这种方式导入配置文件，将配置类和配置文件结合在一起
@ImportResource(value = {"classpath:beans.xml","classpath:beans2.xml"})
public class BeanConfig2 {
}
