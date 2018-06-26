package com.greenfoxacademy.bankofsimba.controllers;
import com.greenfoxacademy.bankofsimba.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BankAccountController {

  BankAccount account;

  @GetMapping("/show")
  public String showBankAccount(Model model){
    account = new BankAccount("Simba", 2000, "lion");
    model.addAttribute("account", account);
    return "show";
  }
}
