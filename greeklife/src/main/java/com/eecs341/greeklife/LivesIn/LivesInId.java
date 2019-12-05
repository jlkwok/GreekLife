package com.eecs341.greeklife.LivesIn;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import com.eecs341.greeklife.ChapterMember.Standing;

@Embeddable
public class LivesInId implements Serializable{
	
	@Column(name="sid")
	private Integer sid;
	
	@Column(name="year")
	private Standing year;

	public LivesInId() {
		this.sid = null;
		this.year = null;
	}

	public LivesInId(Integer sid, Standing year) {
		super();
		this.sid = sid;
		this.year = year;
	}
	
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
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((sid == null) ? 0 : sid.hashCode());
		result = prime * result + ((year == null) ? 0 : year.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LivesInId other = (LivesInId) obj;
		if (sid == null) {
			if (other.sid != null)
				return false;
		} else if (!sid.equals(other.sid))
			return false;
		if (year != other.year)
			return false;
		return true;
	}
}
