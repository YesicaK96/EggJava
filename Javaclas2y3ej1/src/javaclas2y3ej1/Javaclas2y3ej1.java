/*
Escribir un programa que pida dos números enteros por teclado y calcule la suma 
de los dos. El programa deberá después mostrar el resultado de la suma
 */
package javaclas2y3ej1;

import java.util.Scanner;




         
public class Javaclas2y3ej1 {

    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      
      int numero1;
      int numero2;
      int sum;
      
      System.out.println ("Ingrese un numero: ");
            
           numero1 = scan.nextInt();
 
           
           System.out.println ("Ingrese otro numero: ");
       
          
           numero2 = scan.nextInt();
           
           
       // String sum;
                    
           sum= numero1+numero2;       
               
                  
              System.out.println("La suma de los numeros ingresados es= "+sum);
              
    }
    
    
}
