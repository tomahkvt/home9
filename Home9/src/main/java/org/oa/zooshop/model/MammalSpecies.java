package org.oa.zooshop.model;

import javax.persistence.*;
import javax.xml.bind.annotation.*;

@Entity
@Table(name = "mammal_species")
@XmlRootElement
// корм
public class MammalSpecies {// вид млекопетающего
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	@XmlElement
	private int id;

	@Column(name = "мammal_species", length = 50)
	@XmlElement
	private String мammalSpecies;

	public MammalSpecies(int id, String мammalSpecies) {
		super();
		this.id = id;
		this.мammalSpecies = мammalSpecies;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getМammalSpecies() {
		return мammalSpecies;
	}

	public void setМammalSpecies(String мammalSpecies) {
		this.мammalSpecies = мammalSpecies;
	}

}
