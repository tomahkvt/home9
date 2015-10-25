package org.oa.zooshop.model;

import java.util.Date;

import javax.persistence.*;
import javax.xml.bind.annotation.*;

@Entity
@Table(name = "returned")
@XmlRootElement
public class Returned { // возврат
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	@XmlElement
	private int id;

	@Column(length = 50)
	@XmlElement
	private String reason;// причина

	@JoinColumn(name = "id_salling")
	@ManyToOne
	@XmlElement
	private Salling salling;

	@Temporal(TemporalType.TIMESTAMP)
	@XmlElement
	private Date dateReturn;

	public  Returned(int id, String reason, Salling salling, Date dateReturn) {
		super();
		this.id = id;
		this.reason = reason;
		this.salling = salling;
		this.dateReturn = dateReturn;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public Salling getSalling() {
		return salling;
	}

	public void setSalling(Salling salling) {
		this.salling = salling;
	}

	public Date getDateReturn() {
		return dateReturn;
	}

	public void setDateReturn(Date dateReturn) {
		this.dateReturn = dateReturn;
	}
}
