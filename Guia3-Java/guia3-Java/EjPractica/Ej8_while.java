
import java.util.Scanner;

/*
 Ejercicio 8
Escriba un programa que valide si una nota está entre 0 y 10, sino está
entre 0 y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.

 */

/**
 *
 * @author dora
 */
public class Ej8_Guia3_while {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Scanner leer = new Scanner(System.in);
        
        int nota;
        
        do{
            System.out.println("Ingrese la nota del examen");
            nota = leer.nextInt();
            if (nota<0 || nota>10 ) {
                System.out.println("Ingreso una nota Incorrecta");
                System.out.println("Ingrese nuevamente la nota");
                nota = leer.nextInt();
            }
        }while(nota<0 || nota>10) ;

    }
}  
    

