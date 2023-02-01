package main.modelos.DTOs;

// TODO: Auto-generated Javadoc
/**
 * The Class PortatilDTO.
 */

public class PortatilDTO {

	/** The cod portatil. */
	private String codPortatil;

	/** The marca portatil. */
	private String marcaPortatil;

	/** The modelo portatil. */
	private String modeloPortatil;

	/**
	 * Instantiates a new portatil DTO.
	 *
	 * @param codPortatil the cod portatil
	 * @param marcaPortatil the marca portatil
	 * @param modeloPortatil the modelo portatil
	 * @param alumnoAsignado the alumno asignado
	 */
	public PortatilDTO(String codPortatil, String marcaPortatil, String modeloPortatil, AlumnoDTO alumnoAsignado) {
		super();
		this.codPortatil = codPortatil;
		this.marcaPortatil = marcaPortatil;
		this.modeloPortatil = modeloPortatil;
		this.alumnoAsignado = alumnoAsignado;
	}

	/**
	 * Gets the modelo portatil.
	 *
	 * @return the modelo portatil
	 */
	public String getModeloPortatil() {
		return modeloPortatil;
	}
	
	

	/**
	 * Sets the modelo portatil.
	 *
	 * @param modeloPortatil the new modelo portatil
	 */
	public void setModeloPortatil(String modeloPortatil) {
		this.modeloPortatil = modeloPortatil;
	}

	/** The alumno asignado. */
	private AlumnoDTO alumnoAsignado;

	/**
	 * Gets the cod portatil.
	 *
	 * @return the cod portatil
	 */
	public String getCodPortatil() {
		return codPortatil;
	}

	/**
	 * Sets the cod portatil.
	 *
	 * @param codPortatil the new cod portatil
	 */
	public void setCodPortatil(String codPortatil) {
		this.codPortatil = codPortatil;
	}

	/**
	 * Gets the marca portatil.
	 *
	 * @return the marca portatil
	 */
	public String getMarcaPortatil() {
		return marcaPortatil;
	}

	/**
	 * Sets the marca portatil.
	 *
	 * @param marcaPortatil the new marca portatil
	 */
	public void setMarcaPortatil(String marcaPortatil) {
		this.marcaPortatil = marcaPortatil;
	}

	/**
	 * Gets the alumno asignado.
	 *
	 * @return the alumno asignado
	 */
	public AlumnoDTO getAlumnoAsignado() {
		return alumnoAsignado;
	}

	/**
	 * Sets the alumno asignado.
	 *
	 * @param alumnoAsignado the new alumno asignado
	 */
	public void setAlumnoAsignado(AlumnoDTO alumnoAsignado) {
		this.alumnoAsignado = alumnoAsignado;
	}

	/**
	 * Instantiates a new portatil DTO.
	 */
	public PortatilDTO() {
		super();
	}

}
