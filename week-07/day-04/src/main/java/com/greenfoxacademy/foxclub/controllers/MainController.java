package com.greenfoxacademy.foxclub.controllers;

import com.greenfoxacademy.foxclub.models.Fox;
import com.greenfoxacademy.foxclub.services.FoxService;
import com.greenfoxacademy.foxclub.services.FoxServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

  private FoxService foxService;
@Autowired
Fox fox;
  @Autowired
  public MainController(FoxServiceImpl foxService) {
    this.foxService = foxService;
  }

  @GetMapping("")
  public String renderLoginPage(){
    return "login";
  }

  @GetMapping("/profile/{username}")
  public String renderIndexPage (@PathVariable(value = "username") String name, Model model){
    model.addAttribute("fox", foxService.getFox(name));
    return "index";
  }

  @PostMapping("/login")
  public String login(@RequestParam(value = "username") String name) {
    foxService.login(name);
    return "redirect:/profile/" + name;
  }

  @GetMapping("/profile/{username}/nutrition")
  public String nutrition(@PathVariable(value = "username") String name, Model model){
    model.addAttribute("fox", foxService.getFox(name));
    model.addAttribute("username", name);
    return "nutrition";
  }

  @PostMapping("/profile/{username}/addnutrition")
  public String addnutrition(@PathVariable(value = "username") String name, String food, String drink) {
    this.fox.setFood(food);
    this.fox.setDrink(drink);
    return "redirect:/profile/" + name;
  }

  @GetMapping("/profile/{username}/tricks")
  public String trick(@PathVariable(value = "username")String name, Model model) {
    model.addAttribute("fox",foxService.getFox(name));
    model.addAttribute("username", name);
    return "tricks";
  }
  @PostMapping("/profile/{username}/addtrick")
  public String addtrick(@PathVariable(value = "username")String name, String trick) {
    this.fox.addTrick(trick);
    return "redirect:/profile/" + name;
  }

}
