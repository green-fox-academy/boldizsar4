package com.greenfoxacademy.connectionwithmysql.controllers;

import com.greenfoxacademy.connectionwithmysql.models.Todo;
import com.greenfoxacademy.connectionwithmysql.repositories.TodoRepository;
import com.greenfoxacademy.connectionwithmysql.services.TodoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/todo")
public class TodoController {
TodoServiceImpl todoService;
  @Autowired
  TodoRepository todoRepository;

  @Autowired
  public TodoController(TodoServiceImpl todoService){
    this.todoService = todoService;
  }

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
  public String renderAddPage(Model model) {
    model.addAttribute("newTodo", new Todo());
    return "add";
  }

  @PostMapping("/add")
  public String addTodo(@ModelAttribute Todo todo) {
    todoRepository.save(todo);
    return "redirect:/todo/";
  }

  @PostMapping("/delete")
  public String delete(@RequestParam(value = "id") long id) {
    todoRepository.deleteById(id);
    return "redirect:/todo/";
  }
}
