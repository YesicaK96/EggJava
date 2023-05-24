/*
Realice un programa para que el usuario adivine el resultado de una
multiplicación entre dos números generados aleatoriamente entre 0 y 10.
El programa debe indicar al usuario si su respuesta es o no correcta. En
caso que la respuesta sea incorrecta se debe permitir al usuario ingresar
su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java
 */
package guia3ejex10;

import java.util.Scanner;


public class Guia3ejex10 {

   
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int num1 = (int) (Math.random() * 11);
        int num2 = (int) (Math.random() * 11);

        int resultado = num1 * num2;
        int respuesta;

        do {
            System.out.print("Adivine el resultado de " + num1 + " * " + num2 + ": ");
            respuesta = sc.nextInt();

            if (respuesta == resultado) {
                System.out.println("¡Respuesta correcta!");
            } else {
                System.out.println("Respuesta incorrecta. Intente de nuevo.");
            }
        } while (respuesta != resultado);
    }
}
    
    

