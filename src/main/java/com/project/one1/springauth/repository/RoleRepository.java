package com.project.one1.springauth.repository;

import com.project.one1.springauth.models.Role;
import com.project.one1.springauth.models.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface RoleRepository extends CrudRepository<Role, Long> {
    Optional<User> findFirstByRoleName(String roleName);
}
