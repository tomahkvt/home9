package org.oa.zooshop.model;

import javax.persistence.*;
import javax.xml.bind.annotation.*;

import org.hibernate.annotations.ForeignKey;

@Entity
@Table(name = "birds")
@XmlRootElement
// корм
public class Bird {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	@XmlElement
	private int id;

	@ManyToOne
	@JoinColumn(name = "id_bird_type")
	@XmlElement
	private BirdType birdType;

	@Column(name = "color_plumage", length = 50)
	@XmlElement
	private String colorOfPlumage;

	@ManyToOne()
	@JoinColumn(name = "id_bird_species")
	@XmlElement
	private BirdSpecies birdSpecies;

	public Bird(int id, BirdType birdType, String colorOfPlumage, BirdSpecies birdSpecies) {
		super();
		this.id = id;
		this.birdType = birdType;
		this.colorOfPlumage = colorOfPlumage;
		this.birdSpecies = birdSpecies;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BirdType getBirdType() {
		return birdType;
	}

	public void setBirdType(BirdType birdType) {
		this.birdType = birdType;
	}

	public String getColorOfPlumage() {
		return colorOfPlumage;
	}

	public void setColorOfPlumage(String colorOfPlumage) {
		this.colorOfPlumage = colorOfPlumage;
	}

	public BirdSpecies getBirdSpecies() {
		return birdSpecies;
	}

	public void setBirdSpecies(BirdSpecies birdSpecies) {
		this.birdSpecies = birdSpecies;
	}

}
