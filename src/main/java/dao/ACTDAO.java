package dao;

import java.util.List;

import entities.ACL;

public interface ACTDAO {
	public List<ACL> getAllStudents();

	public ACL getStudentbyStringParamter(String nameACL);

	public void updateStudent(ACL acl);

	public void deleteStudent(ACL acl);
}
