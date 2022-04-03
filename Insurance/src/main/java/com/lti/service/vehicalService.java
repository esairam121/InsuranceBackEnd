package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

import com.lti.dao.vehicalDao;
import com.lti.entity.CustomerDetails;
import com.lti.entity.VehicalDetail;
import com.lti.exception.InsuranceServiceException;

@Service
public class vehicalService {

	@Autowired
	private vehicalDao vdao;
	
	@Transactional
	public String register(@RequestBody VehicalDetail vdetail) {
		if(vdao.isVehicalPresent(vdetail.getId()))
		    throw new InsuranceServiceException("Customer already Registered!");
		else {
		   VehicalDetail updatedCustomer=(VehicalDetail) vdao.save(vdetail);
		return updatedCustomer.getId();
		
		}
		/*
		VehicalDetail updatedCustomer=(VehicalDetail) vdao.save(vdetail);
		return updatedCustomer.getId();*/
		
			
	}
	
	
}
