
package guia8ejjex2.Entidades.Servicio;

import guia8ejjex2.Entidades.NIF;
import java.util.Scanner;

public class NIFServicio {
    private static final char[] LETRAS = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
            'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

    private final Scanner scan;

    public NIFServicio(Scanner scanner) {
        this.scan = scanner;
    }

    public void crearNif( NIF nif) {
        long dni = nif.getDni();
        int resto = (int) (dni % 23);
        char letra = LETRAS[resto];
        nif.setLetra(letra);
    }

    public void mostrar(NIF nif) {
        System.out.println(nif);
    }
}