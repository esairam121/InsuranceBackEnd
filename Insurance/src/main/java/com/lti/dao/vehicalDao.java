package com.lti.dao;

import org.springframework.stereotype.Component;

@Component
public class vehicalDao extends GenericDao{
	public boolean isVehicalPresent(String vehicalnumber) {

		return (Long) entityManager.createQuery("select count(c) from VehicalDetail c where c.id =: em")
				.setParameter("em", vehicalnumber).getSingleResult() == 1 ? true : false;

	}
	
}
