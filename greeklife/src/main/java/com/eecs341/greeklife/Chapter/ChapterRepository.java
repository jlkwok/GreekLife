package com.eecs341.greeklife.Chapter;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface ChapterRepository extends CrudRepository<Chapter, Integer> {
	@Query("SELECT c FROM Chapter c")
	public List<Chapter> findAll();
		
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
}
