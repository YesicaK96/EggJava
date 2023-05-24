/*
Crea una aplicación que nos pida un número por teclado y con una
función se lo pasamos por parámetro para que nos indique si es o no un
número primo, debe devolver true si es primo, sino false.

 */
package guia4ej4;

import java.util.Scanner;

public class Guia4ej4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = scan.nextInt();

        if (esPrimo(numero)) {
            System.out.println(numero + " es primo");
        } else {
            System.out.println(numero + " no es primo");
        }
    }

    public static boolean esPrimo(int numero) {
        if (numero < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }
}