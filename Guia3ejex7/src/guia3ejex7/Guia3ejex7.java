/*
Realice un programa que calcule y visualice el valor máximo, el valor
mínimo y el promedio de n números (n>0). El valor de n se solicitará al
principio del programa y los números serán introducidos por el usuario.
Realice dos versiones del programa, una usando el bucle “while” y otra
con el bucle “do - while”.
 */
package guia3ejex7;

import java.util.Scanner;




public class Guia3ejex7 {

   
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de números a procesar: ");
        int n = input.nextInt();

        
        double sum = 0;
        
        double max = Double.MIN_VALUE;
        
        double min = Double.MAX_VALUE;
        
        int count = 0;

        while (count < n) {
            
            System.out.print("Ingrese un número: ");
            
            double num = input.nextDouble();

            
            sum += num;

            
            if (num > max) {
            
                max = num;
            
            }

            
            if (num < min) {
            
                min = num;
            
            }

        
            count++;
        }

        double avg = sum / n;

        
        System.out.println("El valor máximo es: " + max);
        
        System.out.println("El valor mínimo es: " + min);
     
        System.out.println("El promedio es: " + avg);
    }
}
        
        
        
  /*

import java.util.Scanner;

public class MaxMinAvgDoWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de números a procesar: ");
        int n = input.nextInt();

        double sum = 0;
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        int count = 0;

        do {
            System.out.print("Ingrese un número: ");
            double num = input.nextDouble();

            sum += num;

            if (num > max) {
                max = num;
            }

            if (num < min) {
                min = num;
            }

            count++;
        } while (count < n);

        double avg = sum / n;

        System.out.println("El valor máximo es: " + max);
        System.out.println("El valor mínimo es: " + min);
        System.out.println("El promedio es: " + avg);
    }
}


*/


