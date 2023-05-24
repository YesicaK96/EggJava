/*
2. Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.
 */
package guia10ej2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
public class Guia10ej2 {
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

        System.out.println("Ingrese un perro a buscar:");
        String perroBuscar = scanner.nextLine();
        boolean encontrado = false;

        Iterator<String> iterator = razasPerros.iterator();
        while (iterator.hasNext()) {
            String raza = iterator.next();
            if (raza.equalsIgnoreCase(perroBuscar)) {
                iterator.remove();
                encontrado = true;
                break;
            }
        }

        System.out.println("Lista de perros después de eliminar:");
        Collections.sort(razasPerros);
        for (String raza : razasPerros) {
            System.out.println(raza);
        }

        if (!encontrado) {
            System.out.println("El perro no se encuentra en la lista.");
        }
    }
}
