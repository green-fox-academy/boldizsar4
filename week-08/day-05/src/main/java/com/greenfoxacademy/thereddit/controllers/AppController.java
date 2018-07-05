package com.greenfoxacademy.thereddit.controllers;

import com.greenfoxacademy.thereddit.controllers.services.RedditUserService;
import com.greenfoxacademy.thereddit.models.RedditUser;
import com.greenfoxacademy.thereddit.repositories.RedditUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AppController {

  RedditUserService userService;

  @Autowired
  RedditUserRepository userRepository;

  @GetMapping("")
  public String renderLoginPage(){
    return "login";
  }

  @PostMapping("/login")
  public String login(@ModelAttribute(value = "name") String name){
    userService.login(name);
    return "redirect:/";
  }
}
