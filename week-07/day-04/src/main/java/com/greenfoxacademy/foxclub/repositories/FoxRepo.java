package com.greenfoxacademy.foxclub.repositories;

import com.greenfoxacademy.foxclub.models.Fox;

public interface FoxRepo {
  Fox finOneById(String username);
  void save(Fox fox);
}
