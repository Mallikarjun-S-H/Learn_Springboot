package service;


import org.springframework.stereotype.Repository;

import Entity.User;

@Repository
public interface UserService {
	
	public void saveUser(User user); 
}
