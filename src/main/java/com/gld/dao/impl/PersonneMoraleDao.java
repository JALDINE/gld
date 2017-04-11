package com.gld.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.gld.dao.IPersonneMoraleDao;
import com.gld.model.PersonneMorale;

@Repository("personneMoraleDao")
@Transactional
public class PersonneMoraleDao implements IPersonneMoraleDao {

	@Autowired
    private SessionFactory sessionFactory;
	@Override
	public Long save(PersonneMorale personneMorale) {
		return (Long) sessionFactory.getCurrentSession().save(personneMorale);
		
	}

	@Override
	public void update(PersonneMorale personneMorale) {
		sessionFactory.getCurrentSession().update(personneMorale);
		
	}

	@Override
	public void delete(PersonneMorale personneMorale) {
		sessionFactory.getCurrentSession().delete(personneMorale);
		
	}

	@Override
	public PersonneMorale findByPersonneMoraleId(String id) {
		Query q = sessionFactory.getCurrentSession().createQuery("from PersonneMorale where idGRC=:idGRC");
		 q.setParameter("idGRC", id);
		 PersonneMorale personneMorale = (PersonneMorale) q.uniqueResult();
	     return personneMorale;
		}

	@Override
	public List<PersonneMorale> getListPersonneMorale() {
		Query query= sessionFactory.getCurrentSession().
		        createQuery("from PersonneMorale");
		return (List<PersonneMorale>) query.list();
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	

}
