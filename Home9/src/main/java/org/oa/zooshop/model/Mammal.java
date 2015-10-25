package org.oa.zooshop.model;

import javax.persistence.*;
import javax.xml.bind.annotation.*;

@Entity
@Table
@XmlRootElement
// корм
public class Mammal {// млекопетающего
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	@XmlElement
	private int id;

	@Column(length = 50)
	@XmlElement
	private String appearance;

	@Column(length = 50, name = "cover_body")
	@XmlElement
	private String coverBody;

	@Column(length = 50)
	@XmlElement
	private String food;

	@JoinColumn(name = "id_mammal_type")
	@ManyToOne
	@XmlElement
	private MammalType mammalType;

	@JoinColumn(name = "id_mammal_species")
	@ManyToOne
	@XmlElement
	private MammalSpecies mammalSpecies;

	public Mammal(int id, String appearance, String coverBody, String food, MammalType mammalType,
			MammalSpecies mammalSpecies) {
		super();
		this.id = id;
		this.appearance = appearance;
		this.coverBody = coverBody;
		this.food = food;
		this.mammalType = mammalType;
		this.mammalSpecies = mammalSpecies;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAppearance() {
		return appearance;
	}

	public void setAppearance(String appearance) {
		this.appearance = appearance;
	}

	public String getCoverBody() {
		return coverBody;
	}

	public void setCoverBody(String coverBody) {
		this.coverBody = coverBody;
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	public MammalType getMammalType() {
		return mammalType;
	}

	public void setMammalType(MammalType mammalType) {
		this.mammalType = mammalType;
	}

	public MammalSpecies getMammalSpecies() {
		return mammalSpecies;
	}

	public void setMammalSpecies(MammalSpecies mammalSpecies) {
		this.mammalSpecies = mammalSpecies;
	}
}
