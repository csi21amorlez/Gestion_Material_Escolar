package main.modelos.DAL.Portatil;

import java.util.ArrayList;

// TODO: Auto-generated Javadoc
/**
 * The Interface PortatilService.
 */
public interface PortatilService {

	/**
	 * Find by codigo.
	 *
	 * @param codigo the codigo
	 * @return the portatil
	 */
	public Portatil findByCodigo(String codigo);

	/**
	 * Buscar todos.
	 *
	 * @return the array list
	 */
	public ArrayList<Portatil> buscarTodos();

	/**
	 * Insertar portatil.
	 *
	 * @param portatil the portatil
	 */
	public void insertarPortatil(Portatil portatil);

	/**
	 * Eliminar portatil.
	 *
	 * @param portatil the portatil
	 */
	public void eliminarPortatil(Portatil portatil);

}
