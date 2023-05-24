package Servicios;
import Entidades.CuentaBancaria;
import java.util.Scanner;

public class CuentaBancariaServicio {
    Scanner scanner = new Scanner(System.in);
    private CuentaBancaria cuenta;
    
    public void crearCuenta() {
        System.out.println("Creación de Cuenta Bancaria");
        System.out.print("Ingrese el número de cuenta: ");
        int numeroCuenta = scanner.nextInt();
        System.out.print("Ingrese el DNI del cliente: ");
        long dniCliente = scanner.nextLong();
        System.out.print("Ingrese el saldo actual: ");
        double saldoActual = scanner.nextDouble();
        cuenta = new CuentaBancaria(numeroCuenta, dniCliente, saldoActual);
        System.out.println("Cuenta creada exitosamente");
    }
    
    public void ingresar(double cantidad) {
        cuenta.setSaldoActual(cuenta.getSaldoActual() + cantidad);
        System.out.println("Ingreso de $" + cantidad + " realizado correctamente");
    }
    
    public void retirar(double cantidad) {
        if (cantidad > cuenta.getSaldoActual()) {
            cantidad = cuenta.getSaldoActual();
        }
        cuenta.setSaldoActual(cuenta.getSaldoActual() - cantidad);
        System.out.println("Retiro de $" + cantidad + " realizado correctamente");
    }
    
    
    public void extraccionRapida() {
        double saldoActual = cuenta.getSaldoActual();
        double cantidadMaxima = saldoActual * 0.2;
        System.out.print("Ingrese la cantidad a retirar (máximo $" + cantidadMaxima + "): ");
        double cantidad = scanner.nextDouble();
        if (cantidad > cantidadMaxima) {
            System.out.println("No puede retirar más de $" + cantidadMaxima);
        } else {
            retirar(cantidad);
            System.out.println("Extracción rápida realizada correctamente");
        }
    }
    
    
    public void consultarSaldo() {
        System.out.println("Saldo actual: $" + cuenta.getSaldoActual());
    }
    

    public void consultarDatos() {
        System.out.println("Número de cuenta: " + cuenta.getNumeroCuenta());
        System.out.println("DNI del cliente: " + cuenta.getDniCliente());
        System.out.println("Saldo actual: $" + cuenta.getSaldoActual());
    }
}