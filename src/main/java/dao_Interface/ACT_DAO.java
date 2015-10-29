package dao_Interface;

import java.util.List;

import entities.ACL;

public interface ACT_DAO {
	public List<ACL> getAllACLs();

	public ACL getACLbyStringParamter(String paramaterValue, String parameter);

	public void updateACL(ACL acl);

	public void deleteACL(ACL acl);
}
