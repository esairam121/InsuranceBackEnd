package com.lti.dao;

import org.springframework.stereotype.Component;

@Component
public class CustomerDao extends GenericDao {
	public boolean isCustomerPresent(String email) {

		return (Long) entityManager.createQuery("select count(c) from CustomerDetails c where c.email =: em")
				.setParameter("em", email).getSingleResult() == 1 ? true : false;

	}

	// if there no customer with the given combination , this verison will throw an
	// exception
	public int isValidUser(String email, String pass) {
		return (Integer) entityManager.createQuery("select c.id from CustomerDetails c where c.email = :em and c.pass= :pw")
				.setParameter("em", email).setParameter("pw", pass).getSingleResult();

	}

	public int isValidUserV2(String email, String pass) {
		return (Integer) entityManager.createQuery("select c.id from CustomerDetails c where c.email =:em and c.pass=:pw")
				.setParameter("em", email).setParameter("pw", pass).getSingleResult();
	}

}
