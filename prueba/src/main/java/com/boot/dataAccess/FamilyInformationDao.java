package com.boot.dataAccess;

import java.math.BigInteger;
import java.util.List;

import com.boot.model.FamilyInformation;;

public interface FamilyInformationDao {
	void createFamilyInformation(FamilyInformation family);
	List<FamilyInformation> showAll();
	FamilyInformation showOne(BigInteger id);
	FamilyInformation showOneByPersonId(BigInteger id);
	void updateFamilyInformation(FamilyInformation family);
	void deleteFamilyInformation(BigInteger id);
}
