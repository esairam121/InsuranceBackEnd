package com.lti.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Table;

@Entity
@javax.persistence.Table(name="Cust_details")
public class CustomerDetails {

	
//	public CustomerDetails() {
////		
////		name="";
////		email="";
////		dateOfBirth="";
////		contactnumber=;
////		pass="";
////		Address="";
////	}


	

	@Id
	@GeneratedValue
	@Column(name="ID")
	private int id;
	
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="EMAIL")
	private String email;
	
	@Column(name="DATEOFBIRTH")
	private Date dateOfBirth;
	
	@Column(name="CONTACT_NUMBER")
	private long contactnumber;
	
	@Column(name="ADDRESS")
	private String Address;
	
	@Column(name="PASSWORD")
	private String pass;
	
	
	@OneToMany(mappedBy = "customerdetails2")
	private List<VehicalDetail> vdetail;
/*
	@OneToMany(mappedBy = "customerdetails")
	private List<InsurancePolicy> ipolicy;*/
	
/*
	@OneToMany(mappedBy = "customerdetails3")
	private List<InsuranceClaim> iclaim2;

*/
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Date getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	public long getContactnumber() {
		return contactnumber;
	}


	public void setContactnumber(long contactnumber) {
		this.contactnumber = contactnumber;
	}


	public String getAddress() {
		return Address;
	}


	public void setAddress(String address) {
		Address = address;
	}


	public String getPass() {
		return pass;
	}


	public void setPass(String pass) {
		this.pass = pass;
	}


	public List<VehicalDetail> getVdetail() {
		return vdetail;
	}


	public void setVdetail(List<VehicalDetail> vdetail) {
		this.vdetail = vdetail;
	}

/*
	public List<InsurancePolicy> getIpolicy() {
		return ipolicy;
	}


	public void setIpolicy(List<InsurancePolicy> ipolicy) {
		this.ipolicy = ipolicy;
	}


	public List<InsuranceClaim> getIclaim2() {
		return iclaim2;
	}


	public void setIclaim2(List<InsuranceClaim> iclaim2) {
		this.iclaim2 = iclaim2;
	}
	
	*/
	
	
}
