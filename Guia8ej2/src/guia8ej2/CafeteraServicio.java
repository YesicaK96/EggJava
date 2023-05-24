package Servicios;
import Entidades.Cafetera;
import java.util.Scanner;

public class CafeteraServicio {
    private Scanner sc = new Scanner(System.in);

    
    public void llenarCafetera(Cafetera cafetera, String setCantidadActual) {
        cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
       
        System.out.println("La cafetera se ha llenado"+ setCantidadActual);
    }
    
    public void servirTaza(Cafetera cafetera) {
        System.out.println("Introduce el tamaño de la taza en ml: ");
        int taza = sc.nextInt();
        if (cafetera.getCantidadActual() >= taza) {
            cafetera.setCantidadActual(cafetera.getCantidadActual() - taza);
            System.out.println("Se ha llenado la taza con éxito");
        } else {
            int restante = cafetera.getCantidadActual();
            cafetera.setCantidadActual(0);
            System.out.println("No se pudo llenar la taza completamente, se sirvieron " + restante + " ml de café");
        }
    }
    
    public void vaciarCafetera(Cafetera cafetera) {
        cafetera.setCantidadActual(0);
        System.out.println("La cafetera se ha vaciado con éxito");
    }
    
    public void agregarCafe(Cafetera cafetera) {
        System.out.println("Introduce la cantidad de café a agregar en ml: ");
        int cantidad = sc.nextInt();
        cafetera.setCantidadActual(cafetera.getCantidadActual() + cantidad);
        System.out.println("Se ha agregado " + cantidad + " ml de café a la cafetera");
    }

    public void llenarCafetera() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void vaciarCafetera() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    }

