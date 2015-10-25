package org.oa.zooshop.model;

import javax.persistence.*;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.*;

@Entity
@Table
@XmlRootElement

public class Accessory {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	@XmlElement
	private int id;

	@Column(length = 50, name = "name")
	@XmlElement
	private String name;

	@JoinColumn(name = "id_accessory_type")
	@ManyToOne
	@XmlElement
	private AccessoryType accessoryType;

	public Accessory(int id, String name, AccessoryType accessoryType) {
		super();
		this.id = id;
		this.name = name;
		this.accessoryType = accessoryType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AccessoryType getAccessoryType() {
		return accessoryType;
	}

	public void setAccessoryType(AccessoryType accessoryType) {
		this.accessoryType = accessoryType;
	}

}
