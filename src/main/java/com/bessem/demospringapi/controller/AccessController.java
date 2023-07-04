package com.bessem.demospringapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/access/")
public class AccessController
{
    @GetMapping("/public")
    public String accessPublic(){
        return "Access Public !";
    }

    @GetMapping("/user")
    public String accessUser(){
        return "Access User !";
    }

    @GetMapping("/admin")
    public String accessAdmin(){
        return "Access Admin !";
    }
}
