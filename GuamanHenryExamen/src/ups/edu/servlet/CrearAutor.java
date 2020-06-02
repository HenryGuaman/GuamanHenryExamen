package ups.edu.servlet;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ups.edu.dao.AutorDAO;
import ups.edu.dao.DAOFactory;
import ups.edu.modelo.Autor;

/**
 * Servlet implementation class CrearAutor
 */
@WebServlet("/CrearAutor")
public class CrearAutor extends HttpServlet {
	private static final long serialVersionUID = 1L;
    AutorDAO dao = DAOFactory.getFactory().getAutorDAO();
    Autor autores=new Autor();
    
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CrearAutor() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int codigo1;
		
		String codigo = request.getParameter("codigo");
		String nombre = request.getParameter("nombre");
		String nacionalidad = request.getParameter("nacionalidad");
		
		codigo1= Integer.parseInt(codigo);
		
		autores.setCodigo(codigo1);
		autores.setNombre(nombre);
		autores.setNacionalidad(nacionalidad);
		dao.create(autores);
		
		/*request.setAttribute("codigo",codigo);
		request.setAttribute("nombre", nombre);
		request.setAttribute("nacionalidad", nacionalidad);*/
		
		//request.getRequestDispatcher("principal11.jsp").forward(request, response);
		
		
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		
		doGet(request, response);
	}

}
