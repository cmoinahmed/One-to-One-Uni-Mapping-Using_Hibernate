package com.ty.one.to.one.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.one.to.one.dto.Company;
import com.ty.one.to.one.dto.Gst;

public class TestGetGstById {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = factory.createEntityManager();
		Company company = entityManager.find(Company.class, 1);
		System.out.println("Id is " + company.getId());
		System.out.println("Name is " + company.getName());
		System.out.println("PhoneNo is " + company.getPhone());

		Gst gst = company.getGst();
		if (gst != null) {
			System.out.println("Id is " + gst.getId());
			System.out.println("GstNumber is " + gst.getGstNumber());
			System.out.println("Status is " + gst.getStatus());
		}

	}

}
