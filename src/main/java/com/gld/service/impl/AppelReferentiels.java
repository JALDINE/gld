package com.gld.service.impl;

import com.gld.bean.ClientBean;
import com.gld.service.IAppelReferentiels;

public class AppelReferentiels implements IAppelReferentiels {

	@Override
	public ClientBean callRCT(String idGRC) {
		ClientBean client=new ClientBean();
		client.setIdGRC("1TestR");
		client.setCategorieTiersReglementaire("testRCT");
		client.setSegmentMarche("29990");
		client.setRaisonSociale("TestRCT");
		client.setSecteurSuivi("TestRCT");
		return client;
	}

	@Override
	public ClientBean callGRC(String idGRC) {
		ClientBean client=new ClientBean();
		client.setIdGRC("1TestG");
		client.setCategorieTiersReglementaire("testGRC");
		client.setRaisonSociale("TestGRC");
		client.setSegmentMarche("288827");
		client.setSecteurSuivi("TestGRC");
		return client;
	}

	@Override
	public String callINTA(String idGRC) {
		// TODO Auto-generated method stub
		return null;
	}

}
