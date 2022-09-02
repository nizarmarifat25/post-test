package com.posttest.models.repos;

import org.springframework.data.repository.CrudRepository;

import com.posttest.models.entity.User;

public interface UserRepo extends CrudRepository<User, Long> {
    
    List<User> findByNameContains(String name);
}
