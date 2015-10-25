package org.oa.zooshop.model;

import java.util.Date;

import javax.persistence.*;
import javax.xml.bind.annotation.*;

import org.hibernate.annotations.ForeignKey;

@Entity
@Table(name = "guarantee")
@XmlRootElement
// корм
public class Guarantee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	@XmlElement
	private int id;

	@XmlElement
	@Column(name = "date_end")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateOfEnd;

	@Column(length = 100)
	@XmlElement
	private String note;

	@ManyToOne()
	@JoinColumn(name = "id_sallaring")
	@XmlElement
	private Salling salling;

	@Column(name = "date_start")
	@Temporal(TemporalType.TIMESTAMP)
	@XmlElement
	private Date dateOfStart;

	public Guarantee(int id, Date dateOfEnd, String note, Salling salling, Date dateOfStart) {
		super();
		this.id = id;
		this.dateOfEnd = dateOfEnd;
		this.note = note;
		this.salling = salling;
		this.dateOfStart = dateOfStart;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDateOfEnd() {
		return dateOfEnd;
	}

	public void setDateOfEnd(Date dateOfEnd) {
		this.dateOfEnd = dateOfEnd;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Salling getSalling() {
		return salling;
	}

	public void setSalling(Salling salling) {
		this.salling = salling;
	}

	public Date getDateOfStart() {
		return dateOfStart;
	}

	public void setDateOfStart(Date dateOfStart) {
		this.dateOfStart = dateOfStart;
	}
}
