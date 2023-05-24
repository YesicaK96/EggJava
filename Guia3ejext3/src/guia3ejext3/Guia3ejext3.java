/*
Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se
trata de una vocal. Caso contrario mostrar un mensaje. Nota: investigar
la función equals() de la clase String.
 */
package guia3ejext3;

import java.util.Scanner;


public class Guia3ejext3 {

   public static void main(String[] args) {
      
       Scanner scan = new Scanner(System.in);
       
       System.out.print("Ingresa una letra: ");
       
       String letra = scan.next();

       
       if (letra.equalsIgnoreCase("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {
          
           System.out.println("La letra " + letra + " es una vocal.");
       
       } else {
        
           System.out.println("La letra " + letra + " no es una vocal.");
        }
    }
}
    
    

