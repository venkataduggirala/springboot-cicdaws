package com.springboot.awsdemo.awscicd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/awscicd")
public class GreetingsController {
    @GetMapping("/greetings")
    public String getGreetings(){
        return "SpringBoot App is deployed on AWS EC2 Instance using CICD";
    }

    /*@GetMapping("/health")
    public String getHealth(){
        return "UP";
    }*/

}
