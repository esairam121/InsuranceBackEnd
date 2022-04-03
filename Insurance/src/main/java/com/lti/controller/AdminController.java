package com.lti.controller;

import java.util.List;  

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.dto.Login;
import com.lti.dto.LoginStatus;
import com.lti.dto.RegisterStatus;
import com.lti.dto.admindto;
import com.lti.dto.data;
import com.lti.entity.Admin;
import com.lti.exception.InsuranceServiceException;
import com.lti.service.AdminService;
import com.lti.service.ClaimService;
import com.lti.entity.*;
@RestController
@CrossOrigin
public class AdminController {

	@Autowired
	private AdminService adminservice;
	
	@Autowired
	private ClaimService cservice;

	@RequestMapping("/adminLogin.api")
	public LoginStatus adminLogin(@RequestBody Login log) {
		
		try {
	 Admin admin = adminservice.login(log);
	 LoginStatus loginS = new LoginStatus();
	 loginS.setStatus(true);
	 loginS.setCustomerId(admin.getAdmin_id());
	 loginS.setCustomerName(admin.getName());
	 return loginS;
	
		}
		catch(InsuranceServiceException e) {
			 LoginStatus loginS = new LoginStatus();
			 loginS.setStatus(false);
			 loginS.setMessageIfAny(e.getMessage());
			 return loginS;
			
			
		}
	}
	
	@GetMapping("/claimdata")
	public List<InsuranceClaim> getclaim() {
		
		List<InsuranceClaim> list=cservice.getclaim();
		
		return list;
		
		
		
		
	}
	@GetMapping("/policydata")
	public List<InsurancePolicy> getpolicy() {
		
		List<InsurancePolicy> list=adminservice.fetchpolicydata();
		
		return list;
		
		
		
		
	}
	

	/*@RequestMapping("/updateClaim")
	public String UpdateClaim(@RequestBody InsuranceClaim c) {
	
		System.out.print(c);
	return adminservice.update(c);
		
	//return "updated";
	}*/
	
	
	@RequestMapping("/updateClaim")
	public RegisterStatus UpdateClaim2(@RequestBody data d) {
		
	
			try {
			InsuranceClaim c =adminservice.getclaimdata(d.getId());
			
			c.setAmount(d.getAmount());
			c.setStatus("Accepted");
			InsuranceClaim str = adminservice.update(c);
			
			RegisterStatus loginS = new RegisterStatus();
			 loginS.setStatus(true);
			 loginS.setMessageIfAny(str.getStatus());
			 return loginS;}
			catch(InsuranceServiceException e) {
				

				RegisterStatus loginS = new RegisterStatus();
				 loginS.setStatus(true);
				 loginS.setMessageIfAny(e.getMessage());
				 return loginS;
			}
			 
			
			
		
	
		
		
	}
	@RequestMapping("/updatepolicy")
	public RegisterStatus Updatepolicy(@RequestBody data d) {
		try {
	InsurancePolicy c =adminservice.getpolicydata(d.getId());
	
	
	c.setStatus("Accepted");
	InsurancePolicy str = adminservice.updatepolicy(c);
	
	//return str.getPolicy_id();
	
	RegisterStatus loginS = new RegisterStatus();
	 loginS.setStatus(true);
	 loginS.setMessageIfAny(str.getStatus());
	 return loginS;
		}
		catch (InsuranceServiceException e){

			RegisterStatus loginS = new RegisterStatus();
			 loginS.setStatus(true);
			 loginS.setMessageIfAny(e.getMessage());
			 return loginS;
		}
		
	}
	
	
	
}
