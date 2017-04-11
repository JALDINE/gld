package com.gld.service.impl;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.gld.bean.ClientBean;
import com.gld.bean.DemandeBean;
import com.gld.bean.DemandeRetourBean;
import com.gld.dao.IDossierDao;
import com.gld.dao.IPersonneMoraleDao;
import com.gld.dao.IApplicationClientDao;
import com.gld.dao.IUserDao;
import com.gld.model.ApplicationClient;
import com.gld.model.Dossier;
import com.gld.model.PersonneMorale;
import com.gld.model.User;
import com.gld.model.Demande;
import com.gld.dao.IDemandeDao;
import com.gld.service.IAppelReferentiels;
import com.gld.service.IDemandeService;
@Controller
public class DemandeService implements IDemandeService {

	@Autowired
	private IDemandeDao demandeDao;
	@Autowired
	private IUserDao userDao;
	@Autowired
	private IDossierDao dossierDao;
	@Autowired
	private IApplicationClientDao applicationClientDao;
	@Autowired
	private IPersonneMoraleDao personneMoraleDao;
	@Override
	//find id moteur
	public DemandeRetourBean demandeClient(DemandeBean demandeBean) {
		//verifier la RG-M-GLD1-001
		DemandeRetourBean demandeRetour=new DemandeRetourBean();
		IAppelReferentiels appelReferentiel=new AppelReferentiels();
		Date date = new Date();
		Demande demande;
		ClientBean client=new ClientBean();
		//traiter les demandes de type nouvelle demande
		if (demandeBean.getTypeDemande().equals("01")){
			client=appelReferentiel.callGRC(demandeBean.getIdGRC());
			if (client.getSegmentMarche().equals("29990")){
				client=appelReferentiel.callRCT(demandeBean.getIdGRC());
			}
			demande=new Demande();
			demande.setApplicationClient(getApplicationClient(demandeBean.getCodeIRT()));
			demande.setTypeDemande(demandeBean.getTypeDemande());
			demande.setPersonneMorale(getPersonneMorale(client));
			demande.setIdCopieDossier(demandeBean.getIdDossierCopie());
			demande.setUser(getUser(demandeBean.getIdUser()));
			demande.setDateDemande(date);
			demande.setStatut(true);
			demande.setDossier(getDossier(demandeBean.getIdDossier()));
			demandeDao.save(demande);
			
		}
		//create a sequence moteur id and add it to the id
		String idMoteur=demandeBean.getIdDossier()+client.getIdGRC()+client.getIdRCT();	
		demandeRetour.setIdMoteur1(idMoteur);
		demandeRetour.setMessageErreur("messageErreur");
		return demandeRetour;
	}
	private PersonneMorale getPersonneMorale(ClientBean client){
		PersonneMorale pm;
		pm=personneMoraleDao.findByPersonneMoraleId(client.getIdGRC());
		if (pm==null){
			pm=new PersonneMorale();
			pm.setIdGRC(client.getIdGRC());
			pm.setRaisonSocial(client.getRaisonSociale());
			pm.setCategorieTiersReglementaire(client.getCategorieTiersReglementaire());
			personneMoraleDao.save(pm);
		}
		return pm;
	}
	private ApplicationClient getApplicationClient(String idIRT){
		ApplicationClient client;
		client=applicationClientDao.findByApplicationClientId(idIRT);
		if (client==null){
			client=new ApplicationClient();
			client.setCodeIRT(idIRT);
			applicationClientDao.save(client);	
		}
		return client;
	}
	private User getUser(String idUser){
		User user;
		user=userDao.findByUserIdGRC(idUser);
		if (user==null){
			user=new User();
			user.setIdUser(idUser);
			userDao.save(user);
		}
		return user;
		
	}
	private Dossier getDossier(String idDossier){
		Dossier dossier=new Dossier();
		dossier.setIdDossier(idDossier);
		dossier.setIdGroupe("123");
		dossier.setIdMoteurUn("1");
		dossierDao.save(dossier);
		return dossier;
	}
	public IDemandeDao getDemandeDao() {
		return demandeDao;
	}
	public void setDemandeDao(IDemandeDao demandeDao) {
		this.demandeDao = demandeDao;
	}
	public IUserDao getUserDao() {
		return userDao;
	}
	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}
	public IDossierDao getDossierDao() {
		return dossierDao;
	}
	public void setDossierDao(IDossierDao dossierDao) {
		this.dossierDao = dossierDao;
	}
	public IApplicationClientDao getApplicationClientDao() {
		return applicationClientDao;
	}
	public void setApplicationClientDao(IApplicationClientDao applicationClientDao) {
		this.applicationClientDao = applicationClientDao;
	}
	public IPersonneMoraleDao getPersonneMoraleDao() {
		return personneMoraleDao;
	}
	public void setPersonneMoraleDao(IPersonneMoraleDao personneMoraleDao) {
		this.personneMoraleDao = personneMoraleDao;
	}
	
	


}
