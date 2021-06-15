package com.nitesh.learn.spring.security.security.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.nitesh.learn.spring.security.security.model.MyUserDetails;
import com.nitesh.learn.spring.security.security.model.User;
import com.nitesh.learn.spring.security.security.repository.UserJpaRepository;

@Service
public class MyUserDetailService implements UserDetailsService {

	@Autowired
	UserJpaRepository userJpaRepo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<User> user = userJpaRepo.findByUserName(username);
		user.orElseThrow(() -> new UsernameNotFoundException("User not found with name " + username));
		return new MyUserDetails(user.get());
	}

}
