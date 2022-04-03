package com.lti.dao;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Component;

import com.lti.entity.InsuranceClaim;

@Component
public class Claimdao extends GenericDao {
	

	public List<InsuranceClaim> fetchAll() {
	String status="pending";
	return entityManager.createQuery("select a.Accident_detail,a.status,a.id from InsuranceClaim a where a.status=: pw ").setParameter("pw", status).getResultList();
		//List<InsuranceClaim> list=q.getResultList();
		//return list;
		
	}
	
	
	public boolean isCustomerPresent(String email) {

		return (Long) entityManager.createQuery("select count(c) from CustomerDetails c where c.email =: em")
				.setParameter("em", email).getSingleResult() == 1 ? true : false;

	}

}
