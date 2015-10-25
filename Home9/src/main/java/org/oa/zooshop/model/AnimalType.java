package org.oa.zooshop.model;

import javax.persistence.*;
import javax.xml.bind.annotation.*;

@Entity
@Table(name = "animal_type")
@XmlRootElement
public class AnimalType { // Тип животного
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	@XmlElement
	private int id;

	@Column(name = "animal_type", length = 50)
	@XmlElement
	private String animalType;

	public AnimalType(String animalType) {
		super();
		this.id = id;
		this.animalType = animalType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAnimalType() {
		return animalType;
	}

	public void setAnimalType(String animalType) {
		this.animalType = animalType;
	}


}
