
package guia10ej5.PaisesSevice;

import java.util.*;

public class PaisesService {
    public static void main(String[] args) {
        PaisService paisService = new PaisService();
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.print("Ingrese un país (o 'salir' para terminar): ");
            String pais = scanner.nextLine();

            if (pais.equalsIgnoreCase("salir")) {
                continuar = false;
            } else {
                if (paisService.agregarPais(pais)) {
                    System.out.println("País agregado correctamente.");
                } else {
                    System.out.println("El país ya existe en el conjunto.");
                }
            }
        }

        System.out.println("\nPaíses guardados en el conjunto:");
        paisService.mostrarPaises();

        System.out.println("\nPaíses ordenados alfabéticamente:");
        paisService.mostrarPaisesOrdenados();

        System.out.print("\nIngrese un país para eliminar: ");
        String paisEliminar = scanner.nextLine();

        if (paisService.eliminarPais(paisEliminar)) {
            System.out.println("País eliminado correctamente.");
        } else {
            System.out.println("El país no se encuentra en el conjunto.");
        }

        System.out.println("\nPaíses restantes en el conjunto:");
        paisService.mostrarPaises();
    }
}

class PaisService {
    private Set<String> paises;

    public PaisService() {
        paises = new HashSet<>();
    }

    public boolean agregarPais(String pais) {
        return paises.add(pais);
    }

    public void mostrarPaises() {
        for (String pais : paises) {
            System.out.println(pais);
        }
    }

    public void mostrarPaisesOrdenados() {
        List<String> paisesOrdenados = new ArrayList<>(paises);
        Collections.sort(paisesOrdenados);

        for (String pais : paisesOrdenados) {
            System.out.println(pais);
        }
    }

    public boolean eliminarPais(String pais) {
        Iterator<String> iterator = paises.iterator();
        while (iterator.hasNext()) {
            String paisActual = iterator.next();
            if (paisActual.equalsIgnoreCase(pais)) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }
}
