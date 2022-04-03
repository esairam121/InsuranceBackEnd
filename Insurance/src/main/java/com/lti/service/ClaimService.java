package com.lti.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

import com.lti.dao.Claimdao;

import com.lti.dto.admindto;
import com.lti.entity.*;
import com.lti.exception.InsuranceServiceException;


@Component
public class ClaimService {
    @Autowired
	private Claimdao cdao;
    @Transactional
    public List<InsuranceClaim>getclaim( ) {
    	
		return cdao.fetchAll();
    	
    }
    
    
    
    @Transactional
	public int register(@RequestBody InsuranceClaim cla) {
    	  InsuranceClaim claim =(InsuranceClaim) cdao.save(cla);
  		return claim.getId();
	}
    
    
    @Transactional
	public VehicalDetail getdatavehical(String id) {
    	return cdao.fetchById(VehicalDetail.class, id);
		
	}
    
    @Transactional
	public InsurancePolicy getdatapolicy(int id) {
    	return cdao.fetchById(InsurancePolicy.class, id);
		
	}
    
    @Transactional
	public Admin getdataadmin(int id) {
    	return cdao.fetchById(Admin.class, id);
		
	}
    
    
	
}
