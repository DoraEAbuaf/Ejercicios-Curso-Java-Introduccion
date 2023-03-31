
import java.util.Scanner;

/*
 * Ejercicio 9
Escriba un programa que lea 20 números.
Si el número leído es igual a cero se debe salir del bucle y mostrar el mensaje
"Se capturó el numero cero".  
El programa deberá calcular y mostrar el resultado de la suma de los números leídos, 
pero si el número es negativo no debe sumarse. 
Nota: recordar el uso de la sentencia break.

 */

/**
 *
 * @author dora
 */
public class Ej9_DoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       int numero ;
       int suma = 0;
       int cont = 0;
       
        do {
            System.out.println("Ingrese 20 numeros enteros");
            numero = leer.nextInt();
            
            if (numero==0) {
                System.out.println("Se capturó el numero cero");
                break;
            }
            else if (numero < 0) {
                suma= suma;
                cont = cont + 1 ;
            }
            else{
            suma = suma+ numero;
            cont = cont + 1;
            }
            System.out.println("El valor del contador es " + cont);
            System.out.println("El valor de la suma es " + suma);
        } while (cont <20);
      
        
               
    }
    
}
