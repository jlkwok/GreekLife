package com.eecs341.greeklife.Philanthropy;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.eecs341.greeklife.Chapter.Chapter;

public interface PhilanthropyRepository extends CrudRepository<Philanthropy, PhilanthropyId> {
	@Query("SELECT p FROM Philanthropy p")
	public List<Philanthropy> findAll();
		
	/***************************************************************
	 * Basic Attribute queries: gets attributes of the given Philanthropy	
	 ***************************************************************/
	@Query("SELECT p.cause FROM Philanthropy p WHERE p.id.eventName=?1 AND p.id.date=?2")
	public String getCause(String eventName, String date);
	
	@Query("SELECT p.partner FROM Philanthropy p WHERE p.id.eventName=?1 AND p.id.date=?2")
	public String getPartner(String eventName, String date);	
	
	@Query("SELECT p.moneyRaised FROM Philanthropy p WHERE p.id.eventName=?1 AND p.id.date=?2")
	public Double getMoneyRaised(String eventName, String date);
	
	@Query("SELECT p.ticketPrice FROM Philanthropy p WHERE p.id.eventName=?1 AND p.id.date=?2")
	public Double getTicketPrice(String eventName, String date);
	
	@Query("SELECT p.totalAttendance FROM Philanthropy p WHERE p.id.eventName=?1 AND p.id.date=?2")
	public Integer getTotalAttendance(String eventName, String date);
	
	@Query("SELECT p.budget FROM Philanthropy p WHERE p.id.eventName=?1 AND p.id.date=?2")
	public  Double getBudget(String eventName, String date);
	
	@Query("SELECT p.location FROM Philanthropy p WHERE p.id.eventName=?1 AND p.id.date=?2")
	public String getLocation(String eventName, String date);
		
	/**********************************************************************************************
	 * Relation Queries: Gets Philanthropy data based off of relationships with other tables/schema
	 **********************************************************************************************/	
	@Query("SELECT c FROM Hosts h, Chapter c WHERE h.id.eventName=?1 AND h.id.date=?2 AND h.id.chapterName=c.chapterName")
	public List<Chapter> getHostChapters(String eventName, String date);
	
}
