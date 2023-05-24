
package guia9ej4.Servicios;

import java.util.Date;
import java.util.Scanner;

public class FechaService {

    private Scanner scanner = new Scanner(System.in).useDelimiter("\n");

    public Date fechaNacimiento() {
        System.out.println("Ingrese su fecha de nacimiento:");
        System.out.print("Día: ");
        int dia = scanner.nextInt();
        System.out.print("Mes: ");
        int mes = scanner.nextInt() - 1;
        System.out.print("Año: ");
        int anio = scanner.nextInt() - 1900;
        return new Date(anio, mes, dia);
    }

    public Date fechaActual() {
        return new Date();
    }

    public int diferencia(Date f1, Date f2) {
        int anios;
        if (f1.getMonth() == f2.getMonth()) {
            if (f2.getDay() >= f1.getDay()) {
                anios = (int) (f2.getYear() - f1.getYear());
            } else {
                anios = ((int) (f2.getYear() - f1.getYear())) - 1;
            }
        } else if (f2.getMonth() > f1.getMonth()) {
            anios = (int) (f2.getYear() - f1.getYear());
        } else {
            anios = ((int) (f2.getYear() - f1.getYear())) - 1;
        }

        return anios;
    }
}