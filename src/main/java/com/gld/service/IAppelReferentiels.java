package com.gld.service;

import com.gld.bean.ClientBean;

public interface IAppelReferentiels {
	ClientBean callRCT(String idGRC);
	ClientBean callGRC(String idGRC);
	String callINTA(String idGRC);

}
