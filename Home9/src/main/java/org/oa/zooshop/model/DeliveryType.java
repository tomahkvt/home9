package org.oa.zooshop.model;

import javax.persistence.*;
import javax.xml.bind.annotation.*;

@Entity
@Table(name = "delivery_type")
@XmlRootElement
// корм
public class DeliveryType {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	@XmlElement
	private int id;

	@Column(name = "delivery_type", length = 50)
	@XmlElement
	private String deliveryType;

	public DeliveryType(int id, String deliveryType) {
		super();
		this.id = id;
		this.deliveryType = deliveryType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDeliveryType() {
		return deliveryType;
	}

	public void setDeliveryType(String deliveryType) {
		this.deliveryType = deliveryType;
	}

}
