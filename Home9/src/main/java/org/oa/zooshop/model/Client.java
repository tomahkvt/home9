package org.oa.zooshop.model;

import java.util.Date;

import javax.persistence.*;
import javax.xml.bind.annotation.*;

@Entity
@Table(name = "clients")
@XmlRootElement

public class Client {// касса
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	@XmlElement
	private int id;

	@Column(length = 50)
	@XmlElement
	private String fullName;

	@Column(length = 20)
	private String telefon;

	public Client(int id, String fullName, String telefon) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.telefon = telefon;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

}
