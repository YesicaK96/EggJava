/*
Implemente la clase Persona en el paquete entidades. Una persona tiene un nombre y una fecha de nacimiento (Tipo Date), constructor vacío, constructor parametrizado, get y set. Crear una clase PersonaService, en el paquete servicio, con los siguientes métodos:
Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la persona a crear. Retornar el objeto Persona creado.
Método calcularEdad que calcule la edad del usuario utilizando el atributo de fecha de nacimiento y la fecha actual.
Método menorQue recibe como parámetro una Persona y una edad. Retorna true si la persona es menor que la edad consultada o false en caso contrario.
Método mostrarPersona que muestra la información de la persona deseada.
 */
package guia9ej5.pkg1;

import guia9ej5.pkg1.Entidades.Persona;
import guia9ej5.pkg1.Servicios.PersonaService;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Guia9ej51 {



public class Main {

    private string Nombr;
    public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PersonaService personaService = new PersonaService();
        

        System.out.print("Ingrese el nombre de la persona: ");
        String Nombr = sc.nextLine();
        System.out.print("Ingrese la fecha de nacimiento (dd/MM/yyyy): ");
        String fechaStr = sc.nextLine();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaNacimiento = null;
        try {
            fechaNacimiento = formatter.parse(fechaStr);
        } catch (Exception e) {
            System.out.println("Fecha inválida. El formato debe ser dd/MM/yyyy.");
            System.exit(0);
        }
        

        Persona persona = personaService.crearPersona(Nombr, fechaNacimiento);
        
        
        int edad = personaService.calcularEdad(persona);
        System.out.println("La edad de " + persona.getNombre() + " es: " + edad);
        
  
        System.out.print("Ingrese la edad a verificar: ");
        int edadVerificar = sc.nextInt();
        boolean esMenor = personaService.menorQue(persona, edadVerificar);
        if (esMenor) {
            System.out.println(persona.getNombre() + " es menor que " + edadVerificar + " años.");
        } else {
            System.out.println(persona.getNombre() + " no es menor que " + edadVerificar + " años.");
        }
        
        // Mostrar la información de la persona
        personaService.mostrarPersona(persona);
    }
    }
}