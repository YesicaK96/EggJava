/*
Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida que el usuario las va ingresando, 
construya una “sopa de letras para niños” de tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal 
en una fila que será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras, rellene los espacios no 
utilizados con un número aleatorio del 0 al 9. Finalmente imprima por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java substring(), 
Length() y Math.random().
 */
package guia5ejex6;

import java.util.Scanner;


public class Guia5ejex6 {

    
    public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
        
        String[] palabras = new String[5];
        for (int i = 0; i < palabras.length; i++) {
            System.out.print("Ingrese una palabra de 3 a 5 caracteres: ");
            palabras[i] = sc.nextLine().toUpperCase();
            while (palabras[i].length() < 3 || palabras[i].length() > 5) {
                System.out.print("La palabra debe tener entre 3 y 5 caracteres, ingrese nuevamente: ");
                palabras[i] = sc.nextLine().toUpperCase();
            }
        }
        
        char[][] sopaLetras = new char[20][20];
        
        int fila = (int) (Math.random() * 20);
        
        int indice = 0;
        for (int j = 0; j < 20 && indice < palabras.length; j++) {
            if (j + palabras[indice].length() <= 20) {
                for (int k = 0; k < palabras[indice].length(); k++) {
                    sopaLetras[fila][j + k] = palabras[indice].charAt(k);
                }
                indice++;
                j += palabras[indice - 1].length();
            }
        }
        
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (sopaLetras[i][j] == 0) {
                    sopaLetras[i][j] = (char) (Math.random() * 10 + '0');
                }
            }
        }
        
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(sopaLetras[i][j] + " ");
            }
            System.out.println();
        }
    }

}