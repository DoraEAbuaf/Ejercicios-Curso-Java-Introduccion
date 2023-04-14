/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practicos_guia5;

import java.util.Scanner;

/**
 *
 * @author dora
 */
public class Ej4_guia5V2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //Diagonal inversa si i+j=m-1 Entonces
           int[][] matriz = new int[4][4];
        // Rellenar la matriz con valores aleatorios
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }
        // Mostrar la matriz original
        System.out.println("Matriz original:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        // Calcular la matriz traspuesta
        int[][] traspuesta = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                traspuesta[j][i] = matriz[i][j];
            }
        }
        // Mostrar la matriz traspuesta
        System.out.println("Matriz traspuesta:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(traspuesta[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}