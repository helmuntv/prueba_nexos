package com.boot.service;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.boot.dataAccess.FamilyInformationDao;
import com.boot.model.FamilyInformation;

public class FamilyInformationServiceImpl implements FamilyInformationService {

	@Autowired
	FamilyInformationDao dao;
	
	@Override
	public boolean createFamilyInformation(FamilyInformation family) {
		// TODO Auto-generated method stub
		if(dao.showOne(family.getId()) == null) {
			dao.createFamilyInformation(family);
			return true;
		}
		return false;
	}

	@Override
	public List<FamilyInformation> showAll() {
		// TODO Auto-generated method stub
		return dao.showAll();
	}

	@Override
	public void updatePerson(FamilyInformation family) {
		// TODO Auto-generated method stub
		if(dao.showOne(family.getId())!=null) {
			dao.updateFamilyInformation(family);
		}
	}

	@Override
	public boolean deleteFamilyInformation(BigInteger id) {
		// TODO Auto-generated method stub
		if(dao.showOne(id)!=null) {
			dao.deleteFamilyInformation(id);
			return true;
		}
		return false;
	}

	@Override
	public FamilyInformation showOne(BigInteger id) {
		// TODO Auto-generated method stub
		return dao.showOne(id);
	}
	
	@Override
	public FamilyInformation showOneByPersonId(BigInteger person_id) {
		// TODO Auto-generated method stub
		return dao.showOneByPersonId(person_id);
	}

}
