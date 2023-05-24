/*

Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, 
validando que el primer número múltiplo del segundo e imprima si el primer número es 
múltiplo del segundo, sino informe que no lo son.


*/
package guia4ej12;

import java.util.Scanner;



public class Guia4ej12 {

    public static void main(String[] args) {

Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int num1 = input.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = input.nextInt();
        esMultiplo(num1, num2);
    }

    public static void esMultiplo(int num1, int num2) {
        if (num1 % num2 == 0) {
            System.out.println(num1 + " es múltiplo de " + num2);
        } else {
            System.out.println(num1 + " no es múltiplo de " + num2);
        }
    }
}
    
    

