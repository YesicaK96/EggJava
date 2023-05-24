/*
Escribir un programa que lea un número entero por teclado y muestre por pantalla
el doble, el triple y la raíz cuadrada de ese número. 
Nota: investigar la función Math.sqrt().
 */
package dia1y2ej5;

import java.util.Scanner;



public class Dia1y2ej5 {

    
    public static void main(String[] args) {
        
       Scanner scan = new Scanner(System.in);
       
       int numero1;
       int doble;
       int triple;
       int raiz;
       
       
       
            System.out.println ("Ingrese un numero: ");
            
           numero1 = scan.nextInt();
       
            doble= numero1*2;
       
            triple=numero1*3;
       
            raiz= (int) Math.sqrt(numero1);     
                          
                
                   
                  
                
                System.out.println(" El doble del numero ingresado es: "+doble +" El triple es: "+triple +" La raiz del numero ingresado es:"+ raiz); 
        
       
    }
    
}
