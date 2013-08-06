package net.slipp.dao.user;

import java.sql.SQLException; 

import net.slipp.domain.user.User;

public interface UserDao {

	void insert(User user) throws SQLException;
	User findByUserId(String userId) throws SQLException;
	
	/* 
	private static Map<String, User> users = new HashMap<String, User>();
	
	public void insert(User user) throws SQLException {
		users.put(user.getUserId(), user);
	}

	public User findByUserId(String userId) throws SQLException {
		return users.get(userId);
	}
	*/ 
}
