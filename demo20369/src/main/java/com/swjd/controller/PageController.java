package com.swjd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/page")
public class PageController {
    @RequestMapping("/signin")
    public String toSignin(){
        return "signin";
    }


    @RequestMapping("/toStudent")
    public String toStudent(){
        return "student";
    }
}
