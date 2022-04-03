package com.lti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Insurance_Claim")
public class InsuranceClaim {

	@Id
	@GeneratedValue
	private int id;

	@Column(name = "acc_detail")
	private String Accident_detail;

	@Column(name = "claim_status")
	private String status;
	
	@Column(name="claimAmount")
	private Integer Amount;

	/*@ManyToOne
	@JoinColumn(name = "cust_id")
	private CustomerDetails customerdetails3;

	@OneToOne
	@JoinColumn(name = "vehical_number")
	private VehicalDetail vdetail3;*/

	@OneToOne
	@JoinColumn(name = "policy_id")
	
	private InsurancePolicy ipolicy3;

	public Integer getAmount() {
		return Amount;
	}

	public void setAmount(Integer amount) {
		Amount = amount;
	}

	@ManyToOne
	@JoinColumn(name = "admin_id")
	private Admin admin;

	public InsurancePolicy getIpolicy3() {
		return ipolicy3;
	}

	public void setIpolicy3(InsurancePolicy ipolicy3) {
		this.ipolicy3 = ipolicy3;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAccident_detail() {
		return Accident_detail;
	}

	public void setAccident_detail(String accident_detail) {
		Accident_detail = accident_detail;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	
/*	public CustomerDetails getCustomerdetails3() {
		return customerdetails3;
	}

	public void setCustomerdetails3(CustomerDetails customerdetails3) {
		this.customerdetails3 = customerdetails3;
	}

	public VehicalDetail getVdetail3() {
		return vdetail3;
	}

	public void setVdetail3(VehicalDetail vdetail3) {
		this.vdetail3 = vdetail3;
	}
/*
	public InsurancePolicy getIpolicy3() {
		return ipolicy3;
	}

	public void setIpolicy3(InsurancePolicy ipolicy3) {
		this.ipolicy3 = ipolicy3;
	}*/

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	
	

}
