package com.greenfoxacademy.helloworld.controllers;

import com.greenfoxacademy.helloworld.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {
Greeting greeting;

@RequestMapping(value = "/greeting")
public Object greeting(){
    greeting = new Greeting(1,"hello world!");
    return greeting;
  }

}

