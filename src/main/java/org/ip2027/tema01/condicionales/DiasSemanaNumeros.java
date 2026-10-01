package org.ip2027.tema01.condicionales;

/*
 * Dado un nombre de lía de la semana "lunes", "martes, etc, 
 * muestre el número dia al que corresponde entre el 1 y el 7
 */
public class DiasSemanaNumeros {

    public static void main(String[] args) {
        int numeroDia=0;
        String dia = "jueves";

        switch (dia) {
        case "lunes": 
            numeroDia=1;
            break;
        case "martes":
            numeroDia=2; 
            break;
        case "miercoles":
            numeroDia=3; 
            break;
        case "jueves":
            numeroDia=4; 
            break;
        case "viernes":
            numeroDia=5; 
            break;
        case "sabado":
            numeroDia=6; 
            break;
        case "domingo":
            numeroDia=7; 
            break;
        default:
            numeroDia=0;
        }
        System.out.print("El numero del dia '"+ dia + "' es: " + numeroDia);
    }
}

