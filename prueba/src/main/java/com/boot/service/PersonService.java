package com.boot.service;

import com.boot.model.Person;

import java.math.BigInteger;
import java.util.List;

public interface PersonService {
	boolean createPerson(Person person);
	List<Person> showAll();
	void updatePerson(Person person);
	boolean deletePerson(BigInteger id);
	Person showOne(BigInteger id);
}
