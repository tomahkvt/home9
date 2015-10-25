package org.oa.zooshop.model;

import javax.persistence.*;
import javax.xml.bind.annotation.*;

@Entity
@Table(name = "animals")
@XmlRootElement
public class Animal { // животное
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	@XmlElement
	private int id;

	@JoinColumn(name = "id_amimal_type")
	@ManyToOne
	@XmlElement
	private AnimalType amimalType;
	
	@Column(length = 50)
	@XmlElement
	private String sex;

	public Animal(AnimalType amimalType, String sex) {
		super();
		this.id = id;
		this.amimalType = amimalType;
		this.sex = sex;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public AnimalType getAmimalType() {
		return amimalType;
	}

	public void setAmimalType(AnimalType amimalType) {
		this.amimalType = amimalType;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	
}
