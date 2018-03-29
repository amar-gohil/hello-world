package com.intellociplabs.product.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.intellociplabs.common.domain.Product;

public interface ProductRepository extends CrudRepository<Product, String>{

	Product findById(String id);
	
	@Transactional	
	@Modifying(clearAutomatically = true)
	@Query("update Product set isActive=0 where id=:id")
	void removeProduct(@Param("id") String id);
	
	@Query(" from Product where isActive=1  ORDER BY name ASC")
	Iterable<Product> findAll();
}
