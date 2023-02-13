package main.modelos.Recursos;


import org.springframework.stereotype.Service;

@Service
public class UtilesImpl implements UtilesService {

	public void menu() {
		System.out.println("\n\n\n\n\n\n\t\t\t╔══════════════════════════════════════╗");
		System.out.println("\t\t\t║ Opciones de la Gasolinera                  ║");
		System.out.println("\t\t\t╠════════════════════════════════════════════╣");
		System.out.println("\t\t\t║ 1) Matricular alumno	                   ║");
		System.out.println("\t\t\t║ 2) Dar de baja alumno       	           ║");
		System.out.println("\t\t\t║ 3) Alta de portatil			               ║");
		System.out.println("\t\t\t║ 4) Portatil asignado a alumno 			   ║");
		System.out.println("\t\t\t║ 5) Alumno asignado a portatil              ║");
		System.out.println("\t\t\t║ 6) Todos los alumnos asignados a portatiles║");		
		System.out.println("\t\t\t║ 0) Salir                                   ║");
		System.out.println("\t\t\t║                                            ║");
		System.out.println("\t\t\t╚════════════════════════════════════════════╝");

	}

}
