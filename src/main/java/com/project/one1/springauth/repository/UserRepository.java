package com.project.one1.springauth.repository;

import com.project.one1.springauth.models.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Long> {
    Optional<User> findFirstByEmail(String email);
}
