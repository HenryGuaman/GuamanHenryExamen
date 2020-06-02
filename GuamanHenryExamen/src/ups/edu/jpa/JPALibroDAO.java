package ups.edu.jpa;



import ups.edu.dao.LibroDAO;
import ups.edu.modelo.Libro;

public class JPALibroDAO extends JPAGenericDAO<Libro, Integer> implements LibroDAO{

	public JPALibroDAO() {
		super(Libro.class);
		// TODO Auto-generated constructor stub
	}

	
	

}
