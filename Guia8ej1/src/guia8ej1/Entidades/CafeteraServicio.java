package Servicios;

import Entidades.Cafetera;
import java.util.Scanner;

public class CafeteraServicio {
    private Scanner scanner = new Scanner(System.in);
    private Cafetera cafetera;

    public CafeteraServicio() {
        cafetera = new Cafetera();
    }

    public CafeteraServicio(int capacidadMaxima, int cantidadActual) {
        cafetera = new Cafetera(capacidadMaxima, cantidadActual);
    }

    public void llenarCafetera() {
        cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
        System.out.println("La cafetera se ha llenado correctamente.");
    }

    public void servirTaza(int tamanoTaza) {
        if (cafetera.getCantidadActual() < tamanoTaza) {
            System.out.println("No se pudo llenar la taza completamente, quedó con " + cafetera.getCantidadActual() + " ml de café.");
            cafetera.setCantidadActual(0);
        } else {
            System.out.println("Se llenó la taza completamente.");
            cafetera.setCantidadActual(cafetera.getCantidadActual() - tamanoTaza);
        }
    }

    public void vaciarCafetera() {
        cafetera.setCantidadActual(0);
        System.out.println("La cafetera ha sido vaciada.");
    }

    public void agregarCafe() {
        System.out.println("Ingrese la cantidad de café a agregar en ml: ");
        int cantidadCafe = scanner.nextInt();
        if (cafetera.getCantidadActual() + cantidadCafe > cafetera.getCapacidadMaxima()) {
            System.out.println("La cafetera no puede almacenar esa cantidad de café.");
        } else {
            cafetera.setCantidadActual(cafetera.getCantidadActual() + cantidadCafe);
            System.out.println("Se ha agregado " + cantidadCafe + " ml de café a la cafetera.");
        }
    }
}