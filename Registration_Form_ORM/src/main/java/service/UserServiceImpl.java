package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Entity.User;
import dao.UserDao;

@Service
public class UserServiceImpl implements UserService {
	
	
	@Autowired
	private UserDao dao;
	
	@Override
	public void saveUser(User user) {
		// TODO Auto-generated method stub
		dao.saveUser(user);
	}

}
