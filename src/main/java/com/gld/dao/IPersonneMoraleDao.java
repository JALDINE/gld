package com.gld.dao;

import java.util.List;

import com.gld.model.PersonneMorale;

public interface IPersonneMoraleDao {

	Long save(PersonneMorale personneMorale);
	void update(PersonneMorale personneMorale);
	void delete(PersonneMorale personneMorale);
	PersonneMorale findByPersonneMoraleId(String id);
	List<PersonneMorale> getListPersonneMorale();
}
