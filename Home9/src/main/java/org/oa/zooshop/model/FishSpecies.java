package org.oa.zooshop.model;

import javax.persistence.*;
import javax.xml.bind.annotation.*;

@Entity
@Table(name = "fish_species")
@XmlRootElement
// корм
public class FishSpecies {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	@XmlElement
	private int id;

	@Column(name = "fish_species", length = 50)
	@XmlElement
	private String fishSpecies;

	public FishSpecies(int id, String fishSpecies) {
		super();
		this.id = id;
		this.fishSpecies = fishSpecies;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFishSpecies() {
		return fishSpecies;
	}

	public void setFishSpecies(String fishSpecies) {
		this.fishSpecies = fishSpecies;
	}

}
