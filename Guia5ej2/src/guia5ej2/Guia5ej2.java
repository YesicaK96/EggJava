/*
 Realizar un algoritmo que llene un vector de tamaño N 
con valores aleatorios y 
le pida al usuario un número a buscar en el vector.
El programa mostrará dónde se encuentra el numero y
si se encuentra repetido
 */
package guia5ej2;

import java.util.Arrays;
import java.util.Scanner;


public class Guia5ej2 {

   
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el tamaño del vector: ");
        int n = sc.nextInt();
        
        int[] vector = new int[n];
        
       
        for (int i = 0; i < n; i++) {
            vector[i] = (int) (Math.random() * 100);
        }
        
        System.out.println("Vector generado: " + Arrays.toString(vector));
        
        System.out.print("Ingrese un número a buscar en el vector: ");
        int numero = sc.nextInt();
        
        boolean encontrado = false;
        int posicion = -1;
        int repeticiones = 0;
        
        for (int i = 0; i < n; i++) {
            if (vector[i] == numero) {
                if (!encontrado) {
                    encontrado = true;
                    posicion = i;
                }
                repeticiones++;
            }
        }
        
        if (encontrado) {
            System.out.println("El número " + numero + " se encuentra en la posición " + posicion + " del vector.");
            if (repeticiones > 1) {
                System.out.println("El número " + numero + " se encuentra repetido " + repeticiones + " veces en el vector.");
            }
        } else {
            System.out.println("El número " + numero + " no se encuentra en el vector.");
        }
        
        sc.close();
    }
}
    

