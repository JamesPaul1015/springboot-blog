package com.codeup.springbootblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class HelloController {

    @Controller
    class HomeController {

        @GetMapping("/hello")
        @ResponseBody
        public String hello() {
            return "Hello from Spring!";
        }
    }

}
