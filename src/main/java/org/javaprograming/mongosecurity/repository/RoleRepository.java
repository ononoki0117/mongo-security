package org.javaprograming.mongosecurity.repository;

import org.javaprograming.mongosecurity.models.ERole;
import org.javaprograming.mongosecurity.models.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface RoleRepository extends MongoRepository<Role, String> {
    Optional<Role> findByName(ERole name);
}
