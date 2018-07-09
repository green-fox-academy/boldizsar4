package com.greenfoxacademy.restday.controllers;

import com.greenfoxacademy.restday.models.*;
import com.greenfoxacademy.restday.models.Error;
import org.springframework.web.bind.annotation.*;

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

  @PostMapping(value = "/dountil/{what}")
  public Object doUntil(@PathVariable(name = "what", required = false) String operation,
                        @RequestBody DoUntil doUntil) {
    if (doUntil != null && operation != null) {
      if (operation.equals("sum")) {
        return new DoUntilSum(doUntil.getUntil());
      } else if (operation.equals("factor")) {
        return new DoUntilFactor(doUntil.getUntil());
      }
    }
    if(doUntil == null){
      return new Error ("Please provide a number!");
    } else {
      return new Error("Please provide a number!");
    }
  }
}
