package com.ty.one.to.one.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Gst {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private long gstNumber;
	private String Status;
	@OneToOne
	private Company company;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getGstNumber() {
		return gstNumber;
	}

	public void setGstNumber(long gstNumber) {
		this.gstNumber = gstNumber;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "Gst [id=" + id + ", gstNumber=" + gstNumber + ", Status=" + Status + ", company=" + company + "]";
	}

}
