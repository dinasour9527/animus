package com.animus.user.config;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
		.headers().frameOptions().sameOrigin().and()
		.formLogin().and()
		.authorizeRequests()
			.antMatchers("/demo").authenticated()
			.antMatchers("/demo/1").authenticated()
			.antMatchers("/").permitAll()
			.antMatchers("/main").permitAll();
	}

	@Override
	public void configure(WebSecurity web) throws Exception {
		web.ignoring()
			.antMatchers("/css/**")
			.antMatchers("/js/**")
			.antMatchers("/lib/**")
			.antMatchers("/img/**");
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth
		.inMemoryAuthentication()
			.withUser("admin").password("admin").roles("ADMIN");
	}
	
}
