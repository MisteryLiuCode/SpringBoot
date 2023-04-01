package com;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 演示springBoot的默认扫描包配置，在默认扫描包外是扫描不到的
 */
@Controller
public class HiController {

    @Value("${my.website}")
    private String website;

    @RequestMapping("/hi")
    @ResponseBody
    public String hello(){
        System.out.println(website);
        return "hi,springboot";
    }
}
