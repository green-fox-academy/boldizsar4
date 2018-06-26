package com.greenfoxacademy.bankofsimba.controllers;

import com.greenfoxacademy.bankofsimba.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MultipleAccountController {

  List<BankAccount> characters = new ArrayList<>();

  public MultipleAccountController() {
    characters.add(new BankAccount("Simba", 8200, "zebra", "lion", true, "good one"));
    characters.add(new BankAccount("Timon", 1200, "spider", "meerkat", false, "good one"));
    characters.add(new BankAccount("Pumbaa", 4100, "rhizomes", "warthog", false, "good one"));
    characters.add(new BankAccount("Mufasa", 6500, "zebra", "lion", false, "good one"));
    characters.add(new BankAccount("Rafiki", 1300, "fruit", "mandrill",false, "good one"));
    characters.add(new BankAccount("Scar", 5000, "zebra", "lion",false, "bad guy"));
  }

  @GetMapping("/charactertable")
  public String characterTable(Model model){
    model.addAttribute("characterlist", characters);
    return "multiple";
  }

  @PostMapping("/charactertable")
  public String raise(@ModelAttribute BankAccount accounts, Model model){
    for (BankAccount account : characters) {
      if (account.isKing()) {
        account.setBalance(account.getBalance() + 100);
      } else {
        account.setBalance(account.getBalance() + 10);
      }
    }
    model.addAttribute("accountlist", characters);
    return "redirect:/charactertable";
  }
}
