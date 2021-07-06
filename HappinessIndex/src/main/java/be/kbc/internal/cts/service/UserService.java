package be.kbc.internal.cts.service;

import be.kbc.internal.cts.entity.User;

public interface UserService{

	public User findByUserId(int userId);
	
}
