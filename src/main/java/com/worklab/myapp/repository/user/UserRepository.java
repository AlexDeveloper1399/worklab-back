package com.worklab.myapp.repository.user;

import com.worklab.myapp.dto.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User,Long> {
    Optional<User> findByEmail(String email);
    User findByUsername(String email);
    User findByName(String name);
    User findByGoogleUsername(String googleUsername);
    User findByGoogleName(String googleName);
}
