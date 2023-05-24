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
                scanner.nextLine();//limpiar buffersito
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
