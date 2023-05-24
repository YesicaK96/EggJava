/*
Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se
muestre su equivalente en romano.

 */
package guia3ejex4;

import java.util.Scanner;


public class Guia3ejex4 {

   
        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       
        System.out.print("Ingresa un número entre 1 y 10: ");
        int numero = scan.nextInt();

        if (numero < 1 || numero > 10) {
            System.out.println("Número inválido.");
        } else {
            switch (numero) {
                case 1:
                    System.out.println("El número " + numero + " en romano es I.");
                    break;
                case 2:
                    System.out.println("El número " + numero + " en romano es II.");
                    break;
                case 3:
                    System.out.println("El número " + numero + " en romano es III.");
                    break;
                case 4:
                    System.out.println("El número " + numero + " en romano es IV.");
                    break;
                case 5:
                    System.out.println("El número " + numero + " en romano es V.");
                    break;
                case 6:
                    System.out.println("El número " + numero + " en romano es VI.");
                    break;
                case 7:
                    System.out.println("El número " + numero + " en romano es VII.");
                    break;
                case 8:
                    System.out.println("El número " + numero + " en romano es VIII.");
                    break;
                case 9:
                    System.out.println("El número " + numero + " en romano es IX.");
                    break;
                case 10:
                    System.out.println("El número " + numero + " en romano es X.");
                    break;
            }
        }
    }
}
    
    

