/*
Crear un programa que pida una frase y si esa frase es igual a “eureka” el
programa pondrá un mensaje de Correcto, sino mostrará un mensaje de
Incorrecto. Nota: investigar la función equals() en Java
 */
package guia3ej2;

import java.util.Scanner;


public class Guia3ej2 {

        
         public static void main(String[] args) {
       
             Scanner scanner = new Scanner(System.in);
      
        System.out.print("Ingresa una frase: ");
        
        String frase = scanner.nextLine();
       
        if (frase.equals("eureka")) {
            System.out.println("Correcto");
        
        } else {
            System.out.println("Incorrecto");
        }
    }

        
        
        
    }
    

