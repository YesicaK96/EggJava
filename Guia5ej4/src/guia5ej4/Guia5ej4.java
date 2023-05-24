/*
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la traspuesta de la matriz.
La matriz traspuesta de una matriz A se denota por B y se obtiene cambiando sus filas por columnas (o viceversa).

*/
package guia5ej4;

import java.util.Random;


public class Guia5ej4 {

   
    public static void main(String[] args) {
     int[][] matriz = new int[4][4];
        Random random = new Random();
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                matriz[fila][columna] = random.nextInt(10); // Valores entre 0 y 9
            }
        }

        System.out.println("Matriz original:");
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                System.out.print(matriz[fila][columna] + " ");
            }
            System.out.println();
        }

        int[][] traspuesta = new int[4][4];
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                traspuesta[columna][fila] = matriz[fila][columna];
            }
        }

        System.out.println("Matriz traspuesta:");
        for (int fila = 0; fila < traspuesta.length; fila++) {
            for (int columna = 0; columna < traspuesta[fila].length; columna++) {
                System.out.print(traspuesta[fila][columna] + " ");
            }
            System.out.println();
        }
    }
}