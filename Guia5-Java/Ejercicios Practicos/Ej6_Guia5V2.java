/*
 Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números 
del 1 al 9 donde la suma de sus filas, sus columnas y sus diagonales son idénticas.
Crear un programa que permita introducir un cuadrado por teclado y determine si este 
cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.

 */
package Practicos_guia5;

import java.util.Scanner;

/**
 *
 * @author dora
 */
public class Ej6_Guia5V2 {

    /**
     * @param args the command line arguments
     */
   
        public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int sumadiagonal1 = 0;
        int sumadiagonal2 = 0;
        int[] sumafila = new int[3];
        int[] sumacolumna = new int[3];
        boolean esMagico = true;

        System.out.println("Ingrese los nÃºmeros del cuadrado mÃ¡gico:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = leer.nextInt();
                if (matriz[i][j] < 1 || matriz[i][j] > 9) {
                    System.out.println("Los nÃºmeros deben estar entre 1 y 9.");
                    return;
                }
                sumafila[i] += matriz[i][j];
                sumacolumna[j] += matriz[i][j];
                if (i == j) {
                    sumadiagonal1 += matriz[i][j];
                    
                }
                if (i + j == 2) {
                    sumadiagonal2 += matriz[i][j];
                }
                
            }
           
        }
        

        int sumafila1 = sumafila[0];
        int sumacolumna1 = sumacolumna[0];

        for (int i = 0; i < 3; i++) {
            if (sumafila[i] != sumafila1 || sumacolumna[i] != sumacolumna1) {
                esMagico = false;
                break;
            }
        }

        if (sumadiagonal1 != sumadiagonal2 || sumadiagonal1 != sumafila1 || !esMagico) {
            System.out.println("El cuadrado no es mÃ¡gico.");
        } else {
            System.out.println("El cuadrado es mÃ¡gico.");
        }

        ///// se muestra la matriz
        System.out.println("Matriz ingresada:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matriz[i][j] + "]"+ " ");
            }
            System.out.println();
        }
        
        //// se muetsra la suma 

        System.out.println("Suma de las diagonales:" );
        System.out.println("Diagonal principal: " + "compuesta de: " + matriz[0][0] +" + "+ matriz[1][1] + " + " + matriz[2][2] + " = " + sumadiagonal1);
        System.out.println("Diagonal columna: " + "compuesta de: " + matriz[0][0] + " + " + matriz[1][0] + " + " + matriz[2][0] + " = "+ sumacolumna1);
        System.out.println("Diagonal fila: " + "compuesta de: " + matriz[0][0] + " + " + matriz[0][1] + " + " + matriz[0][2] + " = " + sumafila1);
        
    }

}