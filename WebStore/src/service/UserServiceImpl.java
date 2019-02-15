package service;

import model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.UserDAO;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDAO userDAO;

	@Override
	public User getUserById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertUser(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteUser(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateUser(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

}
