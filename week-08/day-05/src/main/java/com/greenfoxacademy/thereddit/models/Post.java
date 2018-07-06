package com.greenfoxacademy.thereddit.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

@Entity
public class Post {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String title;
  private String url;
  private int vote;
  private long score;


  public Post(){}

  public Post(String title) {
    this.title = title;
  }

  public Post(String title, String url) {
    this.title = title;
    this.url = url;
  }

  public long getId() {
    return id;
  }
  public void voteUp() {
    score++;
  }

  public void voteDown() {
    score--;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public int getVote() {
    return vote;
  }

  public void setVote(int vote) {
    this.vote = vote;
  }

  public long getScore() {
    return score;
  }

  public void setScore(long score) {
    this.score = score;
  }
}
