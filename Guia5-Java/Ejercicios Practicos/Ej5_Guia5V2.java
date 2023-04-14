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
public class Ej5_Guia5V2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             Scanner leer = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int[][] transpuesta = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese el valor para ["+i+"]["+j+"]:");
                matriz[i][j]=leer.nextInt();
            }   
        }
        System.out.println("Original");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                transpuesta[j][i] = matriz[i][j];
            }
            System.out.println("");
        }
        System.out.println("Transpuesta");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(transpuesta[i][j] + " ");
            }
            System.out.println("");
        }
        
    }
    }
    

