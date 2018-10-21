package com.hxr.springmvc.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@RequestMapping("/springmvc")
@Controller
public class EndPoint2 {

    @RequestMapping("/failend")
    public String hello(){
        System.out.println("failend");
        return "success";
    }
}
