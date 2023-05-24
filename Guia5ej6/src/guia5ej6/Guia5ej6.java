/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la suma 
de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que permita introducir
un cuadrado por teclado y determine si este cuadrado es mágico o no. El programa deberá comprobar 
que los números introducidos son correctos, es decir, están entre el 1 y el 9.

 */
package guia5ej6;

import java.util.Scanner;


public class Guia5ej6 {

   
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        int[][] cuadrado = new int[3][3];
        int sumaFilas = 0, sumaColumnas = 0, sumaDiagonal1 = 0, sumaDiagonal2 = 0;

        
        for (int i = 0; i < cuadrado.length; i++) {
            for (int j = 0; j < cuadrado[i].length; j++) {
                System.out.print("Introduce un número entre 1 y 9 para la posición [" + i + "][" + j + "]: ");
                int num = sc.nextInt();
               
                while (num < 1 || num > 9) {
                    System.out.print("Número no válido. Introduce un número entre 1 y 9 para la posición [" + i + "][" + j + "]: ");
                    num = sc.nextInt();
                }
                cuadrado[i][j] = num;
                sumaFilas += num;
                sumaColumnas += cuadrado[j][i]; 
                if (i == j) {
                    sumaDiagonal1 += num;
                }
                if (i + j == 2) {
                    sumaDiagonal2 += num;
                }
            }
        }

        
        if (sumaFilas == sumaColumnas && sumaFilas == sumaDiagonal1 && sumaFilas == sumaDiagonal2) {
            System.out.println("El cuadrado es mágico.");
        } else {
            System.out.println("El cuadrado no es mágico.");
        }
    }
}
    

