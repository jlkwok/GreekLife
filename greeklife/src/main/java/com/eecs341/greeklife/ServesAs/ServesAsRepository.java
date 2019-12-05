package com.eecs341.greeklife.ServesAs;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ServesAsRepository extends CrudRepository<ServesAs, ServesAsId>{
	
	@Query("SELECT s FROM ServesAs s")
	public List<ServesAs> findAll();

}
