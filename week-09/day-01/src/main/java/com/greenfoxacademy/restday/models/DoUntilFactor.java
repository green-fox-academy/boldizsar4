package com.greenfoxacademy.restday.models;

public class DoUntilFactor {
  private int result = 1;

  public DoUntilFactor(int until) {
    for (int i = 1; i <= until; i++) {
      this.result *= i;
    }
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }
}