package com.greenfoxacademy.thereddit.repositories;

import com.greenfoxacademy.thereddit.models.Post;
import com.greenfoxacademy.thereddit.models.RedditUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends CrudRepository<Post, Long> {
}
