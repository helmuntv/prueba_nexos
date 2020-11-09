package com.boot.dataAccess;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.model.FamilyInformation;

public interface FamilyInformationJpaSpring extends JpaRepository<FamilyInformation,BigInteger> {
	FamilyInformation findByPersonId(BigInteger person_id);
}
