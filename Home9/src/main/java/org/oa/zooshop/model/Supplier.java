package org.oa.zooshop.model;

import javax.persistence.*;
import javax.xml.bind.annotation.*;

import com.sun.istack.NotNull;

@Entity
@Table
@XmlRootElement

public class Supplier { // Поставщик
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	@XmlElement
	private int id;

	@Column(length = 50, name = "country")
	@XmlElement
	private String country;

	@Column(length = 200, name = "address")
	@XmlElement
	private String address;

	@Column(length = 25, name = "phone")
	@XmlElement
	@NotNull
	private String phone;

	@Column(length = 150, name = "product_name")
	@XmlElement
	private String productName;

	public Supplier(int id, String country, String address, String phone, String productName) {
		super();
		this.id = id;
		this.country = country;
		this.address = address;
		this.phone = phone;
		this.productName = productName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

}
