package com.boot.service;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.dataAccess.PersonDao;
import com.boot.model.Person;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	PersonDao dao;
	
	@Override
	public boolean createPerson(Person person) {
		// TODO Auto-generated method stub
		if(dao.showOne(person.getId()) == null) {
			dao.createPerson(person);
			return true;
		}
		return false;
	}

	@Override
	public List<Person> showAll() {
		// TODO Auto-generated method stub
		return dao.showAll();
	}

	@Override
	public void updatePerson(Person person) {
		// TODO Auto-generated method stub
		if(dao.showOne(person.getId())!=null) {
			dao.updatePerson(person);
		}
	}

	@Override
	public boolean deletePerson(BigInteger id) {
		// TODO Auto-generated method stub
		if(dao.showOne(id)!=null) {
			dao.deletePerson(id);
			return true;
		}
		return false;
	}

	@Override
	public Person showOne(BigInteger id) {
		// TODO Auto-generated method stub
		return dao.showOne(id);
	}

}
