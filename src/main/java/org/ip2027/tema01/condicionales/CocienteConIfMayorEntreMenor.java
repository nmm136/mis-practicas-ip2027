package org.ip2027.tema01.condicionales;

import java.util.Scanner;

public class CocienteConIfMayorEntreMenor {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduzca dos enteros: ");
		int num1 = entrada.nextInt();
		int num2 = entrada.nextInt();
		
		// Ahora el dividendo será siempre el mayor de los dos números
		if (num1<num2) {  
			// Swap: intercambio los valores de num1 y num2
			int temp = num1; 
			num1 = num2; 
			num2 = temp;
		}
		
		if (num2 != 0)
			System.out.println(num1 + " / " + num2 + " es " + (num1 / num2));
		else
			System.out.println("No se puede hacer una division por cero");
		
		entrada.close();
		
	}
}
