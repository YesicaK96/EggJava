/*
 Bucles y sentencias de salto break y continue
5. Escriba un programa en el cual se ingrese un valor límite positivo, y a
continuacion solicite numeros al usuario hasta que la suma de los
numeros introducidos supere el limite inicial.
 */
package guia3ej5;

import java.util.Scanner;


public class Guia3ej5 {

   

          public static void main(String[] args) {
              
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Ingresa el valor límite: ");
        
        int limite = scanner.nextInt();
        
        int suma = 0;
        
        while (suma <= limite) {
            
            System.out.print("Ingresa un número: ");
            
            int numero = scanner.nextInt();
            
            suma += numero;
            
        }
        
        System.out.println("La suma de los números introducidos supera el límite inicial.");
    }
}
    
   
