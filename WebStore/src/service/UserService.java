package service;

import model.User;

public interface UserService {

	public User getUserById(Integer id);

	public int insertUser(User user);

	public int deleteUser(User user);

	public int updateUser(User user);

}
