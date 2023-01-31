package main.modelos.Convertidores;

import java.util.ArrayList;

import main.modelos.DAL.Alumno.Alumno;
import main.modelos.DAL.Portatil.Portatil;
import main.modelos.DTOs.AlumnoDTO;
import main.modelos.DTOs.PortatilDTO;

// TODO: Auto-generated Javadoc
/**
 * The Interface ToDtoService.
 */
public interface ToDtoService {

	/**
	 * Alumno to dto.
	 *
	 * @param dao the dao
	 * @return the alumno DTO
	 */
	public AlumnoDTO alumnoToDto(Alumno dao);

	/**
	 * List alumno to dto.
	 *
	 * @param listDao the list dao
	 * @return the array list
	 */
	public ArrayList<AlumnoDTO> listAlumnoToDto(ArrayList<Alumno> listDao);

	/**
	 * Portatil to dto.
	 *
	 * @param dao the dao
	 * @return the portatil DTO
	 */
	public PortatilDTO portatilToDto(Portatil dao);

	/**
	 * List portatil to dto.
	 *
	 * @param listDao the list dao
	 * @return the array list
	 */
	public ArrayList<PortatilDTO> listPortatilToDto(ArrayList<Portatil> listDao);

}
