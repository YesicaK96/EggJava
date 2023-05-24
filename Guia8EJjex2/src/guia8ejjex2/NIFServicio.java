/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8ejjex2;

import guia8ejjex2.Entidades.NIF;
import java.util.Scanner;



public class NIFService {
    private static final char[] LETRAS_DNI = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

    public NIF crearNif() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el número de DNI: ");
        long numeroDNI = scanner.nextLong();
        scanner.close();


        int resto = (int) (numeroDNI % 23);
        char letra = LETRAS_DNI[resto];


        NIF nif = new NIF();
        nif.setNumeroDNI(numeroDNI);
        nif.setLetra(letra);

        return nif;
    }

    public void mostrar(NIF nif) {
        long numeroDNI = nif.getNumeroDNI();
        char letra = nif.getLetra();
        System.out.println(String.format("%08d-%c", numeroDNI, letra));
    }
}