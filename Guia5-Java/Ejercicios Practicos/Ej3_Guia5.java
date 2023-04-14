/*
 Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito
cuántos de 2 dígitos, etcétera (hasta 5 dígitos).

 */
package Practicos_guia5;

import java.util.Scanner;

/**
 *
 * @author dora
 */
public class Ej3_Guia5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       
       int[] vector = new int[10];
       
        for (int i = 0; i < 10; i++) {
            vector[i]= (int) (Math.random()* 10000);
            System.out.println(vector[i]);
            }
        
       int uno = 0;
       int dos = 0;
       int tres = 0;
       int cuatro=0;
       int cinco = 0;
       
        for (int i = 0; i < 10; i++) {
            if (vector[i] < 10 ) {
            uno++;
            }
            else if (vector[i] < 100 ) {
                dos++;
            }
            else if (vector[i]< 1000 ) {
                tres++;
            }
            else if (vector[i]< 10000 ) {
                cuatro++;
            }
            else if (vector[i]< 100000 ) {
                cinco++;
            }
        }
        System.out.println("La cant de nros con 1 digito es de :" + uno);
        System.out.println("La cant de nros con 2 digitos es de :" + dos);
        System.out.println("La cant de nros con 3 digitos es de :" + tres);
        System.out.println("La cant de nros con 4 digitos es de :" + cuatro);
        System.out.println("La cant de nros con 5 digitos es de :" + cinco);
   }
}
