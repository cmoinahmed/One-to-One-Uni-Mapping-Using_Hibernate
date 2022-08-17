package com.ty.one.to.one.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.ty.one.to.one.dto.Pan;
import com.ty.one.to.one.dto.Person;

public class TestGetPersonById {
	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = factory.createEntityManager();
		Person person = entityManager.find(Person.class, 1);
		System.out.println("Id is " + person.getId());
		System.out.println("Name is " + person.getName());
		System.out.println("Age is " + person.getAge());

		Pan pan = person.getPan();
		if (pan != null) {
			System.out.println("Id is " + pan.getId());
			System.out.println("PanNumber is " + pan.getPanNumber());
			System.out.println("FatherName is " + pan.getFatherName());

		}
	}

}
