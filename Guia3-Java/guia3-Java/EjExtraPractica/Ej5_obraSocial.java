/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia3_tPracticos.Extras_guia3;

import java.util.Scanner;

/**
 Una obra social tiene tres clases de socios:
Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en todos los tipos
* de tratamientos.
Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para los mismos tratamientos
* que los socios del tipo A.
Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos tratamientos.
Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real que 
* represente el costo del tratamiento (previo al descuento) y determine el importe en efectivo
* a pagar por dicho socio.
*
 * @author dora
 */
public class Ej5_obraSocial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        char tipoSocio ;
        
        do {
            System.out.println("Ingrese el Tipo de socio");
            tipoSocio= leer.next().charAt(0);
            }
        while (tipoSocio != 'A' && tipoSocio != 'B' && tipoSocio != 'C' );
        
        int cuota =0;
        
        System.out.println("Ingrese el costo del tratamiento");
        int importe = leer.nextInt();
       
        
        switch (tipoSocio) {
            case 'A':
                cuota = 1000;
                importe *= 0.5;
                break;
            case 'B':
                cuota = 800;
                importe *= 0.65;
                break;
            case 'C':
                cuota = 500;
                
                break;
            }
        
        System.out.println("El costo del tratamiento para el tipo de Socio " + tipoSocio + " es de " + importe);
        
        
        
        
    }
    
}
