package com.greenfoxacademy.helloworld;

public class Greeting {

  private long id = 1;
  private String content = "Hello World!";

  public long getId() {
    return id;
  }

  public String getContent() {
    return content;
  }
  public Greeting(long id, String content){
    id = this.id;
    content = this.content;
  }
}
