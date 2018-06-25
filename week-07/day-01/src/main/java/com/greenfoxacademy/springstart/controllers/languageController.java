package com.greenfoxacademy.springstart.controllers;
import com.greenfoxacademy.springstart.Language;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class languageController {
  Language language = new Language();

  @RequestMapping("/web/language")
  public String language(Model model){
    model.addAttribute("hello", language.getRandomHello());
    model.addAttribute("red", language.red());
    model.addAttribute("green", language.green());
    model.addAttribute("blue", language.blue());
    model.addAttribute("fontsize", language.fontSize());
    return "language";
  }
}
