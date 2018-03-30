package com.intellociplabs.rfq.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.intellociplabs.common.domain.Rfq;

public interface RfqRepository extends CrudRepository<Rfq, String>{

	Rfq findById(String id);
	
	@Transactional	
	@Modifying(clearAutomatically = true)
	@Query("update Rfq set isActive=0 where id=:id")
	void removeRfq(@Param("id") String id);
	
	@Query(" from Rfq where isActive=1  ORDER BY fullName ASC")
	Iterable<Rfq> findAll();
}
