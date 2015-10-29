package dao_Interface;

import java.util.List;

import entities.Group;

public interface DAO_Group {
	public List<Group> getAllGroups();

	public Group getGroupbyStringParamter(String paramaterValue, String parameter);

	public void updateGroup(Group group);

	public void deleteGroup(Group group);
}
