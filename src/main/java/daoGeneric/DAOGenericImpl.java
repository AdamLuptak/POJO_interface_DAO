package daoGeneric;

import java.util.List;

/**
 * len pokus o genericky DAO
 */
public class DAOGenericImpl<T> implements DAOGenericInterface<T> {

	public List<T> getAllEntities(T clazz) {

		JPAHelper.beginTransaction();

		List<?> objects = (JPAHelper.getEntityManager()
				.createQuery("SELECT p FROM  " + clazz.getClass().getName() + " p").getResultList());

		JPAHelper.commitTransaction();
		return (List<T>) objects;
	}

	public T getSingleEntitie(T objectIn) {
		// TODO Auto-generated method stub
		return null;
	}

	public void updateEntitie(T objectIn) {
		JPAHelper.beginTransaction();
		JPAHelper.getEntityManager().persist(objectIn);
		JPAHelper.commitTransaction();
	}

	public void deleteEntitie(T objectIn) {
		// TODO Auto-generated method stub

	}

}
