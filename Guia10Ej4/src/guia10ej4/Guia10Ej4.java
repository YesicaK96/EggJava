/*
4. Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
tendremos una clase Pelicula con el título, director y duración de la película (en horas).
Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
que se pide a continuación:
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:

22

• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */
package guia10ej4;

import guia10ej4.Servicios.PeliculaServicio;
import java.util.Scanner;
public class Guia10Ej4 {

    public static void main(String[] args) {
        PeliculaServicio peliculaService = new PeliculaServicio();
        Scanner scanner = new Scanner(System.in);
        boolean crearOtraPelicula = true;

        while (crearOtraPelicula) {
            peliculaService.crearPelicula();

            System.out.println("¿Desea crear otra película? (Sí/No)");
            String opcion = scanner.nextLine();
            if (opcion.equalsIgnoreCase("No")) {
                crearOtraPelicula = false;
            }
        }

        System.out.println("---- Todas las películas ----");
        peliculaService.mostrarPeliculas();

        System.out.println("---- Películas con duración mayor a 1 hora ----");
        peliculaService.mostrarPeliculasDuracionMayorAUnaHora();

        System.out.println("---- Películas ordenadas por duración (de mayor a menor) ----");
        peliculaService.ordenarPeliculasPorDuracionMayorAMenor();

        System.out.println("---- Películas ordenadas por duración (de menor a mayor) ----");
        peliculaService.ordenarPeliculasPorDuracionMenorAMayor();

        System.out.println("---- Películas ordenadas por título ----");
        peliculaService.ordenarPeliculasPorTitulo();

        System.out.println("---- Películas ordenadas por director ----");
        peliculaService.ordenarPeliculasPorDirector();
    }
}