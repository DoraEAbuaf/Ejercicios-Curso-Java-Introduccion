/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia3_tPracticos.Extras_guia3;

import java.util.Scanner;

/**
 Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por debajo de 1.60
 * mts. y el promedio de estaturas en general.

 * @author dora
 */
public class Ej6_estaturasPromedio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       System.out.println("Ingrese la cantidad de personas a encuestar");
       int cantPers = leer.nextInt();
        
        
      int altura;
      int suma2 = 0;
      int suma1 = 0;
      int j = 0;
      int h = 0;
      double prom1=0;
      double prom2=0;
      double promTot = 0;
           
        for (int i = 0; i < cantPers; i++) {
            System.out.println("Ingrese la altura de la " + (i+1) + " ° persona");
            altura = leer.nextInt();
           
            
            if (altura < 160 ) {
                suma1 = suma1 + altura;
               j =j+1 ;
              prom1 = (suma1 / j);
               // System.out.println("El promedio de estaturas menores a 1.60 es de "+ prom1);
               }
            else { 
                suma2 = suma2 + altura;
                h++;
              prom2 = (suma2/h);
                
            }
            
            promTot =  ((suma1 + suma2)/cantPers);
          
        }
          System.out.println("El promedio de estaturas menores a 1.60 es de "+ prom1);
          System.out.println("El promedio de estaturas mayores a 1.60 es de "+ prom2);
          System.out.println("El promedio de altura general es de " + promTot);  
    }
    
}
