package dao;

import model.User;

public interface UserDAO {

	public User getUserById(Integer id);

	public int insertUser(User user);

	public int deleteUser(User user);

	public int updateUser(User user);

}
