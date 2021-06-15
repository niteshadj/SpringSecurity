package com.nitesh.learn.spring.security.security;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

//@EnableWebSecurity
public class InMemorySecurityConfigurator extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// TODO Auto-generated method stub
		// super.configure(auth);
		auth.inMemoryAuthentication().passwordEncoder(new BCryptPasswordEncoder(4)).withUser("nitesh")
				.password("$2y$04$c8EN.lM6EucFyt/Y/k7IAOLxTgKtdxqrJ2HJqYXKbAuU6cas8PodW").roles("User").and()
				.withUser("Admin").password("$2y$04$c8EN.lM6EucFyt/Y/k7IAOLxTgKtdxqrJ2HJqYXKbAuU6cas8PodW")
				.roles("Admin");

	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.authorizeRequests().antMatchers("/admin").hasAnyRole("Admin").antMatchers("/user")
				.hasAnyRole("User", "Admin").antMatchers("/").permitAll().and().formLogin();
	}

}
