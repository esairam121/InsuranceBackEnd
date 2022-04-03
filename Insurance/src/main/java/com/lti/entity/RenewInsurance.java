package com.lti.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Renew_Insurance")
public class RenewInsurance {
	@Id
	@GeneratedValue
	@Column(name = "renew_table_id")
	private int id;

	@Column(name = "new_date")
	private Date newDate;

	@Column(name = "renew_amt")
	private double renewAmt;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "policy_id")
	private InsurancePolicy ipolicy4;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getNewDate() {
		return newDate;
	}

	public void setNewDate(Date newDate) {
		this.newDate = newDate;
	}

	public double getRenewAmt() {
		return renewAmt;
	}

	public void setRenewAmt(double renewAmt) {
		this.renewAmt = renewAmt;
	}

	public InsurancePolicy getIpolicy4() {
		return ipolicy4;
	}

	public void setIpolicy4(InsurancePolicy ipolicy4) {
		this.ipolicy4 = ipolicy4;
	}

	
}
