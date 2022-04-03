package com.lti.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Admin_details")
public class Admin {
	@Id
	@GeneratedValue
	private int admin_id;
	//
	@Column(name="Name")
	private String name;
	
	
	@Column(name="email")
	private String email ;
	
	@Column(name="password")
	private String pass;
	

	

	@OneToMany(mappedBy = "admin")
	private List<InsuranceClaim> iclaim;




	public int getAdmin_id() {
		return admin_id;
	}




	public void setAdmin_id(int admin_id) {
		this.admin_id = admin_id;
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




	public String getPass() {
		return pass;
	}




	public void setPass(String pass) {
		this.pass = pass;
	}




	public List<InsuranceClaim> getIclaim() {
		return iclaim;
	}




	public void setIclaim(List<InsuranceClaim> iclaim) {
		this.iclaim = iclaim;
	}
	
	

}
