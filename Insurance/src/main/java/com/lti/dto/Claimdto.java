package com.lti.dto;

import com.lti.entity.InsurancePolicy;

public class Claimdto {

	private int id;
	private String status;
	private String Accident_detail;

	private InsurancePolicy ipolicy3;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getAccident_detail() {
		return Accident_detail;
	}

	public void setAccident_detail(String accident_detail) {
		Accident_detail = accident_detail;
	}

	public InsurancePolicy getIpolicy3() {
		return ipolicy3;
	}

	public void setIpolicy3(InsurancePolicy ipolicy3) {
		this.ipolicy3 = ipolicy3;
	}
	
	
	
}
