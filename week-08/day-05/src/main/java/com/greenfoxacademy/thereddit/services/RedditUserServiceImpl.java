package com.greenfoxacademy.thereddit.services;

import com.greenfoxacademy.thereddit.models.RedditUser;
import com.greenfoxacademy.thereddit.repositories.RedditUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RedditUserServiceImpl implements RedditUserService {
  @Autowired
  RedditUserRepository userRepository;

  @Override
  public void login(String name) {
    if (userRepository.findByUsername(name) == null){
      userRepository.save(new RedditUser(name));
    }
  }

  @Override
  public RedditUser getUser(String name) {
    return userRepository.findByUsername(name);
  }

}
