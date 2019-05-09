package top.vabook.service.impl;

import java.sql.SQLException;

import top.vabook.dao.UserDao;
import top.vabook.dao.impl.UserDaoImpl;
import top.vabook.domain.User;
import top.vabook.service.UserService;

/**
* @author vabook@163.com
* 
* 
*/
public class UserServiceImpl implements UserService {

	@Override
	public void userRegist(User user) throws SQLException {
		UserDao userDao = new UserDaoImpl();
		userDao.userRegist(user);
	}

	@Override
	public boolean userActive(int code) throws SQLException {
		UserDao UserDao=new UserDaoImpl();
		User user=UserDao.userActive(code);
		if (null != user) {
			user.setState(code);
			user.setCode(null);
			UserDao.update(user);
			return true;
		}else {
			return true;
		}
	}

	@Override
	public User userLogin(User user) throws SQLException {
		UserDao userDao = new UserDaoImpl();
		User uu = userDao.userLogin(user);
		if (null == uu) {
			throw new RuntimeException("密码有误!");
		}else if (user.getState() == 0) {
			throw new RuntimeException("用户未激活!");
		} else {
			return uu;
		}
	}

}
