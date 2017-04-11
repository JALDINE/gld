package com.gld.dao.impl;


import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.gld.dao.IDemandeDao;
import com.gld.model.Demande;

@Repository("demandeDao")
@Transactional
public class DemandeDao implements IDemandeDao {

	@Autowired
    private SessionFactory sessionFactory;
 
   
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Long save(Demande demande) {
		return (Long) sessionFactory.getCurrentSession().save(demande);	
	}

	public void update(Demande demande) {
		sessionFactory.getCurrentSession().save(demande);
		
	}

	public void delete(Demande demande) {
		sessionFactory.getCurrentSession().delete(demande);
		
	}

	public Demande findByDemandeId(Long id) {
		return (Demande)sessionFactory.getCurrentSession().get(Demande.class, id);
	}

	@Override
	public List<Demande> getListDemandes() {
		// TODO Auto-generated method stub
		return null;
	}



}
