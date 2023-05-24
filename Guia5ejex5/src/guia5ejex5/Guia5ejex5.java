/*
Realizar un programa que llene una matriz de tamaño NxM con valores aleatorios
y muestre la suma de sus elementos.
 */
package guia5ejex5;

import java.util.Random;


public class Guia5ejex5 {


    public static void main(String[] args) {
  int N = 5;
        int M = 4; 
        
        int[][] matriz = new int[N][M];
        
        Random rand = new Random();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matriz[i][j] = rand.nextInt(100); 
            }
        }
        
        int suma = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                suma += matriz[i][j];
            }
        }
        
        System.out.println("La suma de los elementos de la matriz es: " + suma);
    }

}