package com.boot.dataAccess;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.model.Person;

public interface PersonJpaSpring extends JpaRepository<Person,BigInteger> {

}
