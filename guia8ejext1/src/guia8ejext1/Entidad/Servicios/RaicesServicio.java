
package guia8ejext1.Entidad.Servicios;

import guia8ejext1.Guia8ejext1;

public class RaicesServicio {
    private Raices raices;

    public RaicesServicio(Raices raices) {
        this.raices = raices;
    }


    public double getDiscriminante() {
        double discriminante = Math.pow(this.raices.getB(), 2) - 4 * this.raices.getA() * this.raices.getC();
        return discriminante;
    }

    public boolean tieneRaices() {
        double discriminante = getDiscriminante();
        if (discriminante >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean tieneRaiz() {
        double discriminante = getDiscriminante();
        if (discriminante == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void obtenerRaices() {
        double discriminante = getDiscriminante();
        if (tieneRaices()) {
            double x1 = (-this.raices.getB() + Math.sqrt(discriminante)) / (2 * this.raices.getA());
            double x2 = (-this.raices.getB() - Math.sqrt(discriminante)) / (2 * this.raices.getA());
            System.out.println("Las posibles soluciones son: " + x1 + " y " + x2);
        } else {
            System.out.println("No hay soluciones reales");
        }
    }

    public void obtenerRaiz() {
        double discriminante = getDiscriminante();
        if (tieneRaiz()) {
            double x = -this.raices.getB() / (2 * this.raices.getA());
            System.out.println("La única solución es: " + x);
        } else {
            System.out.println("No hay solución única");
        }
    }

    public void calcular() {
        if (tieneRaices()) {
            obtenerRaices();
        } else if (tieneRaiz()) {
            obtenerRaiz();
        } else {
            System.out.println("No hay soluciones reales");
        }
    }
}
