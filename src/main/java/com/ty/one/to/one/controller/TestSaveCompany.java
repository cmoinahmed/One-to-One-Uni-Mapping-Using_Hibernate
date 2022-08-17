package com.ty.one.to.one.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.one.to.one.dto.Company;
import com.ty.one.to.one.dto.Gst;

public class TestSaveCompany {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Company company = new Company();
		company.setName("Moin");
		company.setPhone(8618227093l);
		Gst gst = new Gst();
		gst.setGstNumber(9481123446l);
		gst.setStatus("Active");
		company.setGst(gst);
		gst.setCompany(company);
		entityTransaction.begin();
		entityManager.persist(company);
		entityManager.persist(gst);
		entityTransaction.commit();
		System.out.println("--Data Saved--");

	}

}
