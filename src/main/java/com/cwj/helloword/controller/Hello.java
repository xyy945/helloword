package com.cwj.helloword.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by cwj on 2018/9/9 21:10
 * Description:
 */
@RestController
public class Hello {
    @GetMapping("/hello")
    public String menthdName(){
        return "hello hhh";
    }
}
