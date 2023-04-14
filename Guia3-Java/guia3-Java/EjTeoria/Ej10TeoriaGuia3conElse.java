/*
 Ejercicio 10
Realizar un programa que lea 4 números (comprendidos entre 1 y 20)
e imprima el número ingresado seguido de tantos asteriscos como indique su valor.
Por ejemplo:
5 *****
3 ***
11 ***********
2 **
 */
import java.util.Scanner;

/**
  * @author dora
 */
public class Ej10_for {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args)  {
        Scanner leer = new Scanner(System.in);
                 
          int nro ;
          for(int i =0; i< 4 ; i++) {
         // System.out.println("Ingreseu su " + (i + 1)+ "°Numero");
          nro = leer.nextInt();
           System.out.print(nro);
            if ((nro > 0) && (nro < 21)) {
                for (int j=0; j< nro; j++){
                    System.out.print("*");
                }
                
                  System.out.println(" ");  
            }
             else {
            System.out.println("El valor ingresado no esta entre 1 y 20");
            i = i - 1;
            }
    }
}
}
          