package com.eecs341.greeklife.ChapterHouse;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ChapterHouse")
public class ChapterHouse {
	@Id
	@Column(name="address")
	private String address;
	
	@Column(name="campusLocation")
	private String campusLocation;
	
	@Column(name="maxOccupancy")
	private Integer maxOccupancy;
	
	@Column(name="mealPlanService")
	private String mealPlanService;
	
	@Column(name="isAvailableInSummer")
	private boolean isAvailableInSummer;

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

	/**
	 * @return the campusLocation
	 */
	public String getCampusLocation() {
		return campusLocation;
	}

	/**
	 * @param campusLocation the campusLocation to set
	 */
	public void setCampusLocation(String campusLocation) {
		this.campusLocation = campusLocation;
	}

	/**
	 * @return the maxOccupancy
	 */
	public Integer getMaxOccupancy() {
		return maxOccupancy;
	}

	/**
	 * @param maxOccupancy the maxOccupancy to set
	 */
	public void setMaxOccupancy(Integer maxOccupancy) {
		this.maxOccupancy = maxOccupancy;
	}

	/**
	 * @return the mealPlanService
	 */
	public String getMealPlanService() {
		return mealPlanService;
	}

	/**
	 * @param mealPlanService the mealPlanService to set
	 */
	public void setMealPlanService(String mealPlanService) {
		this.mealPlanService = mealPlanService;
	}

	/**
	 * @return the isAvailableInSummer
	 */
	public boolean isAvailableInSummer() {
		return isAvailableInSummer;
	}

	/**
	 * @param isAvailableInSummer the isAvailableInSummer to set
	 */
	public void setAvailableInSummer(boolean isAvailableInSummer) {
		this.isAvailableInSummer = isAvailableInSummer;
	}
}
