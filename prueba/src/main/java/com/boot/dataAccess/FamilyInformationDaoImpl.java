package com.boot.dataAccess;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.boot.model.FamilyInformation;

public class FamilyInformationDaoImpl implements FamilyInformationDao {

	@Autowired
	FamilyInformationJpaSpring faminfo;
	
	@Override
	public void createFamilyInformation(FamilyInformation family) {
		// TODO Auto-generated method stub
		faminfo.save(family);
	}

	@Override
	public List<FamilyInformation> showAll() {
		// TODO Auto-generated method stub
		return faminfo.findAll();
	}

	@Override
	public FamilyInformation showOne(BigInteger id) {
		// TODO Auto-generated method stub
		return faminfo.findById(id).orElse(null);
	}

	@Override
	public void updateFamilyInformation(FamilyInformation person) {
		// TODO Auto-generated method stub
		faminfo.save(person);
	}

	@Override
	public void deleteFamilyInformation(BigInteger id) {
		// TODO Auto-generated method stub
		faminfo.deleteById(id);
	}

	@Override
	public FamilyInformation showOneByPersonId(BigInteger person_id) {
		// TODO Auto-generated method stub
		return faminfo.findByPersonId(person_id);
	}

}
