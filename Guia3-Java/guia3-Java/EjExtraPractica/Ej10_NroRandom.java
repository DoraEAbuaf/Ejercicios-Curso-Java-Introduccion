/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia3_tPracticos.Extras_guia3;

import java.util.Scanner;

/**
 Realice un programa para que el usuario adivine el resultado de una multiplicación entre dos números
 generados aleatoriamente entre 0 y 10. 
 El programa debe indicar al usuario si su respuesta es o no correcta. 
 En caso que la respuesta sea incorrecta se debe permitir al usuario ingresar su respuesta nuevamente. 
 Para realizar este ejercicio investigue como utilizar la función Math.random() de Java.

 * @author dora
 */
public class Ej10_NroRandom {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int contador=0;
        boolean bucle = false;
        int random = (int) (Math.random()* 10 * Math.random()*10);
        System.out.println("el numero a adivinar es " + random   );
        
        do {
            System.out.println("Ingrese un número que sea el resultado de la multiplicacion de dos números enteros");
        int num = leer.nextInt();
            if (num == random) {
                bucle = true;
                System.out.println("Adivinaste !!");
                break;
              
            } 
            else if(num !=random) {
                   System.out.println("La respuesta no fue correcta.");
           // num = leer.nextInt();
                  contador++; 
        } 
     
        //System.out.println("No adivino el número, adios");
        }while (contador <2 );
        
        bucle = false;
        }
        }

    