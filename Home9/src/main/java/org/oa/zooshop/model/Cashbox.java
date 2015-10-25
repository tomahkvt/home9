package org.oa.zooshop.model;

import java.util.Date;

import javax.persistence.*;
import javax.xml.bind.annotation.*;

@Entity
@Table(name = "cashbox")
@XmlRootElement

public class Cashbox {// касса
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	@XmlElement
	private int id;

	@Column()
	@XmlElement
	private int sum;

	@XmlElement
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateTime;

	public Cashbox(int id, int sum, Date dateTime) {
		super();
		this.id = id;
		this.sum = sum;
		this.dateTime = dateTime;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public Date getDateTime() {
		return dateTime;
	}

	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}

}
