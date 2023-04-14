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
public class Ej2_extrasV2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
      System.out.print("Ingrese la longitud de los vectores: ");
      int n = leer.nextInt();
      
      int[] vector1 = new int[n];
      int[] vector2 = new int[n];
      
      System.out.println("Ingrese los elementos del primer vector: ");
      int i = 0;
      while (i < n) {
         vector1[i] = leer.nextInt();
         i++;
      }
      
      System.out.println("Ingrese los elementos del segundo vector: ");
      i = 0;
      while (i < n) {
         vector2[i] = leer.nextInt();
         i++;
      }
      
      boolean sonIguales = true;
      i = 0;
      while (i < n) {
         if (vector1[i] != vector2[i]) {
            sonIguales = false;
            break;
         }
         i++;
      }
      
      if (sonIguales) {
         System.out.println("Los vectores son iguales");
      } else {
         System.out.println("Los vectores son diferentes");
      }
      
      leer.close();
   }
}
       

