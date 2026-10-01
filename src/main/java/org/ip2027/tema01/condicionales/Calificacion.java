package org.ip2027.tema01.condicionales;

public class Calificacion {

	public static void main(String[] args) {
		int nota=10;
		String resultado;
		if (nota >= 9)
		     resultado = "Sobresaliente";
		else if (nota >= 7)
			     resultado = "Notable";
		else if (nota >= 5)
			     resultado = "Aprobado";
		else
			     resultado = "Suspenso";

		System.out.println("La calificacion para una nota de " + nota + " es: " + resultado); 

	}

}
