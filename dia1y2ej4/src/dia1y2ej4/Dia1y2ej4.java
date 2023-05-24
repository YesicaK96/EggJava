/*
Dada una cantidad de grados centígrados se debe mostrar su 
equivalente en grados Fahrenheit. La fórmula correspondiente es:
F = 32 + (9 * C / 5).
 */
package dia1y2ej4;

import java.util.Scanner;


public class Dia1y2ej4 {


    public static void main(String[] args) {
        
        Scanner  scan = new Scanner(System.in);
        
        int c;
        int fahrenheit;
        
        
        System.out.println ("Ingrse los grados centigrados");
        
       c = scan.nextInt();
        
        fahrenheit= 32+(9*c/5);
        
                System.out.print( " es igual a: "+ fahrenheit);
        
                
    }
    
}
