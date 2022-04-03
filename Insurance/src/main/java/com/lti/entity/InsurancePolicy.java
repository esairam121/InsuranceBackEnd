package com.lti.entity;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
 

@Entity
@Table(name="Insurance_policy")
public class InsurancePolicy {

	@Id
	@GeneratedValue
	@Column(name="policy_id")
	private int policy_id;
	
	@Column(name="policy_name")
	private String policyname;
	
	@Column(name="policy_PaymentDate")
	private LocalDate paymentDate; 
	

	@Column(name="policy_startDate")
	private LocalDate startDate;
	

	@Column(name="policy_EndDate")
	private Date endDate;
	
	@Column(name="insured_amt")
	private double amount;
	
	
	@Column(name="policy_status")
	private String status;
	

	@Column(name="price")
	private double price;
	
	@Column(name="year")
	private String year;
	
	
	/*
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name="cust_id")
	private CustomerDetails customerdetails;*/
	
	 @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	 @JoinColumn(name="vehical_number")
	private  VehicalDetail vdetail2;
	
	 
	 
	 
	public InsurancePolicy() {
	
		this.paymentDate = LocalDate.now();
		this.startDate = LocalDate.now();
//		   DateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
//		   Calendar cal=Calendar.getInstance();
//		   cal.add(Calendar.DATE, 365);
//		   endDate=dateFormat.format(cal.getTime());
	}


	
//
//	@OneToOne(mappedBy = "ipolicy3")
//	private InsuranceClaim iclaim3;
//	
//	
//    @OneToOne(mappedBy = "ipolicy4")
//	private RenewInsurance renewinsurance;


	public int getPolicy_id() {
		return policy_id;
	}


	public void setPolicy_id(int policy_id) {
		this.policy_id = policy_id;
	}


	public String getPolicyname() {
		return policyname;
	}


	public void setPolicyname(String policyname) {
		this.policyname = policyname;
	}


	public LocalDate getPaymentDate() {
		return paymentDate;
	}


	public void setPaymentDate(LocalDate paymentDate) {
		this.paymentDate = paymentDate;
	}


	public LocalDate getStartDate() {
		return startDate;
	}


	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}


	public Date getEndDate() {
		return endDate;
	}


	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}


	public double getAmount() {
		return amount;
	}


	public void setAmount(double amount) {
		this.amount = amount;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getYear() {
		return year;
	}


	public void setYear(String year) {
		this.year = year;
	}
	
/*

	public CustomerDetails getCustomerdetails() {
		return customerdetails;
	}


	public void setCustomerdetails(CustomerDetails customerdetails) {
		this.customerdetails = customerdetails;
	}*/


	public VehicalDetail getVdetail2() {
		return vdetail2;
	}


	public void setVdetail2(VehicalDetail vdetail2) {
		this.vdetail2 = vdetail2;
	}


//	public InsuranceClaim getIclaim3() {
//		return iclaim3;
//	}
//
//
//	public void setIclaim3(InsuranceClaim iclaim3) {
//		this.iclaim3 = iclaim3;
//	}
//
//
//	
//	public RenewInsurance getRenewinsurance() {
//		return renewinsurance;
//	}
//
//
//	public void setRenewinsurance(RenewInsurance renewinsurance) {
//		this.renewinsurance = renewinsurance;
//	}
//	
	
}
