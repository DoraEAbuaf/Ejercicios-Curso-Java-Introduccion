
import java.util.Scanner;

/*
  Crea una aplicación que nos pida un número por teclado y con una función 
se lo pasamos por parámetro para que nos indique si es o no un número primo, 
debe devolver true si es primo, sino false.
Un número primo es aquel que solo puede dividirse entre 1 y sí mismo. 
Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5,
sin embargo, 17 si es primo.

 */

/**
 *
 * @author dora
 */
public class Ej4_EsPrimo_V2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
       int num = leer.nextInt();
       
       if(esPrimo(num)){
           System.out.println("El número:" +num+ " es Primo");
       }
       else {
           System.out.println("El número:" +num+ " NO es Primo");
       }
    }
    public static boolean esPrimo(int num) { 
        boolean esPrimo = true;
        
        for (int i =2 ; i <= (num /2); i++) {
            if(num % i ==0){
                esPrimo = false;
                break;
            }
        }
        return esPrimo;
    }
    
}



