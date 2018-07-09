package com.greenfoxacademy.restday.controllers;

import com.greenfoxacademy.restday.models.Doubling;
import com.greenfoxacademy.restday.models.Error;
import com.greenfoxacademy.restday.models.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.web.bind.annotation.RestController
public class RestController {

  @GetMapping(value = "/doubling")
  public Object doubling(@RequestParam(value = "input") Integer number) {
    if (number != null) {
      return new Doubling(number);
    } else {
      return new Error("Please provide an input!");
    }
  }

  @GetMapping(value = "/greeter")
  public Object greeter(@RequestParam(value = "name") String name,
                        @RequestParam(value = "title") String title) {
    if (name != null) {
      return new Greeting(name, title);
    } else if (title == null) {
      return new Error("Please provide a title!");
    } else {
      return new Error("Please provide a name!");
    }
  }
}
