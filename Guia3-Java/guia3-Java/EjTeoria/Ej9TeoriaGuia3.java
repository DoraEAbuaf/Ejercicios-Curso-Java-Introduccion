/*
 Ejercicio 9
Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir
del bucle y mostrar el mensaje "Se capturó el numero cero". 
El programa deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.

 */
package ej9teoriaguia3;

import java.util.Scanner;

/**
 *
 * @author dora
 */
public class Ej9TeoriaGuia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int nro, i, j;
    for(i = 0; i < 4; i++){
        System.out.print("Ingrese un n�mero: ");
            nro = s.nextInt();
            while(nro > 20){
            System.out.println("El valor ingresado est� fuera de rango");
            i = i;
            System.out.println("Ingrese el n�mero nuevamente: ");
            nro = s.nextInt();
        } 
            for(j = 0; j < nro; j++){
                System.out.print("*");    
            }
            System.out.println("");
        }
    }
}