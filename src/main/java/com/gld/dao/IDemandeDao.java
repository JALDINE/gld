package com.gld.dao;

import java.util.List;

import com.gld.model.Demande;

public interface IDemandeDao {

	Long save(Demande venue);
	void update(Demande venue);
	void delete(Demande venue);
	Demande findByDemandeId(Long id);
	List<Demande> getListDemandes();
}
