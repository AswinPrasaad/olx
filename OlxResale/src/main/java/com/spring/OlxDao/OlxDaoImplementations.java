package com.spring.OlxDao;

import java.util.Iterator;
import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.OlxService.OlxService;
import com.spring.model.Registration;


@Repository
public class OlxDaoImplementations implements OlXDaoInterface{

	@Autowired
  private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void add(Registration register) {
	  sessionFactory.getCurrentSession().save(register);
		
	}

	@Override
	public Registration validate(Registration user) {
		String uname=user.getUserId();
		String psw=user.getUser_password();
		SQLQuery query=sessionFactory.getCurrentSession().createSQLQuery("select * from REGISTRATION where userId=? and user_password=?").addEntity(Registration.class);
		query.setParameter(0, uname);
		query.setParameter(1, psw);
		List ls=query.list();
		Iterator it=ls.iterator();
		Registration us=null;
		while(it.hasNext()){
			us=(Registration) it.next();
			
		}
		return us;
	}
	}

	

