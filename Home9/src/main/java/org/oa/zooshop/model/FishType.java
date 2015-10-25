package org.oa.zooshop.model;

import javax.persistence.*;
import javax.xml.bind.annotation.*;

@Entity
@Table(name = "fish_type")
@XmlRootElement
// корм
public class FishType {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	@XmlElement
	private int id;

	@Column(name = "fish_type", length = 50)
	@XmlElement
	private String fishType;

	public FishType(int id, String fishType) {
		super();
		this.id = id;
		this.fishType = fishType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFishType() {
		return fishType;
	}

	public void setFishType(String fishType) {
		this.fishType = fishType;
	}

}
