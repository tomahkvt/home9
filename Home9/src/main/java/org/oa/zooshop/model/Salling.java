package org.oa.zooshop.model;

import javax.persistence.*;
import javax.xml.bind.annotation.*;

@Entity
@Table
@XmlRootElement

public class Salling {// продажи
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	@XmlElement
	private int id;

	@Column()
	@XmlElement
	private int quantity;

	@Column(name = "id_product")
	@XmlElement
	private int idProduct;

	@Column(name = "id_payment")
	@XmlElement
	private int idPayment;

	public Salling(int id, int quantity, int idProduct, int idPayment) {
		super();
		this.id = id;
		this.quantity = quantity;
		this.idProduct = idProduct;
		this.idPayment = idPayment;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}

	public int getIdPayment() {
		return idPayment;
	}

	public void setIdPayment(int idPayment) {
		this.idPayment = idPayment;
	}

}
