package com.respositories;

import org.springframework.data.repository.CrudRepository;

import com.model.User;

public interface UserDAO extends CrudRepository<User,Long>{
	public User getUserByUsername(String username);

}
