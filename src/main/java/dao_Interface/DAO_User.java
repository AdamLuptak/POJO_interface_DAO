package dao_Interface;

import java.util.List;

import entities.User;

public interface DAO_User {

	public List<User> getAllUsers();

	public User getUserStringParamter(String paramaterValue, String parameter);

	public void updateUser(User user);

	public void deleteUser(User user);

}
