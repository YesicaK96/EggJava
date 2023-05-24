/*
Implemente la clase Persona en el paquete entidades. Una persona tiene un nombre y una fecha de nacimiento (Tipo Date), constructor vacío, constructor parametrizado, get y set. Crear una clase PersonaService, en el paquete servicio, con los siguientes métodos:
Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la persona a crear. Retornar el objeto Persona creado.
Método calcularEdad que calcule la edad del usuario utilizando el atributo de fecha de nacimiento y la fecha actual.
Método menorQue recibe como parámetro una Persona y una edad. Retorna true si la persona es menor que la edad consultada o false en caso contrario.
Método mostrarPersona que muestra la información de la persona deseada.

 */
package guia9ej5;

import guia9ej5.Entidades.Persona;
//import java.util.Date;
import java.util.Scanner;



public class Guia9Ej5 {


    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        PersonaService ps = new PersonaService();
        Persona persona = ps.crearPersona();
        
        // Calcular edad
        System.out.println("La edad de la persona es: " + ps.calcularEdad(persona) + " años.");
        
      
        System.out.println("Ingrese la edad a verificar:");
        int edadVerificar = leer.nextInt();
        boolean esMenor = ps.menorQue(persona, edadVerificar);
        if (esMenor) {
            System.out.println(persona.getNombre() + " es menor que " + edadVerificar + " años.");
        } else {
            System.out.println(persona.getNombre() + " no es menor que " + edadVerificar + " años.");
        }
    }
        
