package com.greenfoxacademy.restday.models;

public class Appended {
  private String appended;

  public Appended(String word){
    this.appended = word + "a";
  }

  public String getAppended() {
    return appended;
  }

  public void setAppended(String appended) {
    this.appended = appended;
  }
}
