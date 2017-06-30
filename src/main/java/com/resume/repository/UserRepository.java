package com.resume.repository;

import com.resume.model.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by raya on 6/30/17.
 */
public interface UserRepository extends CrudRepository<User, Integer> {
    User findByUsername(String username);
}
