package com.carlos.userpost.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.carlos.userpost.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
}
