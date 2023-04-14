/*
 Escriba un programa que averigüe si dos vectores de N enteros son iguales
(la comparación deberá detenerse en cuanto se detecte alguna diferencia entre
los elementos).

 */
package Practicos_guia5;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author dora
 */
public class Ej2_Extras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
       int n = leer.nextInt();
        int[] vector1 = new int[n];
        int[] vector2 = new int[n];
        
        for (int i = 0; i < vector1.length; i++) {
            vector1[i]= (int) (Math.random()* 10);
        }
        
        for (int i = 0; i < vector2.length; i++) {
            vector2[i]= (int) (Math.random()* 10);
            
        }
        
        
        for (int i = 0; i < vector1.length; i++) {
            System.out.print(" " + "["+vector1[i]+ "]" );
            
        }
        System.out.println(" ");
        
        for (int i = 0; i < vector2.length; i++) {
            System.out.print(" " + "["+vector2[i]+ "]" );
    }
     System.out.println("");
     
     // ahora comparamos si los dos vectores son iguales
    /* boolean sonIguales = Arrays.equals(vector1, vector2);
    //boolean sonIguales = true;
        for (int i = 0; i < n; i++) {
            if (vector1[i] != vector2[2]) {
                System.out.println("Los vectores no son iguales");
                sonIguales = false;
                break;
            }
        }
        if (sonIguales) {
            System.out.println("Los vectores son iguales ");
            
        }*/

        int cont1=0;
        for (int i = 0; i < n; i++) {
            if (vector1[i] != vector2[i]) {
                cont1++;
                System.out.println(" los elementos son diferentes en la posicion " + i);
               break;
            }
            else{
                System.out.println("Los vectores son iguales en la posicion "+ i);
            }
        }
            
        }
}
    
