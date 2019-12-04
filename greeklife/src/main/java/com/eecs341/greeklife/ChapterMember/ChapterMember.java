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
	@Column(name="sid")
	private Integer sid;	
}
