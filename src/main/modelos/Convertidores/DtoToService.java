package main.modelos.Convertidores;

import java.util.ArrayList;

import main.modelos.DAL.Alumno.Alumno;
import main.modelos.DAL.Portatil.Portatil;
import main.modelos.DTOs.AlumnoDTO;
import main.modelos.DTOs.PortatilDTO;

// TODO: Auto-generated Javadoc
/**
 * The Interface DtoToService.
 */
public interface DtoToService {
	
	/**
	 * Portatil dto to dao.
	 *
	 * @param dto the dto
	 * @return the portatil
	 */
	public Portatil portatilDtoToDao(PortatilDTO dto);
	
	/**
	 * List portatil dto to dao.
	 *
	 * @param listDto the list dto
	 * @return the array list
	 */
	public ArrayList<Portatil> listPortatilDtoToDao(ArrayList<PortatilDTO> listDto);
	
	/**
	 * Alumno dto to dao.
	 *
	 * @param dto the dto
	 * @return the alumno
	 */
	public Alumno alumnoDtoToDao(AlumnoDTO dto);
	
	/**
	 * List alumno dto to dao.
	 *
	 * @param listDto the list dto
	 * @return the array list
	 */
	public ArrayList<Alumno> listAlumnoDtoToDao(ArrayList<AlumnoDTO> listDto);
	
	 
	

}
