package top.vabook.dao;

import java.sql.SQLException;

import top.vabook.domain.User;

/**
* @author vabook@163.com
* 
*
*/


public interface UserDao {
	void userRegist(User user) throws SQLException;
	User userActive(int code) throws SQLException;
	void update(User user);
	User userLogin(User user);
}
