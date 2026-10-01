package org.ip2027.tema01.resueltos;

public class Ejercicio01 {

	/**
	 * Suma y multiplica dos enteros no negativos
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		int dato1, dato2, suma, producto;
		// PRE: dato1 >= 0 y dato2 >= 0
		dato1 = 7;
		dato2 = 10;
		suma = dato1 + dato2;
		producto = dato1 * dato2;
		System.out.println("La suma es ... " + suma);
		System.out.println(("El producto es ... " + producto));
	}
}
