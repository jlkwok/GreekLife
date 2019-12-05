package com.eecs341.greeklife.ServesAs;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="ServesAs")
public class ServesAs {

	@EmbeddedId
	private ServesAsId id;
}