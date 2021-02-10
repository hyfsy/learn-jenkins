package com.hyf.jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class JenkinsApplication
{

    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        SpringApplication.run(JenkinsApplication.class, args);
    }

    @RequestMapping("/hello")
    public String hello() {
        System.out.println("hello");
        return "hello";
    }

}
