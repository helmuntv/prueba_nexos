package com.boot.service;

import java.math.BigInteger;
import java.util.List;

import com.boot.model.FamilyInformation;

public interface FamilyInformationService {
	boolean createFamilyInformation(FamilyInformation family);
	List<FamilyInformation> showAll();
	void updatePerson(FamilyInformation family);
	boolean deleteFamilyInformation(BigInteger id);
	FamilyInformation showOne(BigInteger id);
	FamilyInformation showOneByPersonId(BigInteger person_id);
}
