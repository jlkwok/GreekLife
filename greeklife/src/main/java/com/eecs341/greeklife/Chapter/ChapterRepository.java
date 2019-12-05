package com.eecs341.greeklife.Chapter;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.eecs341.greeklife.ChapterHouse.ChapterHouse;
import com.eecs341.greeklife.ChapterMember.ChapterMember;
import com.eecs341.greeklife.Philanthropy.Philanthropy;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface ChapterRepository extends CrudRepository<Chapter, String> {
	@Query("SELECT c FROM Chapter c")
	public List<Chapter> findAll();
		
	/***************************************************************
	 * Basic Attribute queries: gets attributes of the given chapter	
	 ***************************************************************/
	@Query("SELECT c.governingBody FROM Chapter c WHERE c.chapterName=?1")
	public GoverningBody getGoverningBody(String chapterName);
	
	@Query("SELECT c.localFoundingDate FROM Chapter c WHERE c.chapterName=?1")
	public String getLocalFoundingDate(String chapterName);
	
	@Query("SELECT c.nationalFoundingDate FROM Chapter c WHERE c.chapterName=?1")
	public String getNationalFoundingDate(String chapterName);
	
	@Query("SELECT c.nationalDesignation FROM Chapter c WHERE c.chapterName=?1")
	public Double getNationalDesignation(String chapterName);	
	
	@Query("SELECT c.dues FROM Chapter c WHERE c.chapterName=?1")
	public Double getDues(String chapterName);	
	
	/*****************************************************************************************
	 * Relation Queries: Gets chapter data based off of relationships with other tables/schema
	 *****************************************************************************************/	
	
	@Query("SELECT m FROM Chapter c, MemberOf o, ChapterMember m WHERE m.sid=o.sid AND o.id.chapterName=c.chapterName and c.chapterName=?1")
	public List<ChapterMember> getMembers(String chapterName);
	
	@Query("SELECT h FROM Chapter c, HouseOf o, ChapterHouse h WHERE h.address=o.address AND o.chapterName=c.chapterName and c.chapterName=?1")
	public ChapterHouse getHouse(String chapterName);
	
	@Query("SELECT p FROM Chapter c, Hosts h, Philanthropy p WHERE p.id.eventName=h.id.eventName AND p.id.date=h.id.date AND h.id.chapterName=c.chapterName and c.chapterName=?1")
	public List<Philanthropy> getPhilanthropy(String chapterName);	
	
	@Query("SELECT m FROM Chapter c, ServesAs s, ChapterMember m WHERE m.sid=s.id.sid AND s.chapterName=c.chapterName and c.chapterName=?1")
	public List<ChapterMember> getExecBoard(String chapterName);
	
	/***********************************************************************
	 * Advanced Queries: Gets chapter data on more advanced analysis/queries
	 ***********************************************************************/	
	
	@Query("SELECT COUNT(m) FROM Chapter c, MemberOf o, ChapterMember m WHERE m.sid=o.sid AND o.chapterName=c.chapterName and c.chapterName=?1")
	public Integer getMemberCount(String chapterName);
	
	@Query("SELECT AVG(m.gpa) FROM Chapter c, MemberOf o, ChapterMember m WHERE m.sid=o.sid AND o.chapterName=c.chapterName and c.chapterName=?1")
	public Double getAverageGpa(String chapterName);
	
	@Query("SELECT c FROM Chapter c WHERE NOT EXISTS (SELECT m FROM ChapterMember m, MemberOf o WHERE o.chapterName=c.chapterName AND o.sid=m.sid AND m.gpa<?1)")
	public List<Chapter> getChaptersWithMinGpa(Double gpa);
	
	@Query("SELECT c FROM Chapter c WHERE (SELECT AVG(m.gpa) FROM ChapterMember m, MemberOf o WHERE o.chapterName=c.chapterName AND o.sid=m.sid)>?1")
	public List<Chapter> getChaptersWithAverageGpa(Double gpa);
	
	@Query(value = "SELECT * FROM chapter c "
			+ "WHERE NOT EXISTS (SELECT o.sid FROM member_of o, chapter_member m WHERE o.sid=m.sid AND o.chapter_name=c.chapter_name AND o.sid NOT IN "
			+ "(SELECT l.sid FROM lives_in l, house_of h WHERE l.year=m.year AND l.sid=m.sid AND l.address=h.address AND h.chapter_name=c.chapter_name));", 
			nativeQuery=true)
	public List<Chapter> getChaptersWithAllMembersInHouse();
	

}
