/*
Diseñe una función que pida el nombre y la edad de N personas e
imprima los datos de las personas ingresadas por teclado e indique si
son mayores o menores de edad. Después de cada persona, el programa
debe preguntarle al usuario si quiere seguir mostrando personas y frenar
cuando el usuario ingrese la palabra “No”.
 */
package guia4ej2;

import java.util.Scanner;


public class Guia4ej2 {

   
    public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
        
        String respuesta = "Si";
        
        while (respuesta.equalsIgnoreCase("Si")) {
            
            System.out.print("Ingrese el nombre de la persona: ");
            String nombre = scanner.nextLine();
            
            System.out.print("Ingrese la edad de la persona: ");
            int edad = scanner.nextInt();
            scanner.nextLine(); 
            
            
            
            // es mayor o menor de edad
            System.out.println("Nombre: " + nombre);
            System.out.println("Edad: " + edad);
            if (edad >= 18) {
                System.out.println("Es mayor de edad");
            } else {
                System.out.println("Es menor de edad");
            }
            
            System.out.print("¿Quiere seguir mostrando personas? (Si/No): ");
            respuesta = scanner.nextLine();
        }
        
        System.out.println("Fin del programa");
    }
}


   
