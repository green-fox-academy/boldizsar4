package com.greenfoxacademy.bankofsimba.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HTMLceptionController {


  @GetMapping("/hello")
  public String hello(Model model) {
    model.addAttribute("htmlformat", "This is an <em>HTML</em> text.");
    model.addAttribute("format", "<b>Enjoy yourself!</b>");
    return "htmlception";
  }
}