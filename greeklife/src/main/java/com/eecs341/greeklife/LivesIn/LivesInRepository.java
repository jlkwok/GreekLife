package com.eecs341.greeklife.LivesIn;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface LivesInRepository extends CrudRepository<LivesIn, LivesInId> {
	@Query("SELECT l FROM LivesIn l")
	public List<LivesIn> findAll();
		
	/***************************************************************
	 * Basic Attribute queries: gets attributes of the given chapter	
	 ***************************************************************/
	
	/*****************************************************************************************
	 * Relation Queries: Gets chapter data based off of relationships with other tables/schema
	 *****************************************************************************************/	
}
