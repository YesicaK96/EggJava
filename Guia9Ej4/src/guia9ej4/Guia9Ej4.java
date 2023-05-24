/*
Vamos a usar la clase Date que ya existe en Java. Crearemos la clase FechaService, 
en paquete Servicios, que tenga los siguientes métodos:
Método fechaNacimiento que pregunte al usuario día, mes y año de su nacimiento.
Luego los pase por parámetro a un nuevo objeto Date. El método debe retornar el objeto Date.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Método fechaActual que cree un objeto fecha con el día actual. Para esto usaremos el
constructor vacío de la clase Date. Ejemplo: Date fechaActual = new  Date();
El método debe retornar el objeto Date.
Método diferencia que reciba las dos fechas por parámetro y retorna la diferencia 
de años entre una y otra (edad del usuario).
 */
package guia9ej4;

import guia9ej4.Servicios.FechaService;

import java.util.Date;
//import java.util.Scanner;

public class Guia9Ej4 {
  public static void main(String[] args) {
        FechaService fs = new FechaService();
       // Scanner scanner = new Scanner(System.in);

        
       
        Date fechaNacimiento = fs.fechaNacimiento();
      

   
        Date fechaActual = fs.fechaActual();

        
        int diferencia = fs.diferencia(fechaNacimiento, fechaActual);

        System.out.println("Su edad es: " + diferencia + " años.");
    }
}