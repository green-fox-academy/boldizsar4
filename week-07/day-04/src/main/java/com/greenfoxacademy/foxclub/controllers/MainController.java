package com.greenfoxacademy.foxclub.controllers;

import com.greenfoxacademy.foxclub.models.Fox;
import com.greenfoxacademy.foxclub.services.FoxService;
import com.greenfoxacademy.foxclub.services.FoxServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  private FoxService foxService;

  @Autowired
  public MainController(FoxServiceImpl foxService) {
    this.foxService = foxService;
  }

  @GetMapping("")
  public String renderLoginPage(){
    return "login";
  }

  @GetMapping("/profile/{username}")
  public String renderIndexPage(){
    return "index";
  }

  @PostMapping("/login")
  public String login(@ModelAttribute(value = "username") String username) {
    foxService.login(username);
    return "redirect:/profile/" + username;
  }

  @GetMapping("/profile/nutrition")
  public String nutrition(Model model){
    model.addAttribute("fox", fox);
    return "nutrition";
  }

  @PostMapping("/profile/addnutrition")
  public String addnutrition(String food, String drink) {
    this.fox.setFood(food);
    this.fox.setDrink(drink);
    return "redirect:/profile/{username}";
  }

}
