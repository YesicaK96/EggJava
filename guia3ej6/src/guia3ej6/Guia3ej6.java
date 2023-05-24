/*
Realizar un programa que pida dos números enteros positivos por
teclado y muestre por pantalla el siguiente menú:El usuario deberá elegir
una opción y el programa deberá mostrar el resultado por pantalla y
luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en
vez de salir del programa directamente, se debe mostrar el siguiente
mensaje de confirmación: ¿Está seguro que desea salir del programa
(S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, caso
contrario se vuelve a mostrar el menú.
 */
package guia3ej6;

import java.util.Scanner;


public class Guia3ej6 {
   
  
       
         public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int num1, num2, opcion;
        
        boolean salir = false;

        
        do {
        
            System.out.print("Ingresa el primer número: ");
            
            num1 = scanner.nextInt();
            
            System.out.print("Ingresa el segundo número: ");
            
            num2 = scanner.nextInt();

            
            System.out.println("\nMENU");
            
            System.out.println("1. Sumar");
            
            System.out.println("2. Restar");
            
            System.out.println("3. Multiplicar");
            
            System.out.println("4. Dividir");
            
            System.out.println("5. Salir");

            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
               
                case 1:
                
                    System.out.println("La suma de los números es " + (num1 + num2));
                    
                    break;
                
                case 2:
                
                    System.out.println("La resta de los números es " + (num1 - num2));
                    
                    break;
                case 3:
                  
                    System.out.println("La multiplicación de los números es " + (num1 * num2));
                    
                    break;
                case 4:
                    
                    if (num2 == 0) {
                    
                        System.out.println("No se puede dividir por cero.");
                  
                    } else {
                    
                        System.out.println("La división de los números es " + ((double) num1 / num2));
                    
                    }
                    
                    break;
                
                case 5:
                
                   
                    System.out.print("¿Está seguro que desea salir del programa (S/N)? ");
                    
                    scanner.nextLine(); //salto de línea del scanner
                    
                    String respuesta = scanner.nextLine();
                    
                    if (respuesta.equalsIgnoreCase("S")) {
                    
                        salir = true;
                    }
                   
                    break;
                
                default:
                
                    System.out.println("Opción no válida.");
                    
                    break;
            }

           
            System.out.println(); // Salto separar las opciones
        } while (!salir);

        System.out.println("Fin");
    }
}