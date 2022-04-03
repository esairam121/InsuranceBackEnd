package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lti.dao.insuranceDao;
import com.lti.dto.RegisterStatus;
import com.lti.entity.CustomerDetails;
import com.lti.entity.InsurancePolicy;
import com.lti.exception.InsuranceServiceException;

@Service
public class PolicyService {
	@Autowired
	private insuranceDao idao;
	
	@Transactional
	public int register(@RequestBody InsurancePolicy ipolicy) {
		if(idao.isPolicyPresent(ipolicy.getPolicy_id()))
		    throw new InsuranceServiceException("Customer already Registered!");
		else {
		   InsurancePolicy updatedCustomer=(InsurancePolicy) idao.save(ipolicy);
		return updatedCustomer.getPolicy_id();
		
		}	
	}
		
}
