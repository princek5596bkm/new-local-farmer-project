package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

  
    @RequestMapping("/handler")
    @ResponseBody
    public String handler(){

        return"My name is Akash";
    }
    
}
