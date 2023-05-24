
package guia9ej6.pkg1.Entidad;

import java.util.Scanner;


public class Curso {
    private String nombreCurso;
    private int cantidadHorasPorDia;
    private int cantidadDiasPorSemana;
    private String turno;
    private double precioPorHora;
    private String[] alumnos;

    // Constructor por defecto
    public Curso() {
    }

    // Constructor con todos los atributos como parámetro
    public Curso(String nombreCurso, int cantidadHorasPorDia, int cantidadDiasPorSemana,
            String turno, double precioPorHora, String[] alumnos) {
        this.nombreCurso = nombreCurso;
        this.cantidadHorasPorDia = cantidadHorasPorDia;
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
        this.turno = turno;
        this.precioPorHora = precioPorHora;
        this.alumnos = alumnos;
    }

    // Métodos getters y setters de cada atributo
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

    // Método cargarAlumnos()
    public void cargarAlumnos() {
        alumnos = new String[5];
        System.out.println("Ingrese el nombre de los alumnos:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Alumno " + (i + 1) + ": ");
            alumnos[i] = System.console().readLine();
        }
    }

    // Método crearCurso()
    public void crearCurso() {
        System.out.println("Ingrese los datos del curso:");
        System.out.print("Nombre del curso: ");
        nombreCurso = System.console().readLine();
        System.out.print("Cantidad de horas por día: ");
        cantidadHorasPorDia = Integer.parseInt(System.console().readLine());
        System.out.print("Cantidad de días por semana: ");
        cantidadDiasPorSemana = Integer.parseInt(System.console().readLine());
        System.out.print("Turno (mañana o tarde): ");
        turno = System.console().readLine();
        System.out.print("Precio por hora: ");
        precioPorHora = Double.parseDouble(System.console().readLine());

        cargarAlumnos();
    }

    // Método calcularGananciaSemanal()
    public double calcularGananciaSemanal() {
        return cantidadHorasPorDia * cantidadDiasPorSemana * precioPorHora * 5;
    }

    public void crearCurso(Scanner scanner) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void mostrarCurso() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
