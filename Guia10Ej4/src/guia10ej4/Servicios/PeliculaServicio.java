
package guia10ej4.Servicios;



import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class PeliculaServicio {
    private List <Movie> peliculas;

    public PeliculaServicio() {
        peliculas = new ArrayList<>();
    }

    public void crearPelicula() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el título de la película:");
        String titulo = scanner.nextLine();

        System.out.println("Ingrese el director de la película:");
        String director = scanner.nextLine();

        System.out.println("Ingrese la duración de la película en horas:");
        int duracion = scanner.nextInt();
        scanner.nextLine(); // Limpiar 

        Movie pelicula = new Movie(titulo, director, duracion);
        peliculas.add(pelicula);

        System.out.println("Película creada correctamente.");
        System.out.println();
    }

    public void mostrarPeliculas() {
        for (Movie pelicula : peliculas) {
            System.out.println(pelicula);
        }
        System.out.println();
    }

    public void mostrarPeliculasDuracionMayorAUnaHora() {
        for (Movie pelicula : peliculas) {
            if (pelicula.getDuracion() > 1) {
                System.out.println(pelicula);
            }
        }
        System.out.println();
    }

    public void ordenarPeliculasPorDuracionMayorAMenor() {
        peliculas.sort(Comparator.comparingInt(Movie::getDuracion).reversed());
        mostrarPeliculas();
    }

    public void ordenarPeliculasPorDuracionMenorAMayor() {
        peliculas.sort(Comparator.comparingInt(Movie::getDuracion));
        mostrarPeliculas();
    }

    public void ordenarPeliculasPorTitulo() {
        peliculas.sort(Comparator.comparing(Movie::getTitulo));
        mostrarPeliculas();
    }

    public void ordenarPeliculasPorDirector() {
        peliculas.sort(Comparator.comparing(Movie::getDirector));
        mostrarPeliculas();
    }
}
