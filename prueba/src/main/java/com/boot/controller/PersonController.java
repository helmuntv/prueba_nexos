package com.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.boot.model.FamilyInformation;
import com.boot.model.Person;
import com.boot.model.PersonFamilyInformation;
import com.boot.service.FamilyInformationService;
import com.boot.service.PersonService;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@RestController
public class PersonController {
	@Autowired
	PersonService service;
	FamilyInformationService famservice;
	
	@GetMapping(value="person",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Person> showAll() {
		return service.showAll();
	}
	
	@GetMapping(value="person/{id}",produces=MediaType.APPLICATION_JSON_VALUE)
	public Person showOne(@PathVariable("id") BigInteger id) {
		return service.showOne(id);
	}
	
	@GetMapping(value="familyinformation/{id}",produces=MediaType.APPLICATION_JSON_VALUE)
	public FamilyInformation showOneD(@PathVariable("id") BigInteger id) {
		return famservice.showOne(id);
	}
	
	@GetMapping(value="person/{person_id}/familyinformation",produces=MediaType.APPLICATION_JSON_VALUE)
	public PersonFamilyInformation getFamilyInformation(@PathVariable("person_id") BigInteger person_id) {
		Person per = new Person();
		per = service.showOne(person_id);
		
		FamilyInformation fam = new FamilyInformation();
		fam = famservice.showOne(person_id);
		
		PersonFamilyInformation perFam = new PersonFamilyInformation();
		perFam.setPerson(per);
		ArrayList<FamilyInformation> families = new ArrayList<>();
		families.add(fam);
		perFam.setFamilies(families);
		return perFam;
	}
	
	
	
	@PostMapping(value="person",consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.TEXT_PLAIN_VALUE)
	public String createPerson(@RequestBody Person person) {		
		return String.valueOf(service.createPerson(person));
	}
	
	@PostMapping(value="familyinformation",consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.TEXT_PLAIN_VALUE)
	public String createFamilyInformation(@RequestBody FamilyInformation family) {
		return String.valueOf(famservice.createFamilyInformation(family));
	}
	
	@PutMapping(value="person/{id}",consumes=MediaType.APPLICATION_JSON_VALUE)
	public void updatePerson(@RequestBody Person person) {		
		service.updatePerson(person);
	}
		
	@DeleteMapping(value="person/{id}")
	public void deletePerson(@PathVariable("id") BigInteger id) {
		service.deletePerson(id);
	}
}
