/*
Crear una función rellene un vector con números aleatorios, 
pasándole un arreglo por parámetro. Después haremos otra función o 
procedimiento que imprima el vector.
 */
package guia5ejex3;

import java.util.Random;


public class Guia5ejex3 {

   
    public static void main(String[] args) {
        int[] vector = new int[10];
        rellenarVector(vector);
        imprimirVector(vector);
    }
    
    public static void rellenarVector(int[] vector) {
        Random random = new Random();
        
        for (int i = 0; i < vector.length; i++) {
            vector[i] = random.nextInt(100); 
        }
    }
    
    public static void imprimirVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
    }
}