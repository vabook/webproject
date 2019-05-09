package top.vabook.dao.impl;
/**
* @author vabook@163.com
* 
*
*/

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import top.vabook.dao.UserDao;
import top.vabook.domain.User;
import top.vabook.util.JDBCUtils;

public class UserDaoImpl implements UserDao {

	@Override
	public void userRegist(User user) throws SQLException {
		String sql = "INSERT INTO USER VALUES(?,?,?,?,?,?,?,?,?,?)";
		QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());
		Object[] params = {user.getUid(),user.getUsername(),user.getPassword(),user.getName(),user.getEmail(),user.getTelephone(),user.getBirthday(),user.getSex(),user.getState(),user.getCode()};
		qr.update(sql,params);
	}

	@Override
	public User userActive(int code) throws SQLException {
		String sql = "select * from user where code=?";
		QueryRunner qr=new QueryRunner(JDBCUtils.getDataSource());
		User user=qr.query(sql, new BeanHandler<User>(User.class),code);
		return user;
	}

	@Override
	public void update(User user) {
		
	}

	@Override
	public User userLogin(User user) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
