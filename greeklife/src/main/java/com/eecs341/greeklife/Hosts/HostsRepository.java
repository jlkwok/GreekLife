package com.eecs341.greeklife.Hosts;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


public interface HostsRepository extends CrudRepository<Hosts, HostsId>{
	@Query("SELECT h FROM Hosts h")
	public List<Hosts> findAll();
}
