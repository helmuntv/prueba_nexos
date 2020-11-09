package com.boot.dataAccess;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.boot.model.Person;

@Repository
public class PersonDaoImpl implements PersonDao {
	
	@Autowired
	PersonJpaSpring per;
	
	@Override
	public void createPerson(Person person) {
		// TODO Auto-generated method stub
		per.save(person);
	}

	@Override
	public List<Person> showAll() {
		// TODO Auto-generated method stub
		return per.findAll();
	}

	@Override
	public Person showOne(BigInteger id) {
		// TODO Auto-generated method stub
		return per.findById(id).orElse(null);
	}

	@Override
	public void updatePerson(Person person) {
		// TODO Auto-generated method stub
		per.save(person);
	}

	@Override
	public void deletePerson(BigInteger id) {
		// TODO Auto-generated method stub
		per.deleteById(id);
	}

}
