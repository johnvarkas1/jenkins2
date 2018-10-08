package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

    @Autowired
    MyTestService service;

    @RequestMapping("/login")
    private String tmpMethod() {
        return service.tmpMehtod("hello world");
    }
}
