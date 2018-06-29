package com.greenfoxacademy.foxclub.services;

import com.greenfoxacademy.foxclub.models.Fox;
import com.greenfoxacademy.foxclub.repositories.FoxRepo;
import com.greenfoxacademy.foxclub.repositories.FoxRepoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoxServiceImpl implements FoxService{
  FoxRepo foxRepo;
  @Autowired
  public FoxServiceImpl(FoxRepoImpl foxRepo) {
    this.foxRepo = foxRepo;
  }

  @Override
  public void login(String name) {
    if (foxRepo.finOneById(name) == null) {
      foxRepo.save(new Fox(name));
    }
  }

  @Override
  public Fox getFox(String name) {
    return foxRepo.finOneById(name);

  }
}