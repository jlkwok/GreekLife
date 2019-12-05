package com.eecs341.greeklife.ChapterHouse;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.eecs341.greeklife.ChapterMember.ChapterMember;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface ChapterHouseRepository extends CrudRepository<ChapterHouse, String> {
	@Query("SELECT h FROM ChapterHouse h")
	public List<ChapterHouse> findAll();
		
	/*********************************************************************
	 * Basic Attribute queries: gets attributes of the given chapter house	
	 *********************************************************************/
	@Query("SELECT h.address FROM ChapterHouse h, HouseOf o WHERE o.chapterName=?1 AND o.address=h.address")
	public String getAddress(String chapterName);
	
	@Query("SELECT h.campusLocation FROM ChapterHouse h, HouseOf o WHERE o.chapterName=?1 AND o.address=h.address")
	public String getCampusLocation(String chapterName);
	
	@Query("SELECT h.maxOccupancy FROM ChapterHouse h, HouseOf o WHERE o.chapterName=?1 AND o.address=h.address")
	public Integer getMaxOccupancy(String chapterName);
	
	@Query("SELECT h.mealPlanService FROM ChapterHouse h, HouseOf o WHERE o.chapterName=?1 AND o.address=h.address")
	public String getMealPlanService(String chapterName);
	
	@Query("SELECT h.isAvailableInSummer FROM ChapterHouse h, HouseOf o WHERE o.chapterName=?1 AND o.address=h.address")
	public boolean isAvailableInSummer(String chapterName);
	
	/************************************************************************************************
	 * Relation Queries: Gets chapter house  data based off of relationships with other tables/schema
	 ************************************************************************************************/	
	@Query("SELECT m FROM ChapterMember m, LivesIn l WHERE l.chapterName=?1 AND l.sid=m.sid")
	public List<ChapterMember> getMembersLivingIn(String chapterName);
	
	

	
}
