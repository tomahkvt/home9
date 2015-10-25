package org.oa.zooshop.model;

import javax.persistence.*;
import javax.xml.bind.annotation.*;

@Entity
@Table(name = "bird_type")
@XmlRootElement

public class BirdType {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column()
	@XmlElement
	private int id;

	@Column(name = "bird_type", length = 50)
	@XmlElement
	private String birdType;

	public BirdType(int id, String birdType) {
		super();
		this.id = id;
		this.birdType = birdType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBirdType() {
		return birdType;
	}

	public void setBirdType(String birdType) {
		this.birdType = birdType;
	}

	
}
