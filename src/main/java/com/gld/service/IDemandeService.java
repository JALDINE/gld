package com.gld.service;

import javax.ws.rs.Path;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.gld.bean.DemandeBean;
import com.gld.bean.DemandeRetourBean;

@Path("/rest/verifierGRC")
public interface IDemandeService {
	
	@POST
    @Consumes({MediaType.APPLICATION_JSON})
	@Produces("application/json")
	DemandeRetourBean demandeClient(DemandeBean venue);
	

}
