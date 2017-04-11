package com.gld.dao.impl;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.gld.dao.IApplicationClientDao;
import com.gld.model.ApplicationClient;

@Repository("applicationClientDao")
@Transactional
public class ApplicationClientDao implements IApplicationClientDao{
	

	@Autowired
    private SessionFactory sessionFactory;

	@Override
	public Integer save(ApplicationClient lieu) {
		sessionFactory.getCurrentSession().save(lieu);
		return null;
	}

	@Override
	public void update(ApplicationClient lieu) {
		sessionFactory.getCurrentSession().update(lieu);
		
	}

	@Override
	public void delete(ApplicationClient lieu) {
		sessionFactory.getCurrentSession().delete(lieu);
		
	}

	@Override
	public ApplicationClient findByApplicationClientId(String id) {
		Query q = sessionFactory.getCurrentSession().createQuery("from ApplicationClient where codeIRT=:codeIRT");
		 q.setParameter("codeIRT", id);
		 ApplicationClient applicationClient = (ApplicationClient) q.uniqueResult();
	     return applicationClient;
		}

	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	


}
