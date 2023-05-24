/*
Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
los servicios en la clase correspondiente)
Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
cómo se ordena un conjunto.
Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
al usuario.
 */
package guia10ej5;

import java.util.*;

public class Guia10Ej5 {

    public static void main(String[] args) {
        Set<String> paises = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.print("Ingrese un país (o 'salir' para terminar): ");
            String pais = scanner.nextLine();

            if (pais.equalsIgnoreCase("salir")) {
                continuar = false;
            } else {
                if (paises.add(pais)) {
                    System.out.println("País agregado correctamente.");
                } else {
                    System.out.println("El país ya existe en el conjunto.");
                }
            }
        }

        System.out.println("\nPaíses guardados en el conjunto:");
        for (String pais : paises) {
            System.out.println(pais);
        }

        List<String> paisesOrdenados = new ArrayList<>(paises);
        Collections.sort(paisesOrdenados);

        System.out.println("\nPaíses ordenados alfabéticamente:");
        for (String pais : paisesOrdenados) {
            System.out.println(pais);
        }

        System.out.print("\nIngrese un país para eliminar: ");
        String paisEliminar = scanner.nextLine();

        Iterator<String> iterator = paises.iterator();
        while (iterator.hasNext()) {
            String pais = iterator.next();
            if (pais.equalsIgnoreCase(paisEliminar)) {
                iterator.remove();
                System.out.println("País eliminado correctamente.");
                break;
            }
        }

        System.out.println("\nPaíses restantes en el conjunto:");
        for (String pais : paises) {
            System.out.println(pais);
        }
    }
}
