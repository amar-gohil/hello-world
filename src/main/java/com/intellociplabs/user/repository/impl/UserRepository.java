package com.intellociplabs.user.repository.impl;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.intellociplabs.common.domain.User;



public interface UserRepository extends CrudRepository<User, String>  {	 
	@Query("from User where email=:email and isActive=1")
	User findByEmail(@Param("email") String email);
	
	
	
}
