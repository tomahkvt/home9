package org.oa.zooshop.model;

import java.util.Date;
import javax.persistence.*;
import javax.xml.bind.annotation.*;

import org.hibernate.annotations.ForeignKey;

@Entity
@Table(name = "employees")
@XmlRootElement

public class Employee {// сотрудники
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	@XmlElement
	private int id;

	@ManyToOne
	@JoinColumn(name = "id_position")
	@XmlElement
	private Position position;

	@Column(name = "color_plumage", length = 50)
	@XmlElement
	private String fullName;

	@Column(name = "date_birth")
	@Temporal(TemporalType.TIMESTAMP)
	@XmlElement
	private Date dateOfBirth;

	@XmlElement
	private boolean sex;

	@Column(name = "employment_date")
	@Temporal(TemporalType.TIMESTAMP)
	@XmlElement
	private Date employmentDate;

	@Column(length = 30)
	@XmlElement
	private String education;

	public Employee(int id, Position position, String fullName, Date dateOfBirth, boolean sex, Date employmentDate,
			String education) {
		super();
		this.id = id;
		this.position = position;
		this.fullName = fullName;
		this.dateOfBirth = dateOfBirth;
		this.sex = sex;
		this.employmentDate = employmentDate;
		this.education = education;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public boolean isSex() {
		return sex;
	}

	public void setSex(boolean sex) {
		this.sex = sex;
	}

	public Date getEmploymentDate() {
		return employmentDate;
	}

	public void setEmploymentDate(Date employmentDate) {
		this.employmentDate = employmentDate;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

}
