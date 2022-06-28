package springmvc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springmvc.dao.UserDao;
import springmvc.pojo.User;

@Service
public class UserServices {
	@Autowired
	private UserDao userDao;

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public UserServices(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	public int create(User user) {
		return this.userDao.create(user);
	}
}
