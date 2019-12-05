package com.eecs341.greeklife.Hosts;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Hosts")
public class Hosts {

	@EmbeddedId
	private HostsId id;
}
