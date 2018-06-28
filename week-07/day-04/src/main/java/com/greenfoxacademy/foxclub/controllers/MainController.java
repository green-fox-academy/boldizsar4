package com.greenfoxacademy.foxclub.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {


  @GetMapping("")
  public String renderLoginPage(){
    return "login";
  }

  @GetMapping("/profile/{username}")
  public String renderIndexPage(){
    return "index";
  }

  @PostMapping("")
  public String login(@RequestParam(name = "username") String username){
    return "redirect:/profile/" + username;
  }
}
