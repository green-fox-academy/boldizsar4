package com.greenfoxacademy.thereddit.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RedditUser {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String username;

  public RedditUser(){}

  public RedditUser(String username) {
    this.username = username;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }
}
