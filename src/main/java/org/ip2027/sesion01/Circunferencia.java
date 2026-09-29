package org.ip2027.sesion01;

public class Circunferencia {
	public static void main(String[] args) { 

    double radio = 4.2;
    double diametro, longitud, area;
    diametro = radio + radio;
    
    double perimetro = 2 * Math.PI * radio;
    double area = Math.PI * Math.pow(radio, 2 );
    double volumenEsfera = (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);
    double areaEsfera = 4 * Math.PI * Math.pow(radio, 2);
    
    
    System.out.printf("Radio de la circunferencia = %.3f\n, radio");
    System.out.printf("Diametro de la circunferencia = %.3f\n, diametro");
    System.out.printf("Perimetro de la circunferencia = %.3f\n, perimetro");
    System.out.printf("Area de la circunferencia = %.3f\n, area");
    System.out.printf("Volumen de la esfera = %.3f\n, volumenEsfera");
    System.out.printf("Area de la esfera = %.3f\n, areaEsfera");
	}
}
    





