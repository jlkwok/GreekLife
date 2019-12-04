package com.eecs341.greeklife.ChapterMember;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ChapterMember")
public class ChapterMember {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="sid")
	private Integer sid;
	
	@Column(name="name")
	private String name;
	
	@Column(name="year")
	private Standing year;
	
	@Column(name="joinDate")
	private String joinDate;
	
	@Column(name="badgeNumber")
	private Integer badgeNumber;
	
	@Column(name="major")
	private String major;
	
	@Column(name="gpa")
	private Double gpa;

	/**
	 * @return the sid
	 */
	public Integer getSid() {
		return sid;
	}

	/**
	 * @param sid the sid to set
	 */
	public void setSid(Integer sid) {
		this.sid = sid;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the year
	 */
	public Standing getYear() {
		return year;
	}

	/**
	 * @param year the year to set
	 */
	public void setYear(Standing year) {
		this.year = year;
	}

	/**
	 * @return the joinDate
	 */
	public String getJoinDate() {
		return joinDate;
	}

	/**
	 * @param joinDate the joinDate to set
	 */
	public void setJoinDate(String joinDate) {
		this.joinDate = joinDate;
	}

	/**
	 * @return the badgeNumber
	 */
	public Integer getBadgeNumber() {
		return badgeNumber;
	}

	/**
	 * @param badgeNumber the badgeNumber to set
	 */
	public void setBadgeNumber(Integer badgeNumber) {
		this.badgeNumber = badgeNumber;
	}

	/**
	 * @return the major
	 */
	public String getMajor() {
		return major;
	}

	/**
	 * @param major the major to set
	 */
	public void setMajor(String major) {
		this.major = major;
	}

	/**
	 * @return the gpa
	 */
	public Double getGpa() {
		return gpa;
	}

	/**
	 * @param gpa the gpa to set
	 */
	public void setGpa(Double gpa) {
		this.gpa = gpa;
	}
	
}
