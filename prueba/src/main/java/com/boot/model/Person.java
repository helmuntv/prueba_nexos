package com.boot.model;

import java.io.Serializable;
import javax.persistence.*;

import java.math.BigInteger;
import java.util.ArrayList;


/**
 * The persistent class for the person database table.
 * 
 */
@Entity
@NamedQuery(name="Person.findAll", query="SELECT p FROM Person p")
public class Person implements Serializable {
	private static final long serialVersionUID = 1L;

	private String gender;
	
	@Id
	private BigInteger id;

	@Column(name="identification_number")
	private String identificationNumber;

	@Column(name="last_name")
	private String lastName;

	private String name;
	
	public Person() {
	}

	public Person(String gender, BigInteger id, String identificationNumber, String lastName, String name) {
		super();
		this.gender = gender;
		this.id = id;
		this.identificationNumber = identificationNumber;
		this.lastName = lastName;
		this.name = name;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public BigInteger getId() {
		return this.id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public String getIdentificationNumber() {
		return this.identificationNumber;
	}

	public void setIdentificationNumber(String identificationNumber) {
		this.identificationNumber = identificationNumber;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}