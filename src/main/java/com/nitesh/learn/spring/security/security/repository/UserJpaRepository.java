package com.nitesh.learn.spring.security.security.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nitesh.learn.spring.security.security.model.User;

@Repository
public interface UserJpaRepository extends JpaRepository<User, Integer> {

	Optional<User> findByUserName(String userName);

}
