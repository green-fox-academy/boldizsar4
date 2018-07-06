package com.greenfoxacademy.thereddit.controllers;

import com.greenfoxacademy.thereddit.models.Post;
import com.greenfoxacademy.thereddit.repositories.PostRepository;
import com.greenfoxacademy.thereddit.services.RedditUserService;
import com.greenfoxacademy.thereddit.repositories.RedditUserRepository;
import com.greenfoxacademy.thereddit.services.RedditUserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AppController {
  @Autowired
  RedditUserService userService;
  @Autowired
  PostRepository postRepository;
  @GetMapping("")
  public String renderLoginPage(){
    return "login";
  }

  @PostMapping("/login")
  public String login(@ModelAttribute(value = "name") String name){
    userService.login(name);
    return "redirect:/posts";
  }

  @GetMapping("/posts")
  public String renderIndexPage(Model model){
    model.addAttribute("posts", postRepository.findAll());
    return "index";
  }

  @GetMapping("/add")
  public String renderAddPage(Model model){
    model.addAttribute("post", new Post());
    return "add";
  }
}
