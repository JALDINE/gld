package com.gld.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.gld.dao.IDossierDao;
import com.gld.model.Dossier;

@Repository 
@Transactional 
public class DossierDao implements IDossierDao{

	@Autowired
    private SessionFactory sessionFactory;
	
	public Long save(Dossier dossier) {
		return (Long) sessionFactory.getCurrentSession().save(dossier);
		
	}

	
	public void update(Dossier dossier) {
		sessionFactory.getCurrentSession().update(dossier);
		
	}

	
	public void delete(Dossier dossier) {
		sessionFactory.getCurrentSession().delete(dossier);
	}

	



	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}


	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}


	@Override
	public Dossier findByDossierId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
