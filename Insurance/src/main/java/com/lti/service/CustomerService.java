package com.lti.service;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

import com.lti.exception.*;
import com.lti.dao.CustomerDao;
import com.lti.dto.Login;
import com.lti.entity.CustomerDetails;

@Service
public class CustomerService {
	@Autowired
	private CustomerDao customerDao;
	
	
	@Transactional
	public int register(@RequestBody CustomerDetails customer) {
		if(customerDao.isCustomerPresent(customer.getEmail()))
		    throw new InsuranceServiceException("Customer already Registered!");
		else {
		   CustomerDetails updatedCustomer=(CustomerDetails) customerDao.save(customer);
		return updatedCustomer.getId();
		
		}	
	}
	@Transactional
	//public void login(String email,String pass) {
	public CustomerDetails login(CustomerDetails customerr) {
		try {
			int id=customerDao.isValidUserV2(customerr.getEmail(),customerr.getPass());
			CustomerDetails customer=customerDao.fetchById(CustomerDetails.class, id);
			return customer;
		}
		
		catch(NoResultException e) {
			throw new InsuranceServiceException("Invalid Email/Password! ");
		}
	
	}
	
}
