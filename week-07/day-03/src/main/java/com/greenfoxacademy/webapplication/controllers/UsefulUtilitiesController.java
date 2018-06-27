package com.greenfoxacademy.webapplication.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UsefulUtilitiesController {

  @GetMapping("/useful")
  public String link(Model model){
    model.addAttribute("utilities", "Colored Background");
    return "useful";
  }
}
