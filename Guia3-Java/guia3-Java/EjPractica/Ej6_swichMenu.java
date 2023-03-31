/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia3_tPracticos;

import java.util.Scanner;

/**
 
Realizar un programa que pida dos números enteros positivos por teclado 
* y muestre por pantalla el siguiente menú:El usuario deberá elegir una opción 
* y el programa deberá mostrar el resultado por pantalla y luego volver al menú. 
* El programa deberá ejecutarse hasta que se elija la opción 5. 
* Tener en cuenta que, si el usuario selecciona la opción 5,
* en vez de salir del programa directamente, 
* se debe mostrar el siguiente mensaje de confirmación:
* ¿Está seguro que desea salir del programa (S/N)? 
* Si el usuario selecciona el carácter ‘S’ se sale del programa,
* caso contrario se vuelve a mostrar el menú.


 * @author dora
 */
public class Ej6_swichMenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner menu = new Scanner(System.in);
        System.out.println("Ingrese dos numeros enteros positivos");
        int num1 = menu.nextInt();
        int num2 = menu.nextInt();
        
        boolean bucle = true;
        
         do {
             
        System.out.println("------- Menu----------");
        System.out.println("        1. Sumar------");
        System.out.println("        2. Restar-----");
        System.out.println("        3. Multiplicar");
        System.out.println("        4. Dividir----");
        System.out.println("        5. Salir -----");
        System.out.println("      Elija una opcion");
        System.out.println("----------------------");
       
        int opcion = menu.nextInt();
        
       
            
            
          switch(opcion) {
            case 1:
                System.out.println("El resultado de la suma es: "+  (num1 + num2));
           continue;
            case 2:
                System.out.println("El resultado de la resta es: " + (num1 - num2));
            continue;
            case 3:
                System.out.println("El resultado de la multipl es: " + (num1 * num2));
           continue;
            case 4:
                System.out.println("El resultado de la división es: " + (num1 / num2));
           continue;
            case 5:
                System.out.println("Esta seguro que desea Salir S/N");
                String respuesta = menu.next();
                  if (respuesta.equalsIgnoreCase("S")) {
                      System.out.println("Saliendo del programa");
                      bucle = false ;  
                  }
                   
        }
         } while (bucle);
      
    }
    
}
