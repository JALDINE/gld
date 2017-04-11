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
@Table(name="ApplicationClient")
public class ApplicationClient {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	@Column(name="codeIRT")
	private String codeIRT;
	@OneToMany(fetch=FetchType.LAZY, cascade = CascadeType.ALL, mappedBy="applicationClient")
	private List<Demande> demandes;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getCodeIRT() {
		return codeIRT;
	}
	public void setCodeIRT(String codeIRT) {
		this.codeIRT = codeIRT;
	}
	public List<Demande> getDemandes() {
		return demandes;
	}
	public void setDemandes(List<Demande> demandes) {
		this.demandes = demandes;
	}
	
	
	
}
