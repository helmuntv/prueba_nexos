package com.boot.model;

import java.util.ArrayList;

public class PersonFamilyInformation {

	private Person person;
	
	private ArrayList<FamilyInformation> families = new ArrayList<>();
	
	public PersonFamilyInformation() {
		
	}
	
	public PersonFamilyInformation(Person person, ArrayList<FamilyInformation> families) {
		super();
		this.person = person;
		this.families = families;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	 

	public ArrayList<FamilyInformation> getFamilies() {
		return families;
	}

	public void setFamilies(ArrayList<FamilyInformation> families) {
		this.families = families;
	}
}
