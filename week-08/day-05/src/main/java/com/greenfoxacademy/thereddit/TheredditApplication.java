package com.greenfoxacademy.thereddit;

import com.greenfoxacademy.thereddit.models.Post;
import com.greenfoxacademy.thereddit.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TheredditApplication implements CommandLineRunner {

  @Autowired
  PostRepository postRepository;
  public static void main(String[] args) {
    SpringApplication.run(TheredditApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    Post post1 = new Post("Hello World","sdfdgh.com");
    postRepository.save(post1);
  }
}
