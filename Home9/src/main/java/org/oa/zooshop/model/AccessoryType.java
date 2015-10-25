package org.oa.zooshop.model;

import javax.persistence.*;
import javax.xml.bind.annotation.*;

@Entity
@Table(name = "accessory_type")
@XmlRootElement
// тип акссесуара
public class AccessoryType {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	@XmlElement
	private int id;

	@Column(name = "food_type", length = 50)
	@XmlElement
	private String foodType;

	public AccessoryType(int id, String foodType) {
		super();
		this.id = id;
		this.foodType = foodType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

}
