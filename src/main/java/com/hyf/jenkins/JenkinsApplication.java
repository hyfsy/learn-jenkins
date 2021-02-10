package com.hyf.jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsApplication
{

    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        SpringApplication.run(JenkinsApplication.class, args);
    }

}
