/*
Escriba un programa que lea números enteros. Si el número es múltiplo
de cinco debe detener la lectura y mostrar la cantidad de números
leídos, la cantidad de números pares y la cantidad de números impares.
Al igual que en el ejercicio anterior los números negativos no deben
sumarse. Nota: recordar el uso de la sentencia break.
 */
package guia3ejex8;

import java.util.Scanner;


public class Guia3ejex8 {

      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantidadNumeros = 0;
        int cantidadPares = 0;
        int cantidadImpares = 0;

        while (true) {
            System.out.print("Ingrese un número entero: ");
            int numero = sc.nextInt();
            if (numero < 0) {
                continue;
            } else if (numero % 5 == 0) {
                System.out.println("El número ingresado es múltiplo de cinco.");
                break;
            } else {
                cantidadNumeros++;
                if (numero % 2 == 0) {
                    cantidadPares++;
                } else {
                    cantidadImpares++;
                }
            }
        }

        System.out.println("Cantidad de números leídos: " + cantidadNumeros);
        System.out.println("Cantidad de números pares: " + cantidadPares);
        System.out.println("Cantidad de números impares: " + cantidadImpares);
    }
}
