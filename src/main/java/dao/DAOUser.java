package dao;

import java.util.List;

import entities.User;

public interface DAOUser {

	public List<User> getAllStudents();

	public User getStudentbyStringParamter(String paramaterValue, String parameter);

	public void updateStudent(User user);

	public void deleteStudent(User user);

}
