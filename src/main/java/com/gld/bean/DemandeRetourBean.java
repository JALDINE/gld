package com.gld.bean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
		"idMoteur1",
    "messageErreur",

})
@XmlRootElement(name = "AnnonceBean")
public class DemandeRetourBean {
	
		private String idMoteur1;
		private String messageErreur;
		public String getIdMoteur1() {
			return idMoteur1;
		}
		public void setIdMoteur1(String idMoteur1) {
			this.idMoteur1 = idMoteur1;
		}
		public String getMessageErreur() {
			return messageErreur;
		}
		public void setMessageErreur(String messageErreur) {
			this.messageErreur = messageErreur;
		}
		
}
