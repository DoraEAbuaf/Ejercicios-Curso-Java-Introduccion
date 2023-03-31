/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia3_tPracticos;

import java.util.Scanner;

/**
 Escriba un programa en el cual se ingrese un valor límite positivo,
 * y a continuación solicite números al usuario hasta que la suma
 * de los números introducidos supere el límite inicial.
 * @author dora
 */
public class Ej5_bucles {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numLim ;
        System.out.println("Ingrese un valor entre 10 y 100");
        numLim = leer.nextInt();
        
        int num;
        int suma =0;
         
        do {
            System.out.println("Ingrese valores hasta llegar a " + numLim);
            num = leer.nextInt();
            suma = suma + num;
            System.out.println("La suma da " + suma );
            
        } while (suma <= numLim);
        
    }
   
}
