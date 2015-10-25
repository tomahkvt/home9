package org.oa.zooshop.model;

import javax.persistence.*;
import javax.xml.bind.annotation.*;

@Entity
@Table(name = "mammal_type")
@XmlRootElement
// корм
public class MammalType {// тип млекопетающего
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	@XmlElement
	private int id;

	@Column(name = "mammal_type", length = 50)
	@XmlElement
	private String mammalType;

	public MammalType(int id, String mammalType) {
		super();
		this.id = id;
		this.mammalType = mammalType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMammalType() {
		return mammalType;
	}

	public void setMammalType(String mammalType) {
		this.mammalType = mammalType;
	}

}
