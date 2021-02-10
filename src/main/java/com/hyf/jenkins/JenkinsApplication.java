package com.hyf.jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
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

    @Controller
    static class HelloController
    {

        @RequestMapping("/hello")
        public String hello() {
            System.out.println("hello");
            return "hello";
        }
    }

}
