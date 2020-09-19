package com.dxc.dao;

import org.springframework.data.repository.CrudRepository;

import com.dxc.beans.Users;

public interface UserRepository extends CrudRepository<Users, String> {
	
	//User findbyUser(String username,String password);	
	
}
