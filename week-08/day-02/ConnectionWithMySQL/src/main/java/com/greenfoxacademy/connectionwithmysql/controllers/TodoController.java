package com.greenfoxacademy.connectionwithmysql.controllers;

import com.greenfoxacademy.connectionwithmysql.models.Todo;
import com.greenfoxacademy.connectionwithmysql.repositories.TodoRepository;
import com.greenfoxacademy.connectionwithmysql.services.TodoService;
import com.greenfoxacademy.connectionwithmysql.services.TodoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/todo")
public class TodoController {

  @Autowired
  TodoRepository todoRepository;

  @GetMapping(value = {"/", "/list"})
  public String list (Model model) {
    model.addAttribute("todos", todoRepository.findAll());
    return "todoslist";
  }

  @GetMapping("/active")
  public String getActiveTodos(Model model) {
    model.addAttribute("done", todoRepository.findAllByDoneFalse());
    return "active";
  }

  @GetMapping("/add")
  public String renderAddPage(Model model){
    model.addAttribute("newTodo", new Todo());
    return "add";
  }

  @PostMapping("/add")
  public String addTodo(@ModelAttribute Todo todo){
    todoRepository.save(todo);
    return "redirect:/todo/";
  }
}
