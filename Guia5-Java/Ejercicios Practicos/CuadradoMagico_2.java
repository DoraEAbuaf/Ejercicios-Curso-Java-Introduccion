/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package ejercicio1;

import java.util.Scanner;

public class CuadradoMagico_2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int sumadiagonal1 = 0;
        int sumadiagonal2 = 0;
        int[] sumafila = new int[3];
        int[] sumacolumna = new int[3];
        boolean esMagico = true;

        System.out.println("Ingrese los números del cuadrado mágico:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = leer.nextInt();
                if (matriz[i][j] < 1 || matriz[i][j] > 9) {
                    System.out.println("Los números deben estar entre 1 y 9.");
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
            System.out.println("El cuadrado no es mágico.");
        } else {
            System.out.println("El cuadrado es mágico.");
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
        System.out.println("Diagonal columna: " + sumacolumna1);
        System.out.println("Diagonal fila: " + sumafila1);
        
    }

}