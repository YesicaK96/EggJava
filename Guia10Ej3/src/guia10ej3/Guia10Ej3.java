/*
3. Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
con sus 3 notas.
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
 */
package guia10ej3;

 import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Alumno {
    private String nombre;
    private List<Integer> notas;

    public Alumno(String nombre, List<Integer> notas) {
        this.nombre = nombre;
        this.notas = notas;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Integer> getNotas() {
        return notas;
    }
}

class AlumnoService {
    private List<Alumno> listaAlumnos;

    public AlumnoService() {
        listaAlumnos = new ArrayList<>();
    }

    public void crearAlumnos() {
        Scanner scanner = new Scanner(System.in);
        boolean crearOtroAlumno = true;

        while (crearOtroAlumno) {
            System.out.println("Ingrese el nombre del alumno:");
            String nombre = scanner.nextLine();
            List<Integer> notas = new ArrayList<>();

            for (int i = 1; i <= 3; i++) {
                System.out.println("Ingrese la nota " + i + " del alumno:");
                int nota = scanner.nextInt();
                scanner.nextLine(); // Limpiar el buffer de entrada
                notas.add(nota);
            }

            Alumno alumno = new Alumno(nombre, notas);
            listaAlumnos.add(alumno);

            System.out.println("¿Desea crear otro alumno? (S/N)");
            String opcion = scanner.nextLine();
            if (opcion.equalsIgnoreCase("N")) {
                crearOtroAlumno = false;
            }
        }
    }

    public double notaFinal(String nombreAlumno) {
        for (Alumno alumno : listaAlumnos) {
            if (alumno.getNombre().equalsIgnoreCase(nombreAlumno)) {
                List<Integer> notas = alumno.getNotas();
                double promedio = 0;
                for (int nota : notas) {
                    promedio += nota;
                }
                promedio /= notas.size();
                return promedio;
            }
        }
        return 0;
    }
}

public class Guia10Ej3 {
    public static void main(String[] args) {
        AlumnoService alumnoService = new AlumnoService();
        alumnoService.crearAlumnos();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del alumno para calcular su nota final:");
        String nombreAlumno = scanner.nextLine();

        double notaFinal = alumnoService.notaFinal(nombreAlumno);
        if (notaFinal != 0) {
            System.out.println("La nota final del alumno " + nombreAlumno + " es: " + notaFinal);
        } else {
            System.out.println("El alumno no se encuentra en la lista.");
        }
    }
}
  
