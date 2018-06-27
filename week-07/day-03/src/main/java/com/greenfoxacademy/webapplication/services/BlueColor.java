package com.greenfoxacademy.webapplication.services;

import com.greenfoxacademy.webapplication.interfaces.MyColor;
import org.springframework.stereotype.Service;

@Service
public class BlueColor implements MyColor {
  @Override
  public void printColor() {
    System.out.println("It is blue color...");
  }
}
