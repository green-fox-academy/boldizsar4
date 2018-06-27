package com.greenfoxacademy.webapplication.controllers;

import com.greenfoxacademy.webapplication.services.UtilityService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UsefulUtilitiesController {

  @Autowired
  UtilityService utilityService;

  @GetMapping("/useful")
  public String link(Model model){
    model.addAttribute("bgcolor", "Colored Background");
    model.addAttribute("email", "Email");
    model.addAttribute("encoder", "Caesar Encoder");
    return "useful";
  }

  @GetMapping("useful/colored")
  public String colored(Model model){
    model.addAttribute("randomcolor", utilityService.randomColor());
    return "colored";
  }

  @GetMapping("useful/email")
  public String email(Model model, @RequestParam(name = "email") String emailCheck){
    model.addAttribute("isValid", utilityService.validateEmail(emailCheck));
    model.addAttribute("emailToCheck", emailCheck);
    return "email";
  }
}
