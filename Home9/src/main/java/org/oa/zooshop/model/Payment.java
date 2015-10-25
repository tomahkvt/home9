package org.oa.zooshop.model;

import java.util.Date;

import javax.persistence.*;
import javax.xml.bind.annotation.*;

@Entity
@Table(name = "payment")
@XmlRootElement

public class Payment {// Оплата
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	@XmlElement
	private int id;

	@Column(name = "date_sale")
	@XmlElement
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateSale;

	@JoinColumn(name = "id_cash_box")
	@XmlElement
	@ManyToOne
	private Cashbox cashbox;

	@XmlElement
	private int sum;

	@JoinColumn(name = "id_client")
	@ManyToOne
	@XmlElement
	private Client client;

	@JoinColumn(name = "id_employee")
	@ManyToOne
	@XmlElement
	private Employee employee;

	public Payment(int id, Date dateSale, Cashbox cashbox, int sum, Client client, Employee employee) {
		super();
		this.id = id;
		this.dateSale = dateSale;
		this.cashbox = cashbox;
		this.sum = sum;
		this.client = client;
		this.employee = employee;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDateSale() {
		return dateSale;
	}

	public void setDateSale(Date dateSale) {
		this.dateSale = dateSale;
	}

	public Cashbox getCashbox() {
		return cashbox;
	}

	public void setCashbox(Cashbox cashbox) {
		this.cashbox = cashbox;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

}
