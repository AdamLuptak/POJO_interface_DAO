package dao;

import java.util.List;

import entities.Organization;

public interface DAOOrganization {

	public List<Organization> getAllStudents();

	public Organization getStudentbyStringParamter(String organizationName);

	public void updateStudent(Organization organization);

	public void deleteStudent(Organization organization);
}
