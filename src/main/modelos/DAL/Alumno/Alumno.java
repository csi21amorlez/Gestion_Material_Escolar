package main.modelos.DAL.Alumno;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import main.modelos.DAL.Portatil.Portatil;

// TODO: Auto-generated Javadoc
/**
 * The Class Alumno.
 */
@Entity
@Table(name = "dlk_ggm_alumnos", schema = "sc_dlk_gestion_material_escolar")
public class Alumno {

	public String getCodAlumno() {
		return codAlumno;
	}

	public void setCodAlumno(String codAlumno) {
		this.codAlumno = codAlumno;
	}

	/** The md uuid. */
	@Column(name = "md_uuid")
	private String mdUuid;

	/** The md date. */
	@Column(name = "md_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar mdDate;
	
	/** The cod alumno. */
	@Column(name = "codigo_alumno")
	private String codAlumno;

	/** The id. */
	@Id
	@SequenceGenerator(name = "alumno_idalumno_seq", sequenceName = "alumno_idalumno_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "alumno_idalumno_seq")
	@Column(name = "id_alumno")
	private int id;

	/** The nombre completo. */
	@Column(name = "nombre_completo")
	private String nombreCompleto;

	/** The num tlf. */
	@Column(name = "numero_telefono")
	private String numTlf;

	/** The portatil asignado. */	
	@OneToOne
	private Portatil portatilAsignado;

	/**
	 * Gets the md uuid.
	 *
	 * @return the md uuid
	 */
	public String getMdUuid() {
		return mdUuid;
	}

	/**
	 * Sets the md uuid.
	 *
	 * @param mdUuid the new md uuid
	 */
	public void setMdUuid(String mdUuid) {
		this.mdUuid = mdUuid;
	}

	/**
	 * Gets the md date.
	 *
	 * @return the md date
	 */
	public Calendar getMdDate() {
		return mdDate;
	}

	/**
	 * Sets the md date.
	 *
	 * @param mdDate the new md date
	 */
	public void setMdDate(Calendar mdDate) {
		this.mdDate = mdDate;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(int id) {
		this.id = id;
	}

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
	 * Gets the portatil asignado.
	 *
	 * @return the portatil asignado
	 */
	public Portatil getPortatilAsignado() {
		return portatilAsignado;
	}

	/**
	 * Sets the portatil asignado.
	 *
	 * @param portatilAsignado the new portatil asignado
	 */
	public void setPortatilAsignado(Portatil portatilAsignado) {
		this.portatilAsignado = portatilAsignado;
	}

	/**
	 * Instantiates a new alumno.
	 *
	 * @param mdUuid           the md uuid
	 * @param mdDate           the md date
	 * @param id               the id
	 * @param nombreCompleto   the nombre completo
	 * @param numTlf           the num tlf
	 * @param portatilAsignado the portatil asignado
	 */
	public Alumno(String mdUuid, Calendar mdDate, int id, String nombreCompleto, String numTlf,
			Portatil portatilAsignado) {
		super();
		this.mdUuid = mdUuid;
		this.mdDate = mdDate;
		this.id = id;
		this.nombreCompleto = nombreCompleto;
		this.numTlf = numTlf;
		this.portatilAsignado = portatilAsignado;
	}

	/**
	 * Instantiates a new alumno.
	 */
	public Alumno() {
		super();
	}

}
