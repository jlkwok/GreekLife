package com.eecs341.greeklife.LivesIn;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="LivesIn")
public class LivesIn {

	@EmbeddedId
	private LivesInId id;
	
	@Column(name="address")
	private String address;

	/**
	 * @return the id
	 */
	public LivesInId getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(LivesInId id) {
		this.id = id;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
