/*
1. Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
 */
package guia10ej1;

import java.util.ArrayList;
import java.util.Scanner;

public class Guia10ej1 {
    public static void main(String[] args) {
        ArrayList<String> razasPerros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String razaPerro;

        boolean continuar = true;
        while (continuar) {
            System.out.println("Ingrese la raza del perro:");
            razaPerro = scanner.nextLine();
            razasPerros.add(razaPerro);

            System.out.println("¿Desea guardar otro perro? (S/N)");
            String opcion = scanner.nextLine();
            if (opcion.equalsIgnoreCase("N")) {
                continuar = false;
            }
        }

        System.out.println("Razas de perros guardadas:");
        for (String raza : razasPerros) {
            System.out.println(raza);
        }
    }
}

   
