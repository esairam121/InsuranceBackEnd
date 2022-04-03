package com.lti.service;

import java.util.List;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.lti.dao.AdminDao;
import com.lti.dao.GenericDao;
import com.lti.dao.insuranceDao;
import com.lti.dto.Login;
import com.lti.entity.Admin;
import com.lti.entity.InsuranceClaim;
import com.lti.entity.InsurancePolicy;
import com.lti.exception.InsuranceServiceException;

@Component
public class AdminService {
  
	@Autowired
	private AdminDao admindao;
	
	@Autowired
	private insuranceDao idao;
	
	
	public Admin login(Login log) {
		try {
			
		int id=admindao.isValidUser(log.getEmail(),log.getPassword());
		
		Admin ads = admindao.fetchById(Admin.class, id);
		
		return ads;
		}
		catch(NoResultException e) {
			throw new InsuranceServiceException("invalid Email/Password");
		}
		
	}
	
	@Transactional
	public InsuranceClaim update(InsuranceClaim c) {

	return (InsuranceClaim)	admindao.save(c);
		
	}
	public List<InsurancePolicy> fetchpolicydata() {
		 return idao.fetchAll();
	
		
		
	}
	

	public InsuranceClaim getclaimdata(int id) {
		// TODO Auto-generated method stub
		InsuranceClaim c= admindao.fetchById(InsuranceClaim.class, id);
		return c;
	}
	
	public InsurancePolicy getpolicydata(int id) {
		// TODO Auto-generated method stub
		InsurancePolicy c= admindao.fetchById(InsurancePolicy.class, id);
		
		return c;
	}
	@Transactional
	public InsurancePolicy updatepolicy(InsurancePolicy c) {

	return (InsurancePolicy)	admindao.save(c);
		
	}
	
	@Transactional
	public Admin getAdmindata(int id) {
    	return admindao.fetchById(Admin.class, id);
		
	}
}
