package com.eecs341.greeklife.Chapter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Chapter")
public class Chapter {
	@Id
	@Column(name="chapterName")
	private String chapterName;

	@Column(name="governingBody")
	private GoverningBody governingBody;;

	@Column(name="nationalFoundingDate")
	private String nationalFoundingDate;
	
	@Column(name="localFoundingDate")
	private String localFoundingDate;
	
	@Column(name="nationalDesignation")
	private Integer nationalDesignation;
	
	@Column(name="dues")
	private Double dues;

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
	 * @return the governingBody
	 */
	public GoverningBody getGoverningBody() {
		return governingBody;
	}

	/**
	 * @param governingBody the governingBody to set
	 */
	public void setGoverningBody(GoverningBody governingBody) {
		this.governingBody = governingBody;
	}

	/**
	 * @return the nationalFoundingDate
	 */
	public String getNationalFoundingDate() {
		return nationalFoundingDate;
	}

	/**
	 * @param nationalFoundingDate the nationalFoundingDate to set
	 */
	public void setNationalFoundingDate(String nationalFoundingDate) {
		this.nationalFoundingDate = nationalFoundingDate;
	}

	/**
	 * @return the localFoundingDate
	 */
	public String getLocalFoundingDate() {
		return localFoundingDate;
	}

	/**
	 * @param localFoundingDate the localFoundingDate to set
	 */
	public void setLocalFoundingDate(String localFoundingDate) {
		this.localFoundingDate = localFoundingDate;
	}

	/**
	 * @return the nationalDesignation
	 */
	public Integer getNationalDesignation() {
		return nationalDesignation;
	}

	/**
	 * @param nationalDesignation the nationalDesignation to set
	 */
	public void setNationalDesignation(Integer nationalDesignation) {
		this.nationalDesignation = nationalDesignation;
	}

	/**
	 * @return the dues
	 */
	public Double getDues() {
		return dues;
	}

	/**
	 * @param dues the dues to set
	 */
	public void setDues(Double dues) {
		this.dues = dues;
	}
	
	
}
