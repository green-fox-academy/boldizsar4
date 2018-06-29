package com.greenfoxacademy.foxclub.repositories;

import com.greenfoxacademy.foxclub.models.Fox;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
@Component
public class FoxRepoImpl implements FoxRepo {
  private Map<String, Fox> foxes;

  public FoxRepoImpl() {
    foxes = new HashMap<>();
  }

  public Fox finOneById(String username) {
    return foxes.get(username);
  }

  public void save(Fox fox) {
    foxes.put(fox.getName(), fox);
  }

}
