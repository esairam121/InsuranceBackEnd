package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

@Component
public class GenericDao {
	@PersistenceContext
	protected EntityManager entityManager;
	
	
	public Object save(Object object) {
		return entityManager.merge(object); //merge works for insert and update both
	}
	
	public <E> E fetchById(Class<E> clazz, Object pk) {
		
		E e= entityManager.find(clazz, pk); //find method generated select query
		return e;
	}}

