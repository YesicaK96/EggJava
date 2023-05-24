/*
Leer la altura de N personas y determinar el promedio de estaturas que
se encuentran por debajo de 1.60 mts. y el promedio de estaturas en
general.
 */
package guia3ejex6;

import java.util.Scanner;


public class Guia3ejex6 {

 
    public static void main(String[] args) {
     
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de personas: ");
      int n = scan.nextInt();

      
      double sumaTotal = 0;
      
      int cantidadTotal = 0;
      
      double sumaMenores = 0;
    int cantidadMenores = 0;

        for (int i = 1; i <= n; i++) {
  
            System.out.print("Ingrese la altura de la persona " + i + " (en metros): ");
         double altura = scan.nextDouble();

        
         sumaTotal += altura;
         
         cantidadTotal++;

            if (altura < 1.6) {
                sumaMenores += altura;
                cantidadMenores++;
            }
        }

        double promedioTotal = sumaTotal / cantidadTotal;
        double promedioMenores = 0;
        if (cantidadMenores > 0) {
            promedioMenores = sumaMenores / cantidadMenores;
        }

        System.out.println("El promedio de estaturas en general es: " + promedioTotal);
        System.out.println("El promedio de estaturas menores a 1.60 mts es: " + promedioMenores);
    }
}
   
