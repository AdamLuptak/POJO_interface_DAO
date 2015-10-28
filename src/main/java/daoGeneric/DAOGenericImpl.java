package daoGeneric;

import java.util.List;

import entities.User;

public class DAOGenericImpl<T> implements DAOGenericInterface<T> {

	public List<T> getAllEntities(T clazz) {
		// TODO Auto-generated method stub

		JPAHelper.beginTransaction();

		List<T> objects = (JPAHelper.getEntityManager()
				.createQuery("SELECT p FROM  " + clazz.getClass().getName() + " p").getResultList());

		JPAHelper.commitTransaction();
		return objects;
	}

	public T getSingleEntitie(T objectIn) {
		// TODO Auto-generated method stub
		return null;
	}

	public void updateEntitie(T objectIn) {
		// TODO Auto-generated method stub

	}

	public void deleteEntitie(T objectIn) {
		// TODO Auto-generated method stub

	}

}
