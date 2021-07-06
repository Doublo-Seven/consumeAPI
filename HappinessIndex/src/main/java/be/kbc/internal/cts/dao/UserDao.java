package be.kbc.internal.cts.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import be.kbc.internal.cts.entity.User;

@Repository
public interface UserDao extends JpaRepository<User, Integer> {
	
	public User findByUserId(int userId);
	

}
