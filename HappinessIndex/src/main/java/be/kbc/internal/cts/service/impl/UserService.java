package be.kbc.internal.cts.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import be.kbc.internal.cts.dao.UserDao;
import be.kbc.internal.cts.entity.User;

@Service
public class UserService implements be.kbc.internal.cts.service.UserService {

	@Autowired
	UserDao userDao;
	
	@Override
	public User findByUserId(int userId) {
		// TODO Auto-generated method stub
		return userDao.findByUserId(userId);
	}

}
