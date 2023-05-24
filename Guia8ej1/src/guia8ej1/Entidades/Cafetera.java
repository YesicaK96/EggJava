//package Guia8ej1;
package Entidades;

public class Cafetera {
    private int capacidadMaxima;
    private int cantidadActual;
    
    public Cafetera() {
        this.capacidadMaxima = 1000;
        this.cantidadActual = 0;
    }
    
    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        if (cantidadActual > capacidadMaxima) {
            this.cantidadActual = capacidadMaxima;
        } else {
            this.cantidadActual = cantidadActual;
        }
    }
    
    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }
    
    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }
    
    public int getCantidadActual() {
        return cantidadActual;
    }
    
    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
}