/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia3_tPracticos;

import java.util.Scanner;

/**
 Realizar un programa que simule el funcionamiento de un dispositivo RS232,
 este tipo de dispositivo lee cadenas enviadas por el usuario. 
 Las cadenas deben llegar con un formato fijo: tienen que ser de un máximo de 5
 caracteres de largo, el primer carácter tiene que ser X y el último tiene
 que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, 
la secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE),
y toda secuencia distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad
de lecturas correctas e incorrectas recibidas. 
Para resolver el ejercicio deberá investigar cómo se utilizan
las siguientes funciones de Java Substring(), Length(), equals().

 * @author dora
 */
public class Ej7_substring_length_equals {

    private static Object lenght;

    /**
     * @param args the command line arguments
     * Realizar un programa que simule el funcionamiento de un dispositivo RS232, 
     * este tipo de dispositivo lee cadenas enviadas por el usuario.
     * Las cadenas deben llegar con un formato fijo: tienen que ser de un máximo de 5
     * caracteres de largo, el primer carácter tiene que ser X y el último
     * tiene que ser una O.
    Las secuencias leídas que respeten el formato se consideran correctas,
    * la secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE),
    * y toda secuencia distinta de FDE, que no respete el formato
    * se considera incorrecta.
    Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas
    * correctas e incorrectas recibidas. 
    * Para resolver el ejercicio deberá investigar cómo se utilizan las 
    * siguientes funciones de Java Substring(), Length(), equals().

     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String cadenas = "";
        int correc=0;
        int incorrec=0;
        
        do {
            System.out.println("Ingrese la cadena de 5 caracteres");
            cadenas = leer.next();
            
            if (cadenas.length() == 5 && cadenas.startsWith("x") && cadenas.endsWith("o")){
                correc++;
                
            } else {
                incorrec++;
            }
        } while (!cadenas.equals("&&&&&"));
        incorrec--;
        System.out.println("Cantidad de entradas Correctas:" + correc);
        System.out.println("Cantidad de entradas Incorrectas:" + incorrec);
    }
    
}
