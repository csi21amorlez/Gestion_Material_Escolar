package main.modelos.Ejecucion;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.modelos.Consultas.Consultas;
import main.modelos.Convertidores.DtoToImpl;
import main.modelos.Convertidores.ToDtoImpl;
import main.modelos.DTOs.AlumnoDTO;
import main.modelos.DTOs.PortatilDTO;

@Service
public class EjecucionImpl implements EjecucionService {

	@Autowired
	Consultas cons;
	@Autowired
	DtoToImpl dtoTo;
	@Autowired
	ToDtoImpl toDto;
	@Autowired
	AlumnoDTO alumno;
	@Autowired
	PortatilDTO portatil;

	Scanner sc = new Scanner(System.in);

	@Override
	public void matricularAlumno() {

		System.out.println("[INFO] -- Matricular alumno");
		System.out.println("[INFO] -- Introduzca el nombre del alumno");

	}

	@Override
	public void eliminarAlumno() {
		// TODO Auto-generated method stub

	}

	@Override
	public void altaPortatil() {
		// TODO Auto-generated method stub

	}

	@Override
	public void consultarPortatiles() {
		// TODO Auto-generated method stub

	}

	@Override
	public void consultarAlumnos() {
		// TODO Auto-generated method stub

	}

	@Override
	public void mostrarAsignaciones() {
		// TODO Auto-generated method stub

	}

}
