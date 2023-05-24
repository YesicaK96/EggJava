
package guia9ej5.Entidades.Servicios;



private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Persona crearPersona() {
        System.out.println("Ingrese el nombre de la persona:");
        String nombre = leer.nextLine();
        
        Date fechaNacimiento = fechaNacimiento();
        
        return new Persona(nombre, fechaNacimiento);
    }
    
    private Date fechaNacimiento() {
        System.out.println("Ingrese la fecha de nacimiento de la persona:");
        System.out.print("Dia: ");
        int dia = leer.nextInt();
        System.out.print("Mes: ");
        int mes = leer.nextInt() - 1;
        System.out.print("Año: ");
        int anio = leer.nextInt() - 1900;
        
        return new Date(anio, mes, dia);
    }
    
    public int calcularEdad(Persona persona) {
        int anios;
        Date fa = new Date();
        if (persona.getFechaNacimiento().getDay()== fa.getMonth()) {
            if (fa.getDay() >= persona.getFechaNacimiento().getDay()) {
                anios = (int) (fa.getYear() - persona.getFechaNacimiento().getYear());
            } else {
                anios = ((int) (fa.getYear() - persona.getFechaNacimiento().getYear())) - 1;
            }
        } else if (fa.getMonth() > persona.getFechaNacimiento().getMonth()) {
            anios = (int) (fa.getYear() - persona.getFechaNacimiento().getYear());
        } else {
            anios = ((int) (fa.getYear() - persona.getFechaNacimiento().getYear())) - 1;
        }
        
        return anios;
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
}
} 
}
