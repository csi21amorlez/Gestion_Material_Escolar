package main.controllers;

import main.modelos.Ejecucion.*;
import main.modelos.Recursos.UtilesImpl;
import main.modelos.Recursos.UtilesService;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

@Controller
public class MainProgram {

	public static void main(String[] args) {
		System.out.println("[INFO] -- Lanzamos el programa");
		ApplicationContext ac = new ClassPathXmlApplicationContext("context.xml");
		System.out.println("[INFO] -- Applicaction context creado");
		EjecucionService ej = ac.getBean(EjecucionImpl.class);
		UtilesService util =  ac.getBean(UtilesImpl.class);
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		
		do {
			util.menu();
			
			switch (opcion) {
			case 1:
				
				break;

			default:
				break;
			}
			
		}while(opcion != 0);
		
		util.menu();
		

		

	}

}
