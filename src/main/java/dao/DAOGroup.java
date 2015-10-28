package dao;

import java.util.List;

import entities.Group;

public interface DAOGroup {
	public List<Group> getAllStudents();

	public Group getStudentbyStringParamter(String groupName);

	public void updateStudent(Group group);

	public void deleteStudent(Group group);
}
