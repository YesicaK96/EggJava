/*
 Crea una aplicación que a través de una función nos convierta una
cantidad de euros introducida por teclado a otra moneda, estas pueden
ser a dólares, yenes o libras. La función tendrá como parámetros, la
cantidad de euros y la moneda a convertir que será una cadena, este no
devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
i. * 0.86 libras es un 1 €
ii. * 1.28611 $ es un 1 €
iii. * 129.852 yenes es un 1 €

 */
package guia4ej3;

import java.util.Scanner;


public class Guia4ej3 {

   
     
    public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de euros a convertir: ");
        double euros = scan.nextDouble();
        scan.nextLine(); 
        
        
        System.out.print("Ingrese la moneda a la que desea convertir los euros (libras, dolares o yenes): ");
        String moneda = scan.nextLine();
        
        convertirMoneda(euros, moneda);
    }
    
    public static void convertirMoneda(double euros, String moneda) {
        double cantidad = 0;
        
        switch (moneda.toLowerCase()) {
            case "libras":
                cantidad = euros * 0.86;
                break;
            case "dolares":
                cantidad = euros * 1.28611;
                break;
            case "yenes":
                cantidad = euros * 129.852;
                break;
            default:
                System.out.println("Moneda no válida");
                return;
        }
        
        //  resultado 
        System.out.println(euros + " euros son " + cantidad + " " + moneda);
    }
}

