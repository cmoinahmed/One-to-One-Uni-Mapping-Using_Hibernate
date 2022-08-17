package com.ty.one.to.one.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.one.to.one.dto.Pan;
import com.ty.one.to.one.dto.Person;

public class TestSavePerson {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Person person = new Person();
		person.setName("MASOOD");
		person.setAge("33");
		Pan pan = new Pan();
		pan.setPanNumber("ABCF5826");
		pan.setFatherName("Rafi");
		person.setPan(pan);
		entityTransaction.begin();
		entityManager.persist(person);
		entityManager.persist(pan);
		entityTransaction.commit();
		System.out.println("--Data Stored--");

	}

}
