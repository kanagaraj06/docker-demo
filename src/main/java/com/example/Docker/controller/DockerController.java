package com.example.Docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/docker")
public class DockerController {

    @GetMapping(path = "/test")
    public String DockerTest(){
        return "Docker testing Successfully" ;
    }
}
