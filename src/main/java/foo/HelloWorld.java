package foo;

import daoGeneric.DAOGenericImpl;
import daoGeneric.JPAHelper;
import entities.User;

public class HelloWorld {
	private javax.persistence.EntityManagerFactory emf;
	private javax.persistence.EntityManager em;
	private String PERSISTENCE_UNIT_NAME = "hello-world";

	public static void main(String[] args) {
		HelloWorld hello = new HelloWorld();
//
		//hello.initEntityManager();
		hello.create();
		// hello.read();
	//hello.closeEntityManager();
	}

	private void initEntityManager() {
		emf = javax.persistence.Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		em = emf.createEntityManager();
	}

	private void closeEntityManager() {
		em.close();
		emf.close();
	}

	private void create() {
		//em.getTransaction().begin();
		JPAHelper.beginTransaction();
		Message hello = new Message("hello world");
		User user = new User("sws", "Adam", "luptak", "OriginAdam", "admin", false, false, "asdasd@gsd.com", 919328456);
		
		JPAHelper.getEntityManager().persist(user);
		
       
		Message bye = new Message("goodbye, world");
		Message[] messages = new Message[] { hello, bye };
		for (Message m : messages) {
			JPAHelper.getEntityManager().persist(m);
		}
		JPAHelper.commitTransaction();
		//JPAHelper.close();
		
		DAOGenericImpl<User> dao = new DAOGenericImpl<User>();
		dao.getAllEntities(user);
		
		
	}

	// private void read() {
	// Message m =
	// (Message)em.createQuery("select m from Message m").getSingleResult();
	// System.out.println("Query returned: " + m);
	// }
}
