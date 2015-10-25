package org.oa.zooshop.model;

import java.util.Date;

import javax.persistence.*;
import javax.xml.bind.annotation.*;

@Entity
@Table(name = "delivery")
@XmlRootElement

public class Delivery {// поставки
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	@XmlElement
	private int id;

	@Column(name = "date_delivery")
	@Temporal(TemporalType.TIMESTAMP)
	@XmlElement
	private Date dateOfDelivery;

	@JoinColumn(name = "id_provider")
	@ManyToOne
	@XmlElement
	private Provider provider;

	@XmlElement
	private int price;

	@XmlElement
	private int tradeAllowance; // Торговая надбавка

	@JoinColumn(name = "id_product")
	@ManyToOne
	@XmlElement
	private Product product;

	@JoinColumn(name = "id_delivery_type")
	@ManyToOne
	@XmlElement
	private DeliveryType deliveryType;

	public Delivery(int id, Date dateOfDelivery, Provider provider, int price, int tradeAllowance, Product product,
			DeliveryType deliveryType) {
		super();
		this.id = id;
		this.dateOfDelivery = dateOfDelivery;
		this.provider = provider;
		this.price = price;
		this.tradeAllowance = tradeAllowance;
		this.product = product;
		this.deliveryType = deliveryType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDateOfDelivery() {
		return dateOfDelivery;
	}

	public void setDateOfDelivery(Date dateOfDelivery) {
		this.dateOfDelivery = dateOfDelivery;
	}

	public Provider getProvider() {
		return provider;
	}

	public void setProvider(Provider provider) {
		this.provider = provider;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getTradeAllowance() {
		return tradeAllowance;
	}

	public void setTradeAllowance(int tradeAllowance) {
		this.tradeAllowance = tradeAllowance;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public DeliveryType getDeliveryType() {
		return deliveryType;
	}

	public void setDeliveryType(DeliveryType deliveryType) {
		this.deliveryType = deliveryType;
	}

}
