package com.greenfoxacademy.thereddit.models;

import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class PostList {

  private List<Post> posts;

  public List<Post> getPosts() {
    return posts;
  }

  public void setPosts(List<Post> posts) {
    this.posts = posts;
  }
}
