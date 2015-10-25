package org.oa.zooshop.model;

import java.util.Date;

import javax.persistence.*;
import javax.xml.bind.annotation.*;

import org.hibernate.annotations.ForeignKey;
import org.hibernate.annotations.ManyToAny;

@Entity
@Table(name = "ReceiptGoods")
@XmlRootElement
// корм
public class ReceiptGoods {// поступление товара
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	@XmlElement
	private int id;

	@ManyToOne
	@JoinColumn(name = "id_delivery")
	@XmlElement
	private Delivery delivery;

	@XmlElement
	private int consignment;// партия товара

	@XmlElement
	private int quantity;

	@Column(name = "guarantee_from")
	@Temporal(TemporalType.TIMESTAMP)
	@XmlElement
	private Date guaranteeFrom;

	@Column(name = "guarantee_to")
	@Temporal(TemporalType.TIMESTAMP)
	@XmlElement
	private Date guaranteeTo;

	@ManyToOne()
	@JoinColumn(name = "id_product")
	@XmlElement
	private Product product;

	@Column(name = "receip_date")
	@Temporal(TemporalType.TIMESTAMP)
	@XmlElement
	private Date receipDate;

	@JoinColumn(name = "id_employee")
	@ManyToOne
	@XmlElement
	private Employee employee;

	public ReceiptGoods(int id, Delivery delivery, int consignment, int quantity, Date guaranteeFrom, Date guaranteeTo,
			Product product, Date receipDate, Employee employee) {
		super();
		this.id = id;
		this.delivery = delivery;
		this.consignment = consignment;
		this.quantity = quantity;
		this.guaranteeFrom = guaranteeFrom;
		this.guaranteeTo = guaranteeTo;
		this.product = product;
		this.receipDate = receipDate;
		this.employee = employee;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Delivery getDelivery() {
		return delivery;
	}

	public void setDelivery(Delivery delivery) {
		this.delivery = delivery;
	}

	public int getConsignment() {
		return consignment;
	}

	public void setConsignment(int consignment) {
		this.consignment = consignment;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Date getGuaranteeFrom() {
		return guaranteeFrom;
	}

	public void setGuaranteeFrom(Date guaranteeFrom) {
		this.guaranteeFrom = guaranteeFrom;
	}

	public Date getGuaranteeTo() {
		return guaranteeTo;
	}

	public void setGuaranteeTo(Date guaranteeTo) {
		this.guaranteeTo = guaranteeTo;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Date getReceipDate() {
		return receipDate;
	}

	public void setReceipDate(Date receipDate) {
		this.receipDate = receipDate;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
}
