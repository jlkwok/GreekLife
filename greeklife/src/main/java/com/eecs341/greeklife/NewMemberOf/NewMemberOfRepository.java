package com.eecs341.greeklife.NewMemberOf;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


public interface NewMemberOfRepository extends CrudRepository<NewMemberOf, Integer>{
	@Query("SELECT n FROM NewMemberOf n")
	public List<NewMemberOf> findAll();
}
