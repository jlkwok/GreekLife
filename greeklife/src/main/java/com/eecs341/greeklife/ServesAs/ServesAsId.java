package com.eecs341.greeklife.ServesAs;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ServesAsId implements Serializable{

	@Column(name="sid")
	private Integer sid;
	
	@Column(name="position")
	private String position;
	
	@Column(name="term")
	private String term;
	
	public ServesAsId(Integer sid, String position, String term) {
		super();
		this.sid = sid;
		this.position = position;
		this.term = term;
	}
	
	public ServesAsId() {
		super();
		this.sid = null;
		this.position = null;
		this.term = null;
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
	 * @return the position
	 */
	public String getPosition() {
		return position;
	}

	/**
	 * @param position the position to set
	 */
	public void setPosition(String position) {
		this.position = position;
	}

	/**
	 * @return the term
	 */
	public String getTerm() {
		return term;
	}

	/**
	 * @param term the term to set
	 */
	public void setTerm(String term) {
		this.term = term;
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((position == null) ? 0 : position.hashCode());
		result = prime * result + ((sid == null) ? 0 : sid.hashCode());
		result = prime * result + ((term == null) ? 0 : term.hashCode());
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
		ServesAsId other = (ServesAsId) obj;
		if (position == null) {
			if (other.position != null)
				return false;
		} else if (!position.equals(other.position))
			return false;
		if (sid == null) {
			if (other.sid != null)
				return false;
		} else if (!sid.equals(other.sid))
			return false;
		if (term == null) {
			if (other.term != null)
				return false;
		} else if (!term.equals(other.term))
			return false;
		return true;
	}
	
	
}
