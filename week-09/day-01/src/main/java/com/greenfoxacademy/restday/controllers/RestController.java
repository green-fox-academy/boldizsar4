package com.greenfoxacademy.restday.controllers;

import com.greenfoxacademy.restday.models.Appended;
import com.greenfoxacademy.restday.models.Doubling;
import com.greenfoxacademy.restday.models.Error;
import com.greenfoxacademy.restday.models.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.web.bind.annotation.RestController
public class RestController {

  @GetMapping("/doubling")
  public Object doubling(@RequestParam(value = "input", required = false) Integer number) {
    if (number != null) {
      return new Doubling(number);
    } else {
      return new Error("Please provide an input!");
    }
  }

  @GetMapping("/greeter")
  public Object greeter(@RequestParam(value = "name", required = false) String name,
                        @RequestParam(value = "title", required = false) String title) {
    if (name == null) {
      return new Error("Please provide a name!");
    } if (title == null) {
        return new Error("Please provide a title!");
    }
    return new Greeting(name, title);
  }

  @GetMapping("/appenda/{appendable}")
  public Object appenda(@PathVariable(value = "appendable")String word){
    return new Appended(word);
  }
}
