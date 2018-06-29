package com.greenfoxacademy.foxclub.services;

import com.greenfoxacademy.foxclub.models.Fox;
import org.springframework.stereotype.Service;


public interface FoxService {

  void login(String name);

  Fox getFox(String name);

}