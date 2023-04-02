package com.liu.springboot.controller;

import com.liu.springboot.bean.Furn;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class HelloController {

    @Resource
    private Furn furn;

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "hello,springboot";
    }

    @RequestMapping("/furn")
    @ResponseBody //以json的形式返回
    public Furn furn(){
        return furn;
    }
}
