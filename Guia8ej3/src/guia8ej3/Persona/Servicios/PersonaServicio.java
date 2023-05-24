package Servicios;
import java.util.Scanner;
import Entidades.Persona;

public class PersonaServicio {
    Scanner leer = new Scanner(System.in);

    public boolean esMayorDeEdad(Persona persona) {
        return persona.getEdad() >= 18;
    }

    public Persona crearPersona() {
        Persona persona = new Persona();
        System.out.print("Ingrese el nombre: ");
        persona.setNombre(leer.nextLine());
        System.out.print("Ingrese la edad: ");
        persona.setEdad(Integer.parseInt(leer.nextLine()));
        System.out.print("Ingrese el sexo (H/M/O): ");
        persona.setSexo(leer.nextLine().charAt(0));
        while (persona.getSexo() != 'H' && persona.getSexo() != 'M' && persona.getSexo() != 'O') {
            System.out.print("Sexo ingresado incorrecto. Ingrese H, M o O: ");
            persona.setSexo(leer.nextLine().charAt(0));
        }
        System.out.print("Ingrese el peso: ");
        persona.setPeso(Double.parseDouble(leer.nextLine()));
        System.out.print("Ingrese la altura: ");
        persona.setAltura(Double.parseDouble(leer.nextLine()));
        return persona;
    }

    public int calcularIMC(Persona persona) {
        double imc = persona.getPeso() / Math.pow(persona.getAltura(), 2);
        if (imc < 20) {
            return -1;
        } else if (imc >= 20 && imc <= 25) {
            return 0;
        } else {
            return 1;
        }
    }

    public int[] calcularIMC(Persona persona1, Persona persona2, Persona persona3, Persona persona4) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int[] esMayorDeEdad(Persona persona1, Persona persona2, Persona persona3, Persona persona4) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public double calcularPorcentaje(int[] resultadosIMC, int i) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}