
package guia7ej2.Circunferencia;

import java.util.Scanner;

public class Circunferencia {
     
    private double radio;

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void crearCircunferencia() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce el radio de la circunferencia:");
        this.radio = scan.nextDouble();
    }

    public double area() {
        return Math.PI * Math.pow(radio, 2);
    }

    public double perimetro() {
        return 2 * Math.PI * radio;
    }
}
