package com.gld.dao.impl;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.gld.dao.IUserDao;
import com.gld.model.User;

@Repository("userDao")
@Transactional
public class UserDao implements IUserDao {

	@Autowired
    private SessionFactory sessionFactory;
	
	public Long save(User user) {
			return (Long) sessionFactory.getCurrentSession().save(user);
	}
	
	

	
	public void update(User user) {
		sessionFactory.getCurrentSession().update(user);
		
	}

	
	public void delete(User user) {
		sessionFactory.getCurrentSession().delete(user);
		
	}


	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}


	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}




	@Override
	public User findByUserIdGRC(String id) {
		Query q = sessionFactory.getCurrentSession().createQuery("from User where idUser=:idUser");
		 q.setParameter("idUser", id);
		 User user = (User) q.uniqueResult();
	     return user;
	}

	
}
