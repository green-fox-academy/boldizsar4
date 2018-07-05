package com.greenfoxacademy.thereddit.controllers.services;

import com.greenfoxacademy.thereddit.models.RedditUser;
import com.greenfoxacademy.thereddit.repositories.RedditUserRepository;
import org.springframework.stereotype.Service;

@Service
public class RedditUserServiceImpl implements RedditUserService {

  RedditUserRepository userRepository;

  @Override
  public void login(String name) {
    if (userRepository.findById(name) == null){
      userRepository.save(new RedditUser(name));
    }
  }
}
