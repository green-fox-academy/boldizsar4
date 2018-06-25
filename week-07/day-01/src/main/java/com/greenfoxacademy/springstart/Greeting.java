package com.greenfoxacademy.springstart;

public class Greeting {

  private long id;
  private String content;

  public long getId() {
    return id;
  }

  public long setId(long id) {
    return this.id++;
  }

  public String getContent() {
    return content;
  }

  public Greeting(long id, String content){
    this.id = id;
    this.content = content;
  }
}
