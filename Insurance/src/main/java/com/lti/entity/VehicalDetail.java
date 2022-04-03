package com.lti.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="vehical_Detail")
public class VehicalDetail {
 
	
 @Id
 @Column(name="vehical_number")
 private String id;
 
 @Column(name="vehical_owner")
 private String owner;
 

 @Column(name="vehical_type")
 private String type;
 

 @Column(name="vehical_model")
 private String model;
 

 @Column(name="vehical_color")
 private String colour;
 
 
 
 @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
 @JoinColumn(name="cust_id")
 private CustomerDetails customerdetails2;
    
	
    

	/*

	@OneToOne(mappedBy = "vdetail2")
	private List<InsurancePolicy> ipolicy2;
	
	
	@OneToOne(mappedBy = "vdetail3")
	private List<InsuranceClaim> iclaim4;*/


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getOwner() {
		return owner;
	}


	public void setOwner(String owner) {
		this.owner = owner;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public String getColour() {
		return colour;
	}


	public void setColour(String colour) {
		this.colour = colour;
	}


	public CustomerDetails getCustomerdetails2() {
		return customerdetails2;
	}


	public void setCustomerdetails2(CustomerDetails customerdetails2) {
		this.customerdetails2 = customerdetails2;
	}

/*
	public List<InsurancePolicy> getIpolicy2() {
		return ipolicy2;
	}


	public void setIpolicy2(List<InsurancePolicy> ipolicy2) {
		this.ipolicy2 = ipolicy2;
	}


	public List<InsuranceClaim> getIclaim4() {
		return iclaim4;
	}


	public void setIclaim4(List<InsuranceClaim> iclaim4) {
		this.iclaim4 = iclaim4;
	}
	
	
	*/
}
