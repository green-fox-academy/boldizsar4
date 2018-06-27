package com.greenfoxacademy.webapplication;

import com.greenfoxacademy.webapplication.interfaces.MyColor;
import com.greenfoxacademy.webapplication.services.BlueColor;
import com.greenfoxacademy.webapplication.services.Printer;
import com.greenfoxacademy.webapplication.services.RedColor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebapplicationApplication implements CommandLineRunner {
  
  @Autowired
  Printer printer;
  @Autowired
  MyColor color;

  public static void main(String[] args) {
    SpringApplication.run(WebapplicationApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    printer.log("hello");
    color.printColor();
  }
}
