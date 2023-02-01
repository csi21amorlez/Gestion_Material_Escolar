package main.modelos.Consultas;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.modelos.Convertidores.DtoToImpl;
import main.modelos.Convertidores.ToDtoImpl;
import main.modelos.DAL.Alumno.AlumnoImpl;
import main.modelos.DAL.Portatil.PortatilImpl;
import main.modelos.DTOs.AlumnoDTO;
import main.modelos.DTOs.PortatilDTO;

@Service
public class Consultas {

	@Autowired
	AlumnoImpl alumno;
	@Autowired
	PortatilImpl portatil;
	@Autowired
	ToDtoImpl toDto;
	@Autowired
	DtoToImpl dtoTo;

	@Transactional
	public void insertarPortatil(PortatilDTO dto) {
		portatil.insertarPortatil(dtoTo.portatilDtoToDao(dto));
	}

	@Transactional
	public void insertarAlumno(AlumnoDTO dto) {
		alumno.insertarAlumno(dtoTo.alumnoDtoToDao(dto));
	}

	@Transactional
	public void eliminarPortatil(PortatilDTO dto) {
		portatil.eliminarPortatil(dtoTo.portatilDtoToDao(dto));
	}

	@Transactional
	public void eliminarAlumno(AlumnoDTO dto) {
		alumno.eliminarAlumno(dtoTo.alumnoDtoToDao(dto));
	}

	@Transactional
	public ArrayList<AlumnoDTO> findAllAlumnos() {
		return toDto.listAlumnoToDto(alumno.buscarTodos());
	}

	@Transactional
	public ArrayList<PortatilDTO> findAllPortatiles() {
		return toDto.listPortatilToDto(portatil.buscarTodos());
	}

	@Transactional
	public AlumnoDTO findAlumnoByNombre(String nombre) {
		return toDto.alumnoToDto(alumno.findByNombre(nombre));
	}

	@Transactional
	public PortatilDTO findPortatilByCode(String codigo) {
		return toDto.portatilToDto(portatil.findByCodigo(codigo));
	}

}
