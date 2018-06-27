package com.greenfoxacademy.webapplication.controllers;

import com.greenfoxacademy.webapplication.services.UtilityService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UsefulUtilitiesController {
@Autowired
  UtilityService utilityService;
  @GetMapping("/useful")
  public String link(Model model){
    model.addAttribute("utilities", "Colored Background");
    return "useful";
  }

  @GetMapping("useful/colored")
  public String colored(Model model){
    model.addAttribute("randomcolor", utilityService.randomColor());
    return "colored";
  }
}
