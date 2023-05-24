/*
Desarrollar una clase Cancion con los siguientes atributos: título y autor.
Se deberá definir además dos constructores: uno vacío que inicializa el título 
y el autor a cadenas vacías y otro que reciba como parámetros el título y el
autor de la canción. Se deberán además definir los métodos getters y setters 
correspondientes.
 */
package guia7ejex1;

public class Guia7ejex1 {

    
    public static void main(String[] args) {
        

        System.out.println("Título: " + miCancion.getTitulo());
        System.out.println("Autor: " + miCancion.getAutor());

        miCancion.setTitulo("Stairway to Heaven");
        miCancion.setAutor("Led Zeppelin");

        System.out.println("Título: " + miCancion.getTitulo());
        System.out.println("Autor: " + miCancion.getAutor());

    }
    
}
