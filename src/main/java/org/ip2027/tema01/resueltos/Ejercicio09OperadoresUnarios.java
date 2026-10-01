package org.ip2027.tema01.resueltos;

public class Ejercicio09OperadoresUnarios {
	public static void main(String[] args) {
		int i = 8;
		int a, b, c;
		System.out.println("\tantes\tdurante\tdespues");
		i = 8;
		a = i;
		b = i++;
		c = i;
		System.out.println("i++\t" + a + '\t' + b + '\t' + c);
		i = 8;
		a = i;
		b = i--;
		c = i;
		System.out.println("i--\t" + a + '\t' + b + '\t' + c);
		i = 8;
		a = i;
		b = ++i;
		c = i;
		System.out.println("++i\t" + a + '\t' + b + '\t' + c);
		i = 8;
		a = i;
		b = --i;
		c = i;
		System.out.println("--i\t" + a + '\t' + b + '\t' + c);
	}
}
