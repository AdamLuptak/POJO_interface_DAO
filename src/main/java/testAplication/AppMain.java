package testAplication;

import javax.swing.JEditorPane;

import daoGeneric.DAOGenericImpl;
import daoGeneric.JPAHelper;
import entities.Organization;
import entities.User;

public class AppMain {

	public static void main(String[] args) {
		AppMain.create();
	}

	private static void create() {
		User user = new User("sws", "Adam", "luptak", "OriginAdam", "admin", false, false, "asdasd@gsd.com", 919328456);
		Organization or = new Organization("Coca cola", "bavi dobre");
		or.setUsers(user);
		user.setOrganizations(or);
		JPAHelper.getEntityManager().persist(or);
		DAOGenericImpl<User> dao = new DAOGenericImpl<User>();
		dao.updateEntitie(user);
		dao.getAllEntities(new User());

	}

}
