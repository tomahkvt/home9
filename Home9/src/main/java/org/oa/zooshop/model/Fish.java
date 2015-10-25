package org.oa.zooshop.model;

import javax.persistence.*;
import javax.xml.bind.annotation.*;

@Entity
@Table(name = "fish")
@XmlRootElement
public class Fish {// рыба
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	@XmlElement
	private int id;

	@Column(length = 50)
	@XmlElement
	private String body;

	@Column(length = 50)
	@XmlElement
	private String food;

	@ManyToOne
	@JoinColumn(name = "id_fish_type")
	@XmlElement
	private FishType fishType;

	@ManyToOne
	@JoinColumn(name = "id_fish_species")
	@XmlElement
	private FishSpecies fishSpecies;

	public Fish(int id, String body, String food, FishType fishType, FishSpecies fishSpecies) {
		super();
		this.id = id;
		this.body = body;
		this.food = food;
		this.fishType = fishType;
		this.fishSpecies = fishSpecies;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	public FishType getFishType() {
		return fishType;
	}

	public void setFishType(FishType fishType) {
		this.fishType = fishType;
	}

	public FishSpecies getFishSpecies() {
		return fishSpecies;
	}

	public void setFishSpecies(FishSpecies fishSpecies) {
		this.fishSpecies = fishSpecies;
	}

}
