package Entidades.Servicios;

import Entidades.Estudiante;

public class EscuelaService {

    public static void main(String[] args) {
        Estudiante[] estudiantes = crearEstudiantes();

        double promedio = calcularPromedio(estudiantes);
        System.out.println("Promedio de notas: " + promedio);

        Estudiante[] estudiantesSuperiores = obtenerEstudiantesSuperiores(estudiantes, promedio);
        System.out.println("Estudiantes con nota superior al promedio:");
        for (Estudiante estudiante : estudiantesSuperiores) {
            System.out.println(estudiante.getNombre());
        }

        System.out.println("Todos los estudiantes con nota superior al promedio:");
        mostrarEstudiantesSuperiores(estudiantes, promedio);
    }

    public static Estudiante[] crearEstudiantes() {
        Estudiante[] estudiantes = new Estudiante[8];

        estudiantes[0] = new Estudiante("Dario", 8.5);
        estudiantes[1] = new Estudiante("Octavio", 9.5);
        estudiantes[2] = new Estudiante("Lucas", 9.1);
        estudiantes[3] = new Estudiante("Emiliano", 6.8);
        estudiantes[4] = new Estudiante("Abel", 8.9);
        estudiantes[5] = new Estudiante("Yesica", 7.5);
        estudiantes[6] = new Estudiante("Mariano", 9.3);
        estudiantes[7] = new Estudiante("Agustin", 8.7);
        return estudiantes;
    }

    public static double calcularPromedio(Estudiante[] estudiantes) {
        double sumaNotas = 0;
        for (Estudiante estudiante : estudiantes) {
            sumaNotas += estudiante.getNota();
        }
        return sumaNotas / estudiantes.length;
    }

    public static Estudiante[] obtenerEstudiantesSuperiores(Estudiante[] estudiantes, double promedio) {
        int count = 0;
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getNota() > promedio) {
                count++;
            }
        }
        Estudiante[] estudiantesSuperiores = new Estudiante[count];
        int index = 0;
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getNota() > promedio) {
                estudiantesSuperiores[index] = estudiante;
                index++;
            }
        }
        return estudiantesSuperiores;
    }

    public static void mostrarEstudiantesSuperiores(Estudiante[] estudiantes, double promedio) {
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getNota() > promedio) {
                System.out.println(estudiante.getNombre() + " - Nota: " + estudiante.getNota());
            }
        }
    }
}

