package top.vabook.service;

import java.sql.SQLException;

import top.vabook.domain.User;

/**
* @author vabook@163.com
* 
*
*/
public interface UserService {

	void userRegist(User user)throws SQLException ;

	boolean userActive(int code)throws SQLException ;

	User userLogin(User user)throws SQLException;
}
