package com.skipper.zl.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Test {

    @RequestMapping("/test")
    public String test() {
        return "index";
    }
}
