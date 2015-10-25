package org.oa.zooshop.model;

import javax.persistence.*;
import javax.xml.bind.annotation.*;

@Entity
@Table(name = "product")
@XmlRootElement
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	@XmlElement
	private int id;

	@XmlElement
	private int price;

	@XmlElement
	private String name;

	@JoinColumn(name = "id_product_type")
	@ManyToOne
	@XmlElement
	private ProductType productType;

	public Product(int id, int price, String name, ProductType productType) {
		super();
		this.id = id;
		this.price = price;
		this.name = name;
		this.productType = productType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ProductType getProductType() {
		return productType;
	}

	public void setProductType(ProductType productType) {
		this.productType = productType;
	}
}
