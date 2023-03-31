/*
 Ejercicio 8
Escriba un programa que valide si una nota está entre 0 y 10,
sino está entre 0 y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.

 */
package ej9teoriaguia3;

import java.util.Scanner;

/**
 *
 * @author dora
 */
public class Ej9TeoriaGuia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int nro;
        System.out.println("Ingrese un valor entre 1 y 10");
        nro = s.nextInt();
        while(nro < 0 || nro > 10){
            System.out.println("El nùmero ingresado es incorrecto. Ingreselo nuevamente: ");
            nro = s.nextInt();
        }
        System.out.println("El valor es correcto");
    }
    
}
