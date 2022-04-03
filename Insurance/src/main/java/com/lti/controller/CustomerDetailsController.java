package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.service.CustomerService;
import com.lti.entity.CustomerDetails;
import com.lti.dao.GenericDao;
import com.lti.dto.*;
import com.lti.exception.*;

@RestController
@CrossOrigin
public class CustomerDetailsController {

	@Autowired
	private CustomerService customerService;

	@RequestMapping("/customerregister.api")
	public RegisterStatus register(@RequestBody CustomerDetails customer) {
		try {
			int id = customerService.register(customer);
			RegisterStatus status = new RegisterStatus();
			status.setStatus(true);
			status.setRegisteredCustomerId(id);
			return status;

			// we should return some json instead
		} catch (InsuranceServiceException e) {

			RegisterStatus status = new RegisterStatus();
			status.setStatus(false);
			status.setMessageIfAny(e.getMessage());
			return status;
		}
	}
	
	@RequestMapping("/login.api")
	public LoginStatus login(@RequestBody CustomerDetails customer){
		try {
			CustomerDetails customer1=customerService.login(customer);
			LoginStatus loginStatus= new LoginStatus();
			loginStatus.setStatus(true);
			loginStatus.setCustomerId(customer1.getId());
			loginStatus.setCustomerName(customer1.getName());
			return loginStatus;
		}
		catch(InsuranceServiceException e) {
			LoginStatus loginStatus= new LoginStatus();
			loginStatus.setStatus(false);
			loginStatus.setMessageIfAny(e.getMessage());
			return loginStatus;
		}
	}
	
}
