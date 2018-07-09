package com.greenfoxacademy.restday.models;

public class Greeting {
  private String greeting;

  public Greeting(String name, String title) {
    this.greeting = "Oh, hi there " + name + " my dear " + title + "!";
  }

  public String getGreeting() {
    return greeting;
  }

  public void setGreeting(String greeting) {
    this.greeting = greeting;
  }
}
