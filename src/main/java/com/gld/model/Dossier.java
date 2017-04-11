package com.gld.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Dossier")
public class Dossier {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	@OneToMany(fetch=FetchType.LAZY, cascade = CascadeType.ALL, mappedBy="dossier")
	private Set<Demande> demandes;
	@Column(name="idMoteurUn")
	private String idMoteurUn;
	@Column(name="idGroupe")
	private String idGroupe;
	@Column(name="idDossier")
	private String idDossier;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public Set<Demande> getDemandes() {
		return demandes;
	}
	public void setDemandes(Set<Demande> demandes) {
		this.demandes = demandes;
	}
	public String getIdMoteurUn() {
		return idMoteurUn;
	}
	public void setIdMoteurUn(String idMoteurUn) {
		this.idMoteurUn = idMoteurUn;
	}
	public String getIdGroupe() {
		return idGroupe;
	}
	public void setIdGroupe(String idGroupe) {
		this.idGroupe = idGroupe;
	}
	public String getIdDossier() {
		return idDossier;
	}
	public void setIdDossier(String idDossier) {
		this.idDossier = idDossier;
	}
	
	
	

}
