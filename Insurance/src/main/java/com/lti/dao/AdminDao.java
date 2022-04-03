package com.lti.dao;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.lti.entity.InsuranceClaim;

@Component
public class AdminDao extends GenericDao  {
	
	public int isValidUser(String email, String password) {
		return (Integer) entityManager
				.createQuery("select a.admin_id from Admin a where a.email=: id and a.pass =: pw")
				.setParameter("id", email).setParameter("pw", password).getSingleResult();

	}
	
	@Transactional
	public Object updateclaim(InsuranceClaim c) {
		 return  save(c);
	//	return "updated";
		
	}

}
