package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {

Greeting greeting;
private AtomicLong idCounter = new AtomicLong();

@RequestMapping(value = "/greeting")
public Greeting greeting(@RequestParam(value = "name", defaultValue = "world") String name){
    greeting = new Greeting(idCounter.getAndIncrement(), "hello " + name);
    return greeting;
  }
}

