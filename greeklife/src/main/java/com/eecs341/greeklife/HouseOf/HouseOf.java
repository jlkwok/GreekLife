package com.eecs341.greeklife.HouseOf;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="HouseOf")
public class HouseOf {
	@Id
	@Column(name="chapterName")
	private String chapterName;
	
	@Column(name="address")
	private String address;

	/**
	 * @return the chapterName
	 */
	public String getChapterName() {
		return chapterName;
	}

	/**
	 * @param chapterName the chapterName to set
	 */
	public void setChapterName(String chapterName) {
		this.chapterName = chapterName;
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
