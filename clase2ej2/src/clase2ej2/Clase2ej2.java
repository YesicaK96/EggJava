
package clase2ej2;

import java.util.Scanner;

/**
Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.

*/
public class Clase2ej2 {


   public static void main(String[] args) {
       
       Scanner scanner = new Scanner(System.in);
       
       System.out.print("Introduce tu nombre: ");
       
       String nombre = scanner.nextLine();
       
       System.out.println("Hola " + nombre);
    }
}
