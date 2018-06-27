package com.greenfoxacademy.webapplication.services;

import com.greenfoxacademy.webapplication.interfaces.MyColor;

public class RedColor implements MyColor {
  @Override
  public void printColor() {
    System.out.println("It is red color...");
  }
}
