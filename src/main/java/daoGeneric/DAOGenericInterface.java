package daoGeneric;

import java.util.List;

public interface DAOGenericInterface<T> {

	public List<?> getAllEntities(T clazz);

	public T getSingleEntitie(T objectIn);

	public void updateEntitie(T objectIn);

	public void deleteEntitie(T objectIn);
}
