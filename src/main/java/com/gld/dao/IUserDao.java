package com.gld.dao;

import com.gld.model.User;

public interface IUserDao {

	Long save(User user);
	void update(User user);
	void delete(User user);
	User findByUserIdGRC(String id);
}
