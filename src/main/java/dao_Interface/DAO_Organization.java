package dao_Interface;

import java.util.List;

import entities.Organization;

public interface DAO_Organization {

	public List<Organization> getAllOrganizations();

	public Organization getOrganizationbyStringParamter(String paramaterValue, String parameter);

	public void updateOrganization(Organization organization);

	public void deleteOrganization(Organization organization);
}
