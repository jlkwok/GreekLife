package com.eecs341.greeklife.MemberOf;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MemberOf")
public class MemberOf {
	@Id
	@Column(name="sid")
	private Integer sid;

	@Column(name="chapterName")
	private String chapterName;

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
	 * @return the chapter
	 */
	public String getChapter() {
		return chapterName;
	}

	/**
	 * @param chapter the chapter to set
	 */
	public void setChapterName(String chapterName) {
		this.chapterName = chapterName;
	};
}
