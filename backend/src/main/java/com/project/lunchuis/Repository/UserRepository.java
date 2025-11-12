package com.project.lunchuis.Repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.project.lunchuis.Model.User;

public interface UserRepository extends MongoRepository<User, String> {
    Optional<User> findByCodeAndPassword(String code, String password);
}
