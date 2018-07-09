package com.greenfoxacademy.restday.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MainController {

  @GetMapping("/")
  public String renderIndexPage(){
    return "index";
  }

  @GetMapping("/doubling")
  public Integer doubling(@RequestParam("input") int number){
    if (number == 0) {
      return 0;
    }
    int result = number * 2;
    return result;
  }

}
