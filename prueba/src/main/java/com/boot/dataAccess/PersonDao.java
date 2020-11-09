package com.boot.dataAccess;

import com.boot.model.Person;

import java.math.BigInteger;
import java.util.List;

public interface PersonDao {
	void createPerson(Person person);
	List<Person> showAll();
	Person showOne(BigInteger id);
	void updatePerson(Person person);
	void deletePerson(BigInteger id);
}
