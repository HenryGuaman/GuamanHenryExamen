package ups.edu.modelo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Libro implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private int codigo;
	private String nombre;
	private String isbn;
	private int numPaginas;
	
	//@OneToMany(cascade = CascadeType.ALL, mappedBy = "libro")
	private List<Capitulo> capitulos;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}

	public List<Capitulo> getCapitulos() {
		return capitulos;
	}

	public void setCapitulos(List<Capitulo> capitulos) {
		this.capitulos = capitulos;
	}

	@Override
	public String toString() {
		return "Libro [codigo=" + codigo + ", nombre=" + nombre + ", isbn=" + isbn + ", numPaginas=" + numPaginas
				+ ", capitulos=" + capitulos + "]";
	}

	public Libro(int codigo, String nombre, String isbn, int numPaginas, List<Capitulo> capitulos) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.isbn = isbn;
		this.numPaginas = numPaginas;
		this.capitulos = capitulos;
	}

	public Libro() {
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((capitulos == null) ? 0 : capitulos.hashCode());
		result = prime * result + codigo;
		result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + numPaginas;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		if (capitulos == null) {
			if (other.capitulos != null)
				return false;
		} else if (!capitulos.equals(other.capitulos))
			return false;
		if (codigo != other.codigo)
			return false;
		if (isbn == null) {
			if (other.isbn != null)
				return false;
		} else if (!isbn.equals(other.isbn))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (numPaginas != other.numPaginas)
			return false;
		return true;
	}
	
	
	
	
}
