/*
Dado un tiempo en minutos, calcular su equivalente en días y horas. Por
ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su
equivalente: 1 día, 2 horas.
 */
package guia3ej8;
 

import java.util.Scanner;


public class Guia3ejext1 {

   
     public static void main(String[] args) {
      
         Scanner scanner = new Scanner(System.in);
       
         int minutos = scanner.nextInt();
       
         int horas = minutos / 60;
       
         int dias = horas / 24;
       
         horas = horas % 24;
        
         System.out.println(minutos + " minutos son " + dias + " días y " + horas + " horas.");
    }
}
