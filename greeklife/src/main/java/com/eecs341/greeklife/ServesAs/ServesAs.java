package com.eecs341.greeklife.ServesAs;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="ServesAs")
public class ServesAs {

	@EmbeddedId
	private ServesAsId id;
	
	@Column(name="chapterName")
	private String chapterName;

	/**
	 * @return the id
	 */
	public ServesAsId getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(ServesAsId id) {
		this.id = id;
	}

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
}