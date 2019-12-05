package com.eecs341.greeklife.ChapterMember;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.eecs341.greeklife.ChapterHouse.ChapterHouse;
import com.eecs341.greeklife.ServesAs.ServesAs;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface ChapterMemberRepository extends CrudRepository<ChapterMember, Integer> {
	@Query("SELECT m FROM ChapterMember m")
	public List<ChapterMember> findAll();
		
	/***************************************************************
	 * Basic Attribute queries: gets attributes of the given chapter	
	 ***************************************************************/
	@Query("SELECT m.name FROM ChapterMember m WHERE m.sid=?1")
	public String getName(Integer sid);
	
	@Query("SELECT m.year FROM ChapterMember m WHERE m.sid=?1")
	public Standing getYear(Integer sid);
	
	@Query("SELECT m.joinDate FROM ChapterMember m WHERE m.sid=?1")
	public String getJoinDate(Integer sid);
	
	@Query("SELECT m.badgeNumber FROM ChapterMember m WHERE m.sid=?1")
	public Integer getBadgeNumber(Integer sid);
	
	@Query("SELECT m.major FROM ChapterMember m WHERE m.sid=?1")
	public String getMajor(Integer sid);
	
	@Query("SELECT m.gpa FROM ChapterMember m WHERE m.sid=?1")
	public Double getGPA(Integer sid);

	/*****************************************************************************************
	 * Relation Queries: Gets chapter data based off of relationships with other tables/schema
	 *****************************************************************************************/
	@Query("SELECT l.address FROM ChapterMember m, LivesIn l WHERE l.id.sid=m.sid AND l.id.year=m.year AND m.sid=?1")
	public String getLivingLocation(Integer sid);
	
	@Query("SELECT s.id.position FROM ServesAs s WHERE s.id.sid=?1")
	public List<ServesAs> getExecPositions(Integer sid);	
}
