/*
Ejercicio 6 de la guia teorica
Implementar un programa que le pida dos números enteros al usuario y 
determine si ambos o alguno de ellos es mayor a 25.

 */
package ej1guia3teorica;

import java.util.Scanner;

/**
 *
 * @author dora
 */
public class Ej1Guia3Teorica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa dos números enteros");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        
        if (num1 > 25 && num2 > 25){
            System.out.println("Los números "+ num1 + " y " + num2 + " son mayores a 25");
        }
        else 
            if (num1 > 25 ){
            System.out.println("el números "+ num1 + " es mayore a 25");
        } 
        else 
            if (num2 > 25){
            System.out.println("El número " + num2 + " es mayor a 25");
            }
        else {
            System.out.println("Los dos números son menores a 25");
        }
    }
    
}
        

 

    