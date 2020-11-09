package com.boot.model;

import java.io.Serializable;
import java.math.BigInteger;

import javax.persistence.*;


/**
 * The persistent class for the family_information database table.
 * 
 */
@Entity
@Table(name="family_information")
@NamedQuery(name="FamilyInformation.findAll", query="SELECT f FROM FamilyInformation f")
public class FamilyInformation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private BigInteger id;

	@Column(name="identification_number")
	private String identificationNumber;

	@Column(name="last_name")
	private String lastName;

	private String name;

	@Column(name="person_id")
	private BigInteger personId;

	private String relationship;

	public FamilyInformation() {
	}

	public FamilyInformation(BigInteger id, String identificationNumber, String lastName, String name,
			BigInteger personId, String relationship) {
		super();
		this.id = id;
		this.identificationNumber = identificationNumber;
		this.lastName = lastName;
		this.name = name;
		this.personId = personId;
		this.relationship = relationship;
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

	public BigInteger getPersonId() {
		return this.personId;
	}

	public void setPersonId(BigInteger personId) {
		this.personId = personId;
	}

	public String getRelationship() {
		return this.relationship;
	}

	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}

}