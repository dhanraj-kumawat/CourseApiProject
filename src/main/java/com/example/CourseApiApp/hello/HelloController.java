package com.example.CourseApiApp.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/") // by default : get request http
    public String courseIntro(){
        return "This is a Course Api : You can perform different crud operations and it's implemented with the help of SpringBoot, Spring JPA and derby a database";
    }

}
