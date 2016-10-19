package com.qt.web;

import com.qt.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by liuchenfei on 2016/10/19.
 */
@Controller
@RequestMapping("/test")
public class HelloController {
    @Autowired
    HelloService helloService;

    @RequestMapping("/hello")
    public @ResponseBody
    String hello(@RequestParam("test") String test)
    {
        System.out.println("hello");
        return "hello"+test;
    }
}
