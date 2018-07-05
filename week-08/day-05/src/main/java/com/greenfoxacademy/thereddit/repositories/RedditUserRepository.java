package com.greenfoxacademy.thereddit.repositories;

import com.greenfoxacademy.thereddit.models.RedditUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RedditUserRepository extends CrudRepository<RedditUser, Long> {
}
