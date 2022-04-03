package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.dto.ClaimStatus;
import com.lti.dto.Claimdto;
import com.lti.dto.RegisterStatus;
import com.lti.entity.*;
import com.lti.exception.InsuranceServiceException;
import com.lti.service.AdminService;
import com.lti.service.ClaimService;

@RestController
@CrossOrigin
public class claimController {

	@Autowired
	private ClaimService cservice;
	
	@Autowired
	private AdminService Aservice;
	
	
	@RequestMapping("/claimdataentery")
	public ClaimStatus putClaimData(@RequestBody Claimdto cdto )
	{
		try {
			
		//	String vid="GJ-356565";
		//	VehicalDetail v= cservice.getdatavehical(vid);
			
			System.out.println(cdto);
			
			InsuranceClaim iclaim = new InsuranceClaim();
			InsurancePolicy ip=cdto.getIpolicy3();
			int i= ip.getPolicy_id();
			
			InsurancePolicy p=cservice.getdatapolicy(i);
			
			if(p.getStatus()!=("pending")) {
				
				iclaim.setIpolicy3(p);
				
				iclaim.setStatus(cdto.getStatus());
				
				iclaim.setAccident_detail(cdto.getAccident_detail());
				
				Admin a= cservice.getdataadmin(1);
				
				iclaim.setAdmin(a);
				iclaim.setAmount(0);
			
				int id=cservice.register(iclaim);
				
				ClaimStatus status = new ClaimStatus();
				status.setStatus(true);
				status.setRegisteredCustomerId(id);
				return status;

			}
			else {
				ClaimStatus status = new ClaimStatus();
				status.setStatus(false);
				
				status.setMessageIfAny("your policy is pending...");
				return status;

				
			}
			
		}
		catch(InsuranceServiceException e){}
		ClaimStatus status = new ClaimStatus();
		status.setStatus(false);
		
		status.setMessageIfAny("Data already exit");
		return status;
	}
	
	
	
	
}
