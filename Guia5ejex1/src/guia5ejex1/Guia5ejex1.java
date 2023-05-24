/*
Realizar un algoritmo que calcule la suma de todos los elementos de 
un vector de tamaño N,
con los valores ingresados por el usuario.

 */
package guia5ejex1;

import java.util.Scanner;

public class Guia5ejex1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del vector: ");
        int n = scan.nextInt();
        int[] vector = new int[n];

        for (int i = 0; i < vector.length; i++) {
            System.out.print("Ingrese el valor para la posición " + i + ": ");
            vector[i] = scan.nextInt();
        }

        int suma = 0;
        for (int i = 0; i < vector.length; i++) {
            suma += vector[i];
        }

        System.out.println("La suma total de los elementos del vector es: " + suma);
    }
}
