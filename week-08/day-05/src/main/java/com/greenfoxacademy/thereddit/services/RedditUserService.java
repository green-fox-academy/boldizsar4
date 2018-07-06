package com.greenfoxacademy.thereddit.services;

import com.greenfoxacademy.thereddit.models.RedditUser;

public interface RedditUserService {
  void login(String name);
  RedditUser getUser(String name);
}
