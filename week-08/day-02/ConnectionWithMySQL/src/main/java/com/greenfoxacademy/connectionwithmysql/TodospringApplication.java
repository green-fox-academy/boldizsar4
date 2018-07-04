package com.greenfoxacademy.connectionwithmysql;

import com.greenfoxacademy.connectionwithmysql.models.Todo;
import com.greenfoxacademy.connectionwithmysql.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodospringApplication implements CommandLineRunner {
TodoRepository todoRepository;

@Autowired
public TodospringApplication(TodoRepository todoRepository){
  this.todoRepository = todoRepository;
}
  public static void main(String[] args) {
    SpringApplication.run(TodospringApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    todoRepository.save(new Todo("I have to learn Object Relational Mapping", false,true));
    todoRepository.save(new Todo("Evo a király", true, false));
    todoRepository.save(new Todo("Going to car service", false, true));
    todoRepository.save(new Todo("Buy food", false, false));
  }
}
