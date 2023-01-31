package main.modelos.DAL.Portatil;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import main.modelos.DAL.Alumno.Alumno;

// TODO: Auto-generated Javadoc
/**
 * The Class Portatil.
 */
@Entity
@Table(name="dlk_gme_portatiles", schema = "sc_dlk_gestion_material_escolar")
public class Portatil {
	
	/** The md uuid. */
	@Column(name="md_uuid")
	private String mdUuid;
	
	/** The md date. */
	@Column(name="md_date")
	private Calendar mdDate;
	
	/** The id. */
	@Id
	@SequenceGenerator(name = "portatil_idportatil_seq", sequenceName = "portatil_idportatil_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "portatil_idportatil_seq")
	@Column(name = "id_portatil")
	private int id;
	
	/** The cod portatil. */
	@Column(name="codigo_portatil")
	private String codPortatil;
	
	/** The modelo. */
	@Column(name = "modelo_portatil")
	private String modelo;
	
	/** The marca. */
	@Column(name="marca_portatil")
	private String marca;
	
	/** The alumno asignado. */
	@Column(name = "alumno_asignado")
	@OneToOne
	private Alumno alumnoAsignado;
	
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
	 * Gets the modelo.
	 *
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}
	
	/**
	 * Sets the modelo.
	 *
	 * @param modelo the new modelo
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	/**
	 * Gets the marca.
	 *
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}
	
	/**
	 * Sets the marca.
	 *
	 * @param marca the new marca
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	/**
	 * Gets the alumno asignado.
	 *
	 * @return the alumno asignado
	 */
	public Alumno getAlumnoAsignado() {
		return alumnoAsignado;
	}
	
	/**
	 * Sets the alumno asignado.
	 *
	 * @param alumnoAsignado the new alumno asignado
	 */
	public void setAlumnoAsignado(Alumno alumnoAsignado) {
		this.alumnoAsignado = alumnoAsignado;
	}
	
	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "Portatil [mdUuid=" + mdUuid + ", mdDate=" + mdDate + ", id=" + id + ", codPortatil=" + codPortatil
				+ ", modelo=" + modelo + ", marca=" + marca + ", alumnoAsignado=" + alumnoAsignado + "]";
	}
	
	/**
	 * Instantiates a new portatil.
	 *
	 * @param mdUuid the md uuid
	 * @param mdDate the md date
	 * @param id the id
	 * @param codPortatil the cod portatil
	 * @param modelo the modelo
	 * @param marca the marca
	 * @param alumnoAsignado the alumno asignado
	 */
	public Portatil(String mdUuid, Calendar mdDate, String codPortatil, String modelo, String marca,
			Alumno alumnoAsignado) {
		super();
		this.mdUuid = mdUuid;
		this.mdDate = mdDate;		
		this.codPortatil = codPortatil;
		this.modelo = modelo;
		this.marca = marca;
		this.alumnoAsignado = alumnoAsignado;
	}
	
	/**
	 * Instantiates a new portatil.
	 */
	public Portatil() {
		super(); }
	
	
	
	
 } 