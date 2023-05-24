/*
Escriba un programa que averigüe si dos vectores de N enteros son iguales
(la comparación deberá detenerse en cuanto se detecte alguna diferencia entre los elementos).
 */
package guia5ejex2;

import java.util.Scanner;

public class Guia5ejex2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        System.out.print("Ingrese el tamaño de los vectores: ");
        int n = scan.nextInt();
        int[] vector1 = new int[n];
        int[] vector2 = new int[n];
        
        System.out.println("Ingrese los valores del vector 1:");
        for (int i = 0; i < vector1.length; i++) {
            System.out.print("Ingrese el valor para la posición " + i + ": ");
            vector1[i] = scan.nextInt();
        }
        
        System.out.println("Ingrese los valores del vector 2:");
        for (int i = 0; i < vector2.length; i++) {
            System.out.print("Ingrese el valor para la posición " + i + ": ");
            vector2[i] = scan.nextInt();
        }
        
        boolean iguales = true;
        for (int i = 0; i < vector1.length; i++) {
            if (vector1[i] != vector2[i]) {
                iguales = false;
                break;
            }
        }
        
        if (iguales) {
            System.out.println("Los vectores son iguales");
        } else {
            System.out.println("Los vectores son diferentes");
        }
    }
}