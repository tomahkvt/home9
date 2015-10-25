package org.oa.zooshop.model;

import javax.persistence.*;
import javax.xml.bind.annotation.*;

@Entity
@Table(name = "bird_species")
@XmlRootElement
// корм
public class BirdSpecies {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	@XmlElement
	private int id;

	@Column(name = "bird_species", length = 50)
	@XmlElement
	private String birdSpecies;

	public BirdSpecies(int id, String birdSpecies) {
		super();
		this.id = id;
		this.birdSpecies = birdSpecies;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBirdSpecies() {
		return birdSpecies;
	}

	public void setBirdSpecies(String birdSpecies) {
		this.birdSpecies = birdSpecies;
	}

}
