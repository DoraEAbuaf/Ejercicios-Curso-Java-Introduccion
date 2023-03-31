/*
 Ejercicio 10
Realizar un programa que lea 4 números (comprendidos entre 1 y 20) 
e imprima el número ingresado seguido de tantos asteriscos como indique su valor.
Por ejemplo:
5 *****
3 ***
11 ***********
2 **

 */
package ej10teoriaguia3;

import java.util.Scanner;

/**
 *
 * @author dora
 */
public class Ej10TeoriaGuia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Scanner leer = new Scanner(System.in);
                
        System.out.println("Ingrese 4 n�meros por favor entre el 1 y el 20");
        int num= leer.nextInt();
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        int num3 = leer.nextInt();
        
        System.out.println("======================");
                
        System.out.print(num+" ");
        for (int i = 0; i< num; i++) {
            System.out.print("*");
        }    
        System.out.println(" ");
        
        System.out.print(num1+" ");
        for (int i = 0; i< num1; i++) {
            System.out.print("*");
        }     
        System.out.println(" ");
        
        System.out.print(num2+" ");
        for (int i = 0; i< num2; i++) {
            System.out.print("*");
        }    
        System.out.println(" ");
        
        System.out.print(num3+" ");
        for (int i = 0; i< num3; i++) {
            System.out.print("*");
        }    
        System.out.println(" ");
        System.out.println("======================");
              
              
        
    }
}
    

