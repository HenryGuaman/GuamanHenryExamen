package ups.edu.dao;

import ups.edu.jpa.JPADAOFactory;

public abstract class DAOFactory {
	
	protected static DAOFactory factory = new JPADAOFactory();
	
	public static DAOFactory getFactory() {
		return factory;
	}
	
	public abstract LibroDAO getLibroDAO();
	public abstract AutorDAO getAutorDAO();
	public abstract CapituloDAO getCapituloDAO();
	
	
	
	
}
