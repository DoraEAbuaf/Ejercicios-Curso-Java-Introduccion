/*
Crear una función rellene un vector con números aleatorios, 
pasándole un arreglo por parámetro.
Después haremos otra función o procedimiento que imprima el vector.

 */
package Practicos_guia5;

/**
 *
 * @author dora
 */
public class Ej3_extras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[]vector = new int[5];
        rellenar(vector);
        imprimir(vector);
    }
    public static void rellenar(int vector[]) {
        for (int i = 0; i < 5; i++) {
            vector[i]= (int)(Math.random()* 10);
          
        }
    }
        public static void imprimir(int vector[]) {
        for (int i = 0; i < 5; i++) {
            System.out.print(" " + "[" + vector[i]+ "]");
          
          
        }
        
        System.out.print(""); 
    }
 
    
}
