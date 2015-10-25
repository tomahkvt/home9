package org.oa.zooshop.model;

import javax.persistence.*;
import javax.xml.bind.annotation.*;

@Entity
@Table(name = "product_type")
@XmlRootElement
public class ProductType {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	@XmlElement
	private int id;

	@Column(length = 50, name = "name")
	@XmlElement
	private String name;

	public ProductType() {
	}

	public ProductType(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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



}
