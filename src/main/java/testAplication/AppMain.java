package testAplication;

import daoGeneric.DAOGenericImpl;
import entities.User;

public class AppMain {

	public static void main(String[] args) {

		AppMain.create();

	}

	private static void create() {
		User user = new User("sws", "Adam", "luptak", "OriginAdam", "admin", false, false, "asdasd@gsd.com", 919328456);
		DAOGenericImpl<User> dao = new DAOGenericImpl<User>();
		dao.updateEntitie(user);
		dao.getAllEntities(new User());

	}

}
