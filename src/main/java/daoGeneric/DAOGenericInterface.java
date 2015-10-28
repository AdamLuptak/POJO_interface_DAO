package daoGeneric;

import java.util.List;

public interface DAOGenericInterface<T> {

	public List<T> getAllEntities(Class<T> objectIn);

	public T getSingleEntitie(Class<T> objectIn);

	public void updateEntitie(Class<T> objectIn);

	public void deleteEntitie(Class<T> objectIn);
}
