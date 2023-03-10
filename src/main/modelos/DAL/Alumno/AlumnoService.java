package main.modelos.DAL.Alumno;

import java.util.ArrayList;

// TODO: Auto-generated Javadoc
/**
 * The Interface AlumnoService.
 */
public interface AlumnoService {
	
	/**
	 * Insertar alumno.
	 *
	 * @param alumno the alumno
	 */
	public void insertarAlumno(Alumno alumno);
	
	/**
	 * Find by nombre.
	 *
	 * @param nombre the nombre
	 * @return the alumno
	 */
	public Alumno findByNombre(String nombre);
	
	/**
	 * Eliminar alumno.
	 *
	 * @param alumno the alumno
	 */
	public void eliminarAlumno(Alumno alumno);
	
	/**
	 * Buscar todos.
	 *
	 * @return the array list
	 */
	public ArrayList<Alumno> buscarTodos();
	
	/**
	 * Find by numero.
	 *
	 * @param numero the numero
	 * @return the alumno
	 */
	public Alumno findByNumero(int numero);
	
	
	
	

}
