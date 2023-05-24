
package guia9ej6.Curso;

import java.util.Scanner;



public class Curso {
    private String nombreCurso;
    private int cantidadHorasPorDia;
    private int cantidadDiasPorSemana;
    private String turno;
    private double precioPorHora;
    private String[] alumnos;

    public Curso() {
    }

    public Curso(String nombreCurso, int cantidadHorasPorDia, int cantidadDiasPorSemana, String turno, double precioPorHora, String[] alumnos) {
        this.nombreCurso = nombreCurso;
        this.cantidadHorasPorDia = cantidadHorasPorDia;
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
        this.turno = turno;
        this.precioPorHora = precioPorHora;
        this.alumnos = alumnos;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getCantidadHorasPorDia() {
        return cantidadHorasPorDia;
    }

    public void setCantidadHorasPorDia(int cantidadHorasPorDia) {
        this.cantidadHorasPorDia = cantidadHorasPorDia;
    }

    public int getCantidadDiasPorSemana() {
        return cantidadDiasPorSemana;
    }

    public void setCantidadDiasPorSemana(int cantidadDiasPorSemana) {
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getPrecioPorHora() {
        return precioPorHora;
    }

    public void setPrecioPorHora(double precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }

    public void cargarAlumnos() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el nombre del alumno " + (i + 1) + ": ");
            alumnos[i] = scanner.nextLine();
        }
    }

    public void crearCurso() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del curso: ");
        nombreCurso = scanner.nextLine();
        System.out.print("Ingrese la cantidad de horas por día: ");
        cantidadHorasPorDia = scanner.nextInt();
        System.out.print("Ingrese la cantidad de días por semana: ");
        cantidadDiasPorSemana = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ingrese el turno (mañana o tarde): ");
        turno = scanner.nextLine();
        System.out.print("Ingrese el precio por hora: ");
        precioPorHora = scanner.nextDouble();
        scanner.nextLine();
        alumnos = new String[5];
        cargarAlumnos();
    }

    public double calcularGananciaSemanal() {
        return cantidadHorasPorDia * precioPorHora * alumnos.length * cantidadDiasPorSemana;
    }
}