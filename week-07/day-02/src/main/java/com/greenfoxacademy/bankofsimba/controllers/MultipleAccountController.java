package com.greenfoxacademy.bankofsimba.controllers;

import com.greenfoxacademy.bankofsimba.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MultipleAccountController {

  List<BankAccount> characters = new ArrayList<>();

  public MultipleAccountController() {
    characters.add(new BankAccount("Timon", 1200, "spider", "meerkat"));
    characters.add(new BankAccount("Pumbaa", 4100, "rhizomes", "warthog"));
    characters.add(new BankAccount("Mufasa", 6500, "zebra", "lion"));
    characters.add(new BankAccount("Rafiki", 1300, "fruit", "mandrill"));
  }

  @GetMapping("/charactertable")
  public String characterTable(Model model){
    model.addAttribute("characterlist", characters);
    return "multiple";
  }
}
