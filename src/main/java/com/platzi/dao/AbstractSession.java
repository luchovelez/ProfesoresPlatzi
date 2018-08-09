package com.platzi.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public abstract class AbstractSession {
	
	private SessionFactory factory;
	
	protected Session getSession() {
		return factory.getCurrentSession();
	}
	
	

}
