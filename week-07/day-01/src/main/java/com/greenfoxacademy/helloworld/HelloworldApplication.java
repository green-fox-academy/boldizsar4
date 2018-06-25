package com.greenfoxacademy.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class HelloworldApplication {

  public static void main(String[] args) {
    SpringApplication.run(HelloworldApplication.class, args);
  }
@RequestMapping(value = "/hello")
@ResponseBody
  public String hello(){
    return "Hello World!";
  }
}
