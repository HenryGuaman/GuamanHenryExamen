package ups.edu.jpa;

import ups.edu.dao.AutorDAO;
import ups.edu.dao.LibroDAO;
import ups.edu.modelo.Autor;
import ups.edu.modelo.Libro;

public class JPAAutorDAO extends JPAGenericDAO<Autor, Integer> implements AutorDAO{

	public JPAAutorDAO() {
		super(Autor.class);
		// TODO Auto-generated constructor stub
	}

}
