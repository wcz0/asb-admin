package com.wcz0.api.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController("ApiHomeController")
@RequestMapping("api/front")
public class HomeController {

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home(){
        return "hello world";
    }
}
