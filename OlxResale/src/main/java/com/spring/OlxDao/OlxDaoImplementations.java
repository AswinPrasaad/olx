package com.spring.OlxDao;
import java.util.Iterator;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import com.spring.model.Item;
import com.spring.model.Cart;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.SharedSessionContract;
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
	public Boolean getUserObject(Registration user1) {
		Session session = sessionFactory.openSession();
		boolean userFound = false;
		//Query using Hibernate Query Language
		String SQL_QUERY =" from Registration as r where r.userId=? and r.user_password=?";
		Query query = (Query) session.createQuery(SQL_QUERY);
		query.setParameter(0,user1.getUserId());
		query.setParameter(1,user1.getUser_password());
		List list = ((org.hibernate.Query) query).list();

		if ((list != null) && (list.size() > 0)) {
			userFound= true;
		}

		session.close();
		return userFound;  	

	}
}









