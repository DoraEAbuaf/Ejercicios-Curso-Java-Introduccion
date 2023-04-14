
import java.util.Scanner;

/*
 Ejercicio 13
Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros
de equipo y define su tipo de dato de tal manera que te permita alojar
sus nombres más adelante.

 */

/**
 *
 * @author dora
 */
public class Ej13guiateorica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String[] equipo = new String[6];
       
       Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese los nombres de su equipo");
        
        for (int i = 0; i < 6; i++) {
            equipo[i] = leer.nextLine();
            // System.out.println(equipo[i]);
        }
         
           
        for (int i = 0; i < 6; i++) {
            System.out.print("[" + equipo[i] + "]");
            
        }
        System.out.println("");
        }
       
               
               }
    

