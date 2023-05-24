/*
Crea una aplicación que le pida dos números al usuario y este pueda
elegir entre sumar, restar, multiplicar y dividir. La aplicación debe tener
una función para cada operación matemática y deben devolver sus
resultados para imprimirlos en el main.
 */
package guia4ej1;

import java.util.Scanner;


public class Guia4ej1 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();
        
       
        System.out.println("¿Qué operación desea realizar?");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        
//opcion ing por el us
        int opcion = scanner.nextInt();
        
        
        switch (opcion) {
            case 1:
                double suma = sumar(num1, num2);
                System.out.println("La suma es: " + suma);
                break;
            case 2:
                double resta = restar(num1, num2);
                System.out.println("La resta es: " + resta);
                break;
            case 3:
                double multiplicacion = multiplicar(num1, num2);
                System.out.println("La multiplicación es: " + multiplicacion);
                break;
            case 4:
                double division = dividir(num1, num2);
                System.out.println("La división es: " + division);
                break;
            default:
                System.out.println("Opción inválida");
                break;
        }
    }
    
   
    public static double sumar(double num1, double num2) {
        return num1 + num2;
    }
    
    public static double restar(double num1, double num2) {
        return num1 - num2;
    }
    
    public static double multiplicar(double num1, double num2) {
        return num1 * num2;
    }
    
    public static double dividir(double num1, double num2) {
        return num1 / num2;
    }
}
   