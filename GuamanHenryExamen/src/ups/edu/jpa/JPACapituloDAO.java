package ups.edu.jpa;

import ups.edu.dao.CapituloDAO;
import ups.edu.dao.LibroDAO;
import ups.edu.modelo.Capitulo;
import ups.edu.modelo.Libro;

public class JPACapituloDAO extends JPAGenericDAO<Capitulo, Integer> implements CapituloDAO{

	public JPACapituloDAO() {
		super(Capitulo.class);
		// TODO Auto-generated constructor stub
	}

}
