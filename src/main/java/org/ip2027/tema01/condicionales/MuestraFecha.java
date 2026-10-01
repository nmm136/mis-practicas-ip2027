package org.ip2027.tema01.condicionales;

import java.util.Scanner;

public class MuestraFecha {

	public static void main(String[] args) {

		int dia=3, mes=1, anio=2023; 

		Scanner entrada = new Scanner(System.in);
		System.out.print("Introduzca el día: ");
		dia= entrada.nextInt();
		System.out.print("Introduzca el mes: ");
		mes= entrada.nextInt();
		System.out.print("Introduzca el año: ");
		anio= entrada.nextInt();

	
		// Datos
//		System.out.println("Datos: ");
//		System.out.println("Dia: " + dia);
//		System.out.println("Mes: " + mes);
//		System.out.println("Año: " + anio);
//		System.out.println();

		// MENU
		int opcion = 0; 

		System.out.println("Formatos de fecha: ");
		System.out.println("--------------------------");
		System.out.println("1. Formato corto (europeo):   DD/MM/AAAA");
		System.out.println("2. Formato corto (americano): MM/DD/AAAA");
		System.out.println("3. Formato largo:             DD de MMMM de AAAA");
		System.out.print  ("Elija una opción: ");
		opcion = entrada.nextInt();

	
		System.out.println();
		switch (opcion) {
		case 1: 
			System.out.printf ("La fecha es: %02d/%02d/%2d ", dia, mes, anio);
			break;
		case 2: 
			System.out.printf ("La fecha es: %02d/%02d/%2d ", mes, dia, anio);
			break;
		case 3: 
			// Mostrar fecha en formato largo: 3 de enero de 2023
			String nombreMes;
			switch (mes) {
			case 1: nombreMes="enero";
					break;
			case 2: nombreMes="febrero";
					break;
			case 3: nombreMes="marzo";
					break;
			case 4: nombreMes="abril";
					break;
			case 5: nombreMes="mayo";
					break;
			case 6: nombreMes="junio";
					break;
			case 7: nombreMes="julio";
					break;
			case 8: nombreMes="agosto";
					break;
			case 9: nombreMes="septiembre";
					break;
			case 10: nombreMes="octubre";
					break;
			case 11: nombreMes="noviembre";
					break;
			case 12: nombreMes="diciembre";
					break;
			default: nombreMes="mes incorrecto";
			}
			System.out.printf ("La fecha es: %02d de %s de %d", dia, nombreMes, anio);
			break;
		default:
			System.out.println("Opción incorrecta.");
		}

		// System.out.println("\nFin.");

		entrada.close();
	}
}