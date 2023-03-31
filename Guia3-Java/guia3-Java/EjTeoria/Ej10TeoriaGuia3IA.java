/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej10teoriaguia3.ia;

import java.util.Scanner;

/**
 *
 * @author dora
 */
public class Ej10TeoriaGuia3IA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //import java.util.Scanner;

        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[4];
        
        // Pedir los 4 números y guardarlos en el arreglo
        for (int i = 0; i < 4; i++) {
            System.out.print("Ingrese el número " + (i+1) + ": ");
            int num = sc.nextInt();
            
            // Verificar que el número esté entre 1 y 20
            while (num < 1 || num > 20) {
                System.out.print("Error: el número debe estar entre 1 y 20. Ingrese nuevamente: ");
                num = sc.nextInt();
            }
            
            numeros[i] = num;
        }
        
        // Imprimir los números y asteriscos
        for (int i = 0; i < 4; i++) {
            System.out.print(numeros[i] + ": ");
            for (int j = 0; j < numeros[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
    

