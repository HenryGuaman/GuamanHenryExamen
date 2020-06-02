package ups.edu.jpa;

import ups.edu.dao.AutorDAO;
import ups.edu.dao.CapituloDAO;
import ups.edu.dao.DAOFactory;
import ups.edu.dao.LibroDAO;

public class JPADAOFactory extends DAOFactory {

	@Override
	public LibroDAO getLibroDAO() {
		// TODO Auto-generated method stub
		return new JPALibroDAO();
	}

	@Override
	public AutorDAO getAutorDAO() {
		// TODO Auto-generated method stub
		return new JPAAutorDAO();
	}

	@Override
	public CapituloDAO getCapituloDAO() {
		// TODO Auto-generated method stub
		return new JPACapituloDAO();
	}
	
	

}
