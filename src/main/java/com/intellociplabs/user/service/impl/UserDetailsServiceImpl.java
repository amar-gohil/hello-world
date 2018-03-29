package com.intellociplabs.user.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.intellociplabs.common.domain.User;
import com.intellociplabs.user.repository.impl.UserRepository;


@Service(value = "userDetailsService")

public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String input) {
		
		User user = new User();
		user = userRepository.findByEmail(input);
		if (user == null)
		throw new UsernameNotFoundException("Incorrect username, password or admin id.");
		List<GrantedAuthority> authorities = new ArrayList<>();        
        authorities.add(new SimpleGrantedAuthority("ROLE"));            
        UserDetails userDetails = new org.springframework.security.core.userdetails.
                User(user.getEmail(), user.getPassword(), authorities);
		return userDetails;
	}
	
	

}