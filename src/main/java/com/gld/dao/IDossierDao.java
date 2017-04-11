package com.gld.dao;


import com.gld.model.Dossier;

public interface IDossierDao {
	
	Long save(Dossier dossier);
	void update(Dossier dossier);
	void delete(Dossier dossier);
	Dossier findByDossierId(Long id);

}
