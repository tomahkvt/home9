package org.oa.zooshop.model;

import javax.persistence.*;
import javax.xml.bind.annotation.*;

import com.sun.istack.NotNull;

@Entity
@Table(name = "food")
@XmlRootElement
// корм
public class Food {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	@XmlElement
	private int id;

	@Column(length = 50)
	@XmlElement
	@NotNull
	private String name;

	@JoinColumn(name = "id_food_type")
	@ManyToOne
	@XmlElement
	private FoodType foodType;

	public Food(int id, String name, FoodType foodType) {
		super();
		this.id = id;
		this.name = name;
		this.foodType = foodType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public FoodType getFoodType() {
		return foodType;
	}

	public void setFoodType(FoodType foodType) {
		this.foodType = foodType;
	}

}
