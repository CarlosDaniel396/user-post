package com.carlos.userpost.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.carlos.userpost.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
}
