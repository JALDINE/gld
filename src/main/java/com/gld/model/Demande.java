package com.gld.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Demande")
public class Demande {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	@Column(name="typeDemande")
	private String typeDemande;
	@Column(name="messageErreur")
	private String messageErreur;
	@Column(name="idCopieDossier")
	private String idCopieDossier;
	@Column(name="dateDemande")
	private Date dateDemande;
	@Column(name="status")
	private Boolean statut;
	@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idDossier")
	private Dossier dossier;
	@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idUser")
	private User user;
	@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idGRC")
	private PersonneMorale personneMorale;
	@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idApplicationClient")
	private ApplicationClient applicationClient;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}

	
	public Dossier getDossier() {
		return dossier;
	}
	public void setDossier(Dossier dossier) {
		this.dossier = dossier;
	}
	public PersonneMorale getPersonneMorale() {
		return personneMorale;
	}
	public void setPersonneMorale(PersonneMorale personneMorale) {
		this.personneMorale = personneMorale;
	}
	
	public String getTypeDemande() {
		return typeDemande;
	}
	public void setTypeDemande(String typeDemande) {
		this.typeDemande = typeDemande;
	}
	public String getMessageErreur() {
		return messageErreur;
	}
	public void setMessageErreur(String messageErreur) {
		this.messageErreur = messageErreur;
	}
	public String getIdCopieDossier() {
		return idCopieDossier;
	}
	public void setIdCopieDossier(String idCopieDossier) {
		this.idCopieDossier = idCopieDossier;
	}
	public Date getDateDemande() {
		return dateDemande;
	}
	public void setDateDemande(Date dateDemande) {
		this.dateDemande = dateDemande;
	}
	public Boolean getStatut() {
		return statut;
	}
	public void setStatut(Boolean statut) {
		this.statut = statut;
	}
	public ApplicationClient getApplicationClient() {
		return applicationClient;
	}
	public void setApplicationClient(ApplicationClient applicationClient) {
		this.applicationClient = applicationClient;
	}
	
	
	
}
