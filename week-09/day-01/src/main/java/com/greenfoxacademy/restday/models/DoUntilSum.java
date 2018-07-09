package com.greenfoxacademy.restday.models;

public class DoUntilSum {
  private int result = 0;

  public DoUntilSum(int until) {
    for (int i = 1; i <= until; i++) {
      this.result += i;
    }
  }

  public DoUntilSum() {
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }
}