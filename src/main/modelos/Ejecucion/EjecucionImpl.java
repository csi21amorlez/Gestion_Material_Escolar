package main.modelos.Ejecucion;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
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

	Scanner sc = new Scanner(System.in);
	ApplicationContext ac = new ClassPathXmlApplicationContext("context.xml");

	@Override
	public void matricularAlumno() {

		try {
			AlumnoDTO alumno = ac.getBean(AlumnoDTO.class);

			System.out.println("[INFO] -- Matricular alumno");

			System.out.println("[INFO] -- Introduzca el nombre del alumno");
			alumno.setNombreCompleto(sc.next());

			System.out.println("[INFO] -- Introduzca el numero de telefono del alumno");
			alumno.setNumTlf(sc.next());

			System.out.println("[INFO] -- Introduzca el numero del asignado al alumno");
			alumno.setCodAlumno(sc.next());

			System.out.println("[INFO] -- Introduzca el codigo del portatil asignado al alumno");
			// Controlamos que no crashee la aplicacion en caso de que no exista el portatil
			// que queramos asignar
			try {
				alumno.setPortatilAsignado(cons.findPortatilByCode(sc.next()));
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(
						"[INFO] -- Portatil no existente, asegurese de introducir un portatil registrado previamente");
			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("[ERROR] -- ejecucionImpl.matricularAlumno -- Error de formato en algún campo");
		}

	}

	@Override
	public void eliminarAlumno() {
		
		System.out.println();

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
