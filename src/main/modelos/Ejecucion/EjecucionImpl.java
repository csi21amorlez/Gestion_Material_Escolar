package main.modelos.Ejecucion;

import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.jpa.JpaSystemException;
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
	AlumnoDTO alumno = ac.getBean(AlumnoDTO.class);
	PortatilDTO portatil = ac.getBean(PortatilDTO.class);

	@Override
	public void matricularAlumno() {

		try {

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

		try {
			System.out.println("[INFO] -- Introduzca el nombre del alumno a eliminar");
			alumno = cons.findAlumnoByNombre(sc.next());
			System.out.println("[INFO] -- Introduzca el nombre de nuevo para confirmar" + alumno.getNombreCompleto());
			String confirmacion = sc.next();
			if (confirmacion == alumno.getNombreCompleto())
				cons.eliminarAlumno(alumno);
			else
				System.out.println("[INFO] -- El nombre introducido no coincide con el del usuairo");
			
		} catch (Exception e) {
			System.out.println("[ERROR DESCONOCIDO]");
		}
		

	}

	@Override
	public void altaPortatil() {
		System.out.println("[INFO] -- Introduzca la marca del portatil");
		portatil.setCodPortatil(sc.next());
		System.out.println("[INFO] -- Introduzca el modelo del portatil");
		portatil.setModeloPortatil(sc.next());
		System.out.println("[INFO] -- Introduzca el nombre del alumno asignado");
		portatil.setAlumnoAsignado(cons.findAlumnoByNombre(sc.next()));
		System.out.println("[INFO] -- Introduzca el codigo del portatil");
		portatil.setCodPortatil(sc.next());
	}

	@Override
	public void consultarPortatiles() {
		try {
			System.out.println("[INFO] -- Introduzca el codigo del alumno");
			alumno = cons.findAlumnoByCode(sc.nextInt());
			portatil = cons.findPortatilByCode(alumno.getPortatilAsignado().getCodPortatil());
			System.out.println("Alumno asignado al portatil: " + alumno.toString());
			System.out.println("Portatil perteneciente al alumno: " + portatil.toString());
		} catch (Exception e) {
			System.out.println("[ERROR DESCONOCIDO]");
		}
		
		
		

	}

	@Override
	public void consultarAlumnos() {
		System.out.println("[INFO] -- Introduzca el numero del portatil");
		portatil = cons.findPortatilByCode(sc.next());
		if(portatil == alumno.getPortatilAsignado()) {
			System.out.println("Portatil asignado al alumno: " + portatil.toString());
			System.out.println("Alumno propietario: " + alumno.toString());
		}
			

	}

	@Override
	public void mostrarAsignaciones() {
		// TODO Auto-generated method stub

	}

}
