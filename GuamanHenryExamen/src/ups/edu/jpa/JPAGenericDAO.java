package ups.edu.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import ups.edu.dao.GenericDAO;



public class JPAGenericDAO<T, ID> implements GenericDAO<T, ID>{
	
	private Class<T> persistentClass;
	protected EntityManager em;

	public JPAGenericDAO(Class<T> persistentClass) {
		this.persistentClass = persistentClass;
		this.em = Persistence.createEntityManagerFactory("GuamanHenryExamen").createEntityManager();

	}
	
	@Override
	public void create(T entity) {
		em.getTransaction().begin();
		try {
			em.persist(entity);
			em.getTransaction().commit();
		} catch (Exception e) {
			System.out.println(">>>> ERROR:JPAGenericDAO:create " + e);
			if (em.getTransaction().isActive())
				em.getTransaction().rollback();
		}
	}

	@Override
	public T read(ID id) {
		// TODO Auto-generated method stub
		return em.find(persistentClass, id);
	}

	@Override
	public void update(T entity) {
		// TODO Auto-generated method stub
		em.getTransaction().begin();
		try {
			em.merge(entity);
			em.getTransaction().commit();
		} catch (Exception e) {
			System.out.println(">>>> ERROR:JPAGenericDAO:update " + e);
			if (em.getTransaction().isActive())
				em.getTransaction().rollback();
		}
	}

	@Override
	public void delete(T entity) {
		// TODO Auto-generated method stub
		em.getTransaction().begin();
		try {
			em.remove(entity);
			em.getTransaction().commit();
		} catch (Exception e) {
			System.out.println(">>>> ERROR:JPAGenericDAO:delete " + e);
			if (em.getTransaction().isActive())
				em.getTransaction().rollback();
		}
	}
	@Override
	public void deleteByID(ID id) {
		T entity =  this.read(id);
		if (entity != null )
			this.delete(entity);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
    @Override
    public List<T> find() {
	em.getTransaction().begin();
	List<T> lista = null;
	try {
	    javax.persistence.criteria.CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
	    cq.select(cq.from(persistentClass));
	    lista = em.createQuery(cq).getResultList();
	    em.getTransaction().commit();
	} catch (Exception e) {
	    e.printStackTrace();
	}
	return lista;
    }

	@Override
	public List<T> find(String[] attributes, String[] values) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> find(String[] attributes, String[] values, String order, int index, int size) {
		// TODO Auto-generated method stub
		return null;
	}



}
