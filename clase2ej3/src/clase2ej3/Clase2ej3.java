/*
Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas. 
Nota: investigar la función toUpperCase() y toLowerCase() en Java.

 */
package clase2ej3;

import java.util.Scanner;

public class Clase2ej3 {

      public static void main(String[] args) {
       
          Scanner scan = new Scanner(System.in);
        
          System.out.print("Introduce una frase: ");
        
          String frase = scan.nextLine();
        
          String mayusculas = frase.toUpperCase();
        
          String minusculas = frase.toLowerCase();
        
          System.out.println("Frase en mayúsculas: " + mayusculas);
        
          System.out.println("Frase en minúsculas: " + minusculas);
    }
}
