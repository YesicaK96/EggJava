/*
Ejercicio integrador
Una escuela ha terminado su ciclo lectivo y todos sus alumnos ya rindieron el
examen final. La escuela nos ha pedido que calculemos el promedio de notas
final de todos sus alumnos y saber qué alumnos han recibido una nota por
encima de ese promedio.
Para esto vamos a tener que crear un objeto de tipo Estudiante, sus atributos
van a ser nombre y nota (representando la nota obtenida en el final).
La escuela consta con tan solo 8 estudiantes, por lo que deberemos crear los 8
estudiantes con sus respectivas notas.
Una vez creado los estudiantes deberemos guardar los estudiantes en un
arreglo de objetos tipo Estudiante, usando ese arreglo tenemos que realizar las
dos tareas que nos ha pedido la escuela.
1. Calcular y mostrar el promedio de notas de todo el curso
2. Retornar otro arreglo con los nombre de los alumnos que recibieron una
nota mayor al promedio del curso
3. Por último, deberemos mostrar todos los estudiantes con una nota
mayor al promedio.
Nota: para crear un vector de objetos la definición es la siguiente:
Objeto
 */
package estudiantesinjava;

import estudiantesinjava.Entidad.estudiante;
import java.util.Arrays;


public class Escuela {
    public static void main(String[] args) {
        estudiante[] estudiantes = new estudiante[8];

        // Crear los estudiantes con sus respectivas notas
        estudiantes[0] = new estudiante("Juan", 7.5);
        estudiantes[1] = new estudiante("María", 8.2);
        estudiantes[2] = new estudiante("Pedro", 6.9);
        estudiantes[3] = new estudiante("Ana", 9.1);
        estudiantes[4] = new estudiante("Carlos", 7.8);
        estudiantes[5] = new estudiante("Laura", 8.5);
        estudiantes[6] = new estudiante("Diego", 6.7);
        estudiantes[7] = new estudiante("Sofía", 9.4);

        // Calcular y mostrar el promedio de notas de todo el curso
        double promedio = calcularPromedio(estudiantes);
        System.out.println("Promedio de notas del curso: " + promedio);

        // Obtener los estudiantes con una nota mayor al promedio
        estudiante[] estudiantesSuperiores = obtenerEstudiantesSuperiores(estudiantes, promedio);

        // Mostrar los estudiantes con una nota mayor al promedio
        System.out.println("Estudiantes con una nota mayor al promedio:");
        for (estudiante estudiante : estudiantesSuperiores) {
            System.out.println(estudiante.getNombre() + " - Nota: " + estudiante.getNota());
        }
    }

    public static double calcularPromedio(estudiante[] estudiantes) {
        double suma = 0;
        for (estudiante estudiante : estudiantes) {
            suma += estudiante.getNota();
        }
        return suma / estudiantes.length;
    }

    public static estudiante[] obtenerEstudiantesSuperiores(estudiante[] estudiantes, double promedio) {
        estudiante[] estudiantesSuperiores = new estudiante[estudiantes.length];
        int contador = 0;
        for (estudiante estudiante : estudiantes) {
            if (estudiante.getNota() > promedio) {
                estudiantesSuperiores[contador] = estudiante;
                contador++;
            }
        }
        // Redimensionar el arreglo para eliminar los espacios vacíos
        return Arrays.copyOf(estudiantesSuperiores, contador);
    }
}