package com.gld.dao;

import com.gld.model.ApplicationClient;

public interface IApplicationClientDao {

	Integer save(ApplicationClient applicationClient);
	void update(ApplicationClient applicationClient);
	void delete(ApplicationClient applicationClient);
	ApplicationClient findByApplicationClientId(String id);

}
