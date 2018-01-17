package com.codeup.springbootblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class HomeController {

    @Controller
    class HelloController {

        @GetMapping("/hello")
        @ResponseBody
        public String hello() {
            return "This is the landing page!";
        }
    }


}
