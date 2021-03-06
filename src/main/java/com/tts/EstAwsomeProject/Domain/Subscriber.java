package com.tts.EstAwsomeProject.Domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

@Entity
public class Subscriber {

	// sets the 'id' as the primary key
	@Id
	// allows the id to be generated by the underlying database
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String firstName;
	private String lastName;
	private String userName;

	private String gender;
	private String note;
	private String profecsion;

	@Column
	// allows the date to be generated by the system
	@CreationTimestamp
	private Date signedUp;

	public Subscriber() {
		// no argument constructor needed for JPA
	}

	public Subscriber(String firstName, String lastName, String userName, String gender, String note,
			String profecsion) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.gender = gender;
		this.note = note;
		this.profecsion = profecsion;

	}

	public Subscriber(String firstName, String lastName, String userName, Date signedUp) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.signedUp = signedUp;
	}

	public Subscriber(String firstName, String lastName, String userName, String gender, String note, String profecsion,
			Date signedUp) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.gender = gender;
		this.note = note;
		this.profecsion = profecsion;
		this.signedUp = signedUp;
	}

	public Long getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getUserName() {
		return userName;
	}

	public String getGender() {
		return gender;
	}

	public String getNote() {
		return note;
	}

	public String getProfecsion() {
		return profecsion;
	}

	public Date getSignedUp() {
		return signedUp;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public void setProfecsion(String profecsion) {
		this.profecsion = profecsion;
	}

	@Override
	public String toString() {
		return "Subscriber [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", userName=" + userName
				+ ", gender=" + gender + ", note=" + note + ", profecsion=" + profecsion + ", signedUp=" + signedUp
				+ "]";
	}

}