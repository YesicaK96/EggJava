
package guia9ej5.pkg1.Servicios;



//import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import guia9ej5.pkg1.Entidades.Persona;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class PersonaService {

    private Scanner scanner;

    public PersonaService() {
        scanner = new Scanner(System.in);
    }

    public Persona crearPersona( string nombre, Date Fechadenacimiento) {
        System.out.print("Ingrese el nombre de la persona: ");
        String nombress = scanner.nextLine();
        Date fechaNacimiento = obtenerFechaNacimiento();
        return new Persona(nombress, fechaNacimiento);
    }

    private Date obtenerFechaNacimiento() {
        System.out.println("Ingrese la fecha de nacimiento (dd/mm/aaaa): ");
        System.out.print("Día: ");
        int dia = scanner.nextInt();
        System.out.print("Mes: ");
        int mes = scanner.nextInt() - 1; // Los meses van de 0 a 11 en Calendar
        System.out.print("Año: ");
        int anio = scanner.nextInt();
        Calendar calendar = Calendar.getInstance();
        calendar.set(anio, mes, dia);
        return calendar.getTime();
    }

    public int calcularEdad(Persona persona) {
        Calendar fechaNacimiento = Calendar.getInstance();
        fechaNacimiento.setTime(persona.getFechaNacimiento());
        Calendar fechaActual = Calendar.getInstance();
        int edad = fechaActual.get(Calendar.YEAR) - fechaNacimiento.get(Calendar.YEAR);
        if (fechaActual.get(Calendar.DAY_OF_YEAR) < fechaNacimiento.get(Calendar.DAY_OF_YEAR)) {
            edad--;
        }
        return edad;
    }

    public boolean menorQue(Persona persona, int edad) {
        return calcularEdad(persona) < edad;
    }

    public void mostrarPersona(Persona persona) {
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Fecha de nacimiento: " + persona.getFechaNacimiento());
        System.out.println("Edad: " + calcularEdad(persona));
    }
}
