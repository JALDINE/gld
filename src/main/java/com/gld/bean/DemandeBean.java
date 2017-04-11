package com.gld.bean;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;




@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
	    "idDossier",
	    "idGRC",
	    "typeDemande",
	    "idDossierCopie",
	    "idUser",
	    "codeIRT"
})
@XmlRootElement(name = "Dossier")
public class DemandeBean {
	private String idDossier;
	private String idGRC;
	private String typeDemande;
	private String idDossierCopie;
	private String codeIRT;
	private String idUser;
	
	public String getIdDossier() {
		return idDossier;
	}
	public void setIdDossier(String idDossier) {
		this.idDossier = idDossier;
	}
	public String getIdGRC() {
		return idGRC;
	}
	public void setIdGRC(String idGRC) {
		this.idGRC = idGRC;
	}
	public String getTypeDemande() {
		return typeDemande;
	}
	public void setTypeDemande(String typeDemande) {
		this.typeDemande = typeDemande;
	}
	public String getIdDossierCopie() {
		return idDossierCopie;
	}
	public void setIdDossierCopie(String idDossierCopie) {
		this.idDossierCopie = idDossierCopie;
	}
	public String getCodeIRT() {
		return codeIRT;
	}
	public void setCodeIRT(String codeIRT) {
		this.codeIRT = codeIRT;
	}
	public String getIdUser() {
		return idUser;
	}
	public void setIdUser(String idUser) {
		this.idUser = idUser;
	}
	
	
}
