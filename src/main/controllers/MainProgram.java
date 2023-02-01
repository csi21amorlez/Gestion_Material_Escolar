package main.controllers;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

import main.modelos.Ejecucion.EjecucionImpl;
import main.modelos.Ejecucion.EjecucionService;

@Controller
public class MainProgram {
	
	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("context.xml");
		
		EjecucionService ej = ac.getBean(EjecucionImpl.class);
		
		ej.matricularAlumno();
		
	}

}
