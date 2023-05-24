/*
. Realizar un programa que solo permita introducir solo frases o palabras
de 8 de largo. Si el usuario ingresa una frase o palabra de 8 de largo se
deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, en
caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la
función Lenght() en Java.
 */
package guia3ej3;

import java.util.Scanner;


public class Guia3ej3 {

    
  
 public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);
     
        System.out.print("Ingresa una frase o palabra de 8 caracteres: ");
        
        String frase = scanner.nextLine();
        
        if (frase.length() == 8) {
        
            System.out.println("CORRECTO");
        
        } else {
        
            System.out.println("INCORRECTO");
        
        }
    
 }

        
        
        
    }
    

