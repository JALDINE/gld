package com.gld.model;

import java.util.List;

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
@Table(name="PersonneMorale")
public class PersonneMorale {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	@Column(name="idGRC")
	private String idGRC;
	@Column(name="categorieTiersReglementaire")
	private String categorieTiersReglementaire;
	@Column(name="raisonSocial")
	private String raisonSocial;
	@OneToMany(fetch=FetchType.LAZY, cascade = CascadeType.ALL, mappedBy="personneMorale")
	private List<Demande> demandes;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getIdGRC() {
		return idGRC;
	}
	public void setIdGRC(String idGRC) {
		this.idGRC = idGRC;
	}
	public String getCategorieTiersReglementaire() {
		return categorieTiersReglementaire;
	}
	public void setCategorieTiersReglementaire(String categorieTiersReglementaire) {
		this.categorieTiersReglementaire = categorieTiersReglementaire;
	}
	public String getRaisonSocial() {
		return raisonSocial;
	}
	public void setRaisonSocial(String raisonSocial) {
		this.raisonSocial = raisonSocial;
	}
	public List<Demande> getDemandes() {
		return demandes;
	}
	public void setDemandes(List<Demande> demandes) {
		this.demandes = demandes;
	}
	
}
