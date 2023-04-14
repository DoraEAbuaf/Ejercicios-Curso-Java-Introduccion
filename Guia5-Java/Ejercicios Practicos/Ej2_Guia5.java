/*
 Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios
y le pida al usuario un número a buscar en el vector.
El programa mostrará dónde se encuentra el numero y si se encuentra repetido

 */
package Practicos_guia5;

import java.util.Scanner;

/**
 *
 * @author dora
 */
public class Ej2_Guia5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de elementos del vector");
     int num = leer.nextInt();
     int[] vector = new int[num];
     
        for (int i = 0; i < num ; i++) {
            vector[i]= (int) (Math.random()*5);
            System.out.println(vector[i]);
        }
     
        System.out.println("Ingrese un numero a buscar en el vector");
        int num2 =leer.nextInt();
        int cont = 0;
        for (int i = 0; i < num; i++) {
            if (vector[i]==num2) {
                System.out.println("la posicion es " + (i+1));
                cont++;
               
            }
            
        }
        if (cont == 0) {
                System.out.println("El numero elegido no esta en el vector");
            }
         System.out.println("El numero esta " + cont + " veces");
    }
    
}
