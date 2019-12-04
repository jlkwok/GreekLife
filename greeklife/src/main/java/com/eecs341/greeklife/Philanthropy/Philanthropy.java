package com.eecs341.greeklife.Philanthropy;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Philanthropy")
public class Philanthropy {
	
	@EmbeddedId
	private PhilanthropyId id;

	@Column(name="cause")
	private String cause;;

	@Column(name="partner")
	private String partner;
	
	@Column(name="moneyRaised")
	private Double moneyRaised;
	
	@Column(name="ticketPrice")
	private Double ticketPrice;
	
	@Column(name="totalAttendance")
	private Integer totalAttendance;
	
	@Column(name="budget")
	private Double budget;
	
	@Column(name="location")
	private String location;

	/**
	 * @return the id
	 */
	public PhilanthropyId getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(PhilanthropyId id) {
		this.id = id;
	}

	/**
	 * @return the cause
	 */
	public String getCause() {
		return cause;
	}

	/**
	 * @param cause the cause to set
	 */
	public void setCause(String cause) {
		this.cause = cause;
	}

	/**
	 * @return the partner
	 */
	public String getPartner() {
		return partner;
	}

	/**
	 * @param partner the partner to set
	 */
	public void setPartner(String partner) {
		this.partner = partner;
	}

	/**
	 * @return the moneyRaised
	 */
	public Double getMoneyRaised() {
		return moneyRaised;
	}

	/**
	 * @param moneyRaised the moneyRaised to set
	 */
	public void setMoneyRaised(Double moneyRaised) {
		this.moneyRaised = moneyRaised;
	}

	/**
	 * @return the ticketPrice
	 */
	public Double getTicketPrice() {
		return ticketPrice;
	}

	/**
	 * @param ticketPrice the ticketPrice to set
	 */
	public void setTicketPrice(Double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	/**
	 * @return the totalAttendance
	 */
	public Integer getTotalAttendance() {
		return totalAttendance;
	}

	/**
	 * @param totalAttendance the totalAttendance to set
	 */
	public void setTotalAttendance(Integer totalAttendance) {
		this.totalAttendance = totalAttendance;
	}

	/**
	 * @return the budget
	 */
	public Double getBudget() {
		return budget;
	}

	/**
	 * @param budget the budget to set
	 */
	public void setBudget(Double budget) {
		this.budget = budget;
	}

	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}
	
	
	
}
