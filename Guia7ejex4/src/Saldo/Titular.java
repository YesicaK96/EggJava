
package Guia7ejex4.Saldo;


public class Titular {
    private String titular;
    private double saldo;

    public Titular(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void retirar_dinero(double cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Se retiraron " + cantidad + " pesos de la cuenta de " + titular + ".");
        } else {
            System.out.println("No se puede retirar " + cantidad + " pesos de la cuenta de " + titular +
                    " porque el saldo es insuficiente.");
        }


        if (saldo < 0) {
            saldo = 0;
            System.out.println("El saldo de la cuenta de " + titular + " se ha ajustado a cero para evitar saldo negativo.");
        }
    }

    public void depositar_dinero(double cantidad) {
        saldo += cantidad;
        System.out.println("Se depositaron " + cantidad + " pesos en la cuenta de " + titular + ".");
    }

    public double obtener_saldo() {
        return saldo;
    }

    public String obtener_titular() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}