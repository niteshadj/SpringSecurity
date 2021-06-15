package com.nitesh.learn.spring.security.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.nitesh.learn.spring.security.security.repository.UserJpaRepository;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserJpaRepository.class)
public class SecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecurityApplication.class, args);
	}

}
