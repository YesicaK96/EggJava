//Escribir un programa que pida dos números enteros por teclado y calcule la suma 
//de los dos. El programa deberá después mostrar el resultado de la suma

package dia2ej1;
import java.util.Scanner;

public class Dia2ej1 {
 
     public static void main(String[] args) {
       
         Scanner scanner = new Scanner(System.in);
        
         System.out.print("Introduce el primer número: ");
        
         
         int numero1 = scanner.nextInt();
        
         System.out.print("Introduce el segundo número: ");
        
         
         int numero2 = scanner.nextInt();
        
         
         int suma = numero1 + numero2;
       
         System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + suma);
    }
}