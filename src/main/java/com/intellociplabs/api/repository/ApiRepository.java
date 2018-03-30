package com.intellociplabs.api.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.intellociplabs.common.domain.Api;
import com.intellociplabs.common.domain.Product;

public interface ApiRepository extends CrudRepository<Api, String>{

	Api findById(String id);
	
	@Transactional	
	@Modifying(clearAutomatically = true)
	@Query("update Api set isActive=0 where id=:id")
	void removeApi(@Param("id") String id);
	
	@Query(" from Api where isActive=1  ORDER BY name ASC")
	Iterable<Api> findAll();
}
