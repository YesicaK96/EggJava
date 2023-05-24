/*
Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular". 
Luego, crea un método "retirar_dinero" que permita retirar una cantidad
de dinero del saldo de la cuenta. Asegúrate de que el saldo nunca sea
negativo después de realizar una transacción de retiro.
 */
package guia7ejex4;

import Guia7ejex4.Saldo.Titular;
public class Guia7ejex4 {

   

    public static void main(String[] args) {
   
       Titular cuenta = new Titular("Yesica", 1000);
        cuenta.depositar_dinero(500);
        cuenta.retirar_dinero(2000);
        cuenta.retirar_dinero(800);
        System.out.println("El saldo de la cuenta de " + cuenta.obtener_titular() + " es " + cuenta.obtener_saldo() + " pesos.");
    }

    
