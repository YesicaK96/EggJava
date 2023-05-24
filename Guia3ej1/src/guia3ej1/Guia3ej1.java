/*
. Crear un programa que dado un número determine si es par o impar
 */
package guia3ej1;

import java.util.Scanner;


/**
 */
public class Guia3ej1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
      
        System.out.print("Ingresa un número: ");
        
        int numero = sc.nextInt();
        
        if (numero % 2 == 0) {
        
            
            System.out.println(numero + " es par");
        
        } else {
        
            System.out.println(numero + " es impar");
        }
    }
}
              
    
    

