package com.eecs341.greeklife.MemberOf;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface MemberOfRepository extends CrudRepository<MemberOf, Integer> {
	@Query("SELECT m FROM MemberOf m")
	public List<MemberOf> findAll();
		
	/***************************************************************
	 * Basic Attribute queries: gets attributes of the given chapter	
	 ***************************************************************/
	
	/*****************************************************************************************
	 * Relation Queries: Gets chapter data based off of relationships with other tables/schema
	 *****************************************************************************************/	
}
