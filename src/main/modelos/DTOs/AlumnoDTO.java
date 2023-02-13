package main.modelos.DTOs;

import main.modelos.DAL.Portatil.Portatil;

// TODO: Auto-generated Javadoc
/**
 * The Class AlumnoDTO.
 */
public class AlumnoDTO {
	
	
	/** The nombre completo. */
	private String nombreCompleto;

	/** The cod alumno. */
	private String codAlumno;
	
	/** The num tlf. */
	private String numTlf;
	
	/** The portatil asignado. */
	private PortatilDTO portatilAsignado;
	
	

	/**
	 * Gets the nombre completo.
	 *
	 * @return the nombre completo
	 */
	public String getNombreCompleto() {
		return nombreCompleto;
	}

	/**
	 * Sets the nombre completo.
	 *
	 * @param nombreCompleto the new nombre completo
	 */
	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	/**
	 * Gets the portatil asignado.
	 *
	 * @return the portatil asignado
	 */
	public PortatilDTO getPortatilAsignado() {
		return portatilAsignado;
	}

	/**
	 * Instantiates a new alumno DTO.
	 *
	 * @param codAlumno the cod alumno
	 * @param numTlf the num tlf
	 * @param portatilAsignado the portatil asignado
	 */
	public AlumnoDTO(String codAlumno, String numTlf, PortatilDTO portatilAsignado) {
		super();
		this.codAlumno = codAlumno;
		this.numTlf = numTlf;
		this.portatilAsignado = portatilAsignado;
	}

	/**
	 * Sets the portatil asignado.
	 *
	 * @param portatilAsignado the new portatil asignado
	 */
	public void setPortatilAsignado(PortatilDTO portatilAsignado) {
		this.portatilAsignado = portatilAsignado;
	}

	/**
	 * Gets the cod alumno.
	 *
	 * @return the cod alumno
	 */
	public String getCodAlumno() {
		return codAlumno;
	}
	
	/**
	 * Sets the cod alumno.
	 *
	 * @param codAlumno the new cod alumno
	 */
	public void setCodAlumno(String codAlumno) {
		this.codAlumno = codAlumno;
	}
	
	/**
	 * Gets the num tlf.
	 *
	 * @return the num tlf
	 */
	public String getNumTlf() {
		return numTlf;
	}
	
	/**
	 * Sets the num tlf.
	 *
	 * @param numTlf the new num tlf
	 */
	public void setNumTlf(String numTlf) {
		this.numTlf = numTlf;
	}

	/**
	 * Instantiates a new alumno DTO.
	 */
	
	/**
	 * Instantiates a new alumno DTO.
	 */
	public AlumnoDTO() {
		super();
	}
	/**
	 * Instantiates a new alumno DTO.
	 *
	 * @param nombreCompleto the nombre completo
	 * @param codAlumno the cod alumno
	 * @param numTlf the num tlf
	 * @param portatilAsignado the portatil asignado
	 */
	public AlumnoDTO(String nombreCompleto, String codAlumno, String numTlf, PortatilDTO portatilAsignado) {
		super();
		this.nombreCompleto = nombreCompleto;
		this.codAlumno = codAlumno;
		this.numTlf = numTlf;
		this.portatilAsignado = portatilAsignado;
	}
	

}
