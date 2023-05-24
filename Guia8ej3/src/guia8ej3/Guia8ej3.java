/*
Realizar una clase llamada Persona en el paquete de entidades que tengan los 
siguientes atributos: nombre, edad, sexo (‘H’ para hombre, ‘M’ para mujer, ‘O’
para otro), peso y altura. Si desea añadir algún otro atributo, puede hacerlo.
Agregar constructores, getters y setters.
En el paquete Servicios crear PersonaServicio con los siguientes 3 métodos:
Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.
Metodo crearPersona(): el método crear persona, le pide los valores de los 
atributos al usuario y después se le asignan a sus respectivos atributos para 
llenar el objeto Persona. Además, comprueba que el sexo introducido sea correcto,
es decir, H, M o O. Si no es correcto se deberá mostrar un mensaje


Método calcularIMC(): calculara si la persona está en su peso ideal (peso en kg/(altura^2 en mt2)).
Si esta fórmula da por resultado un valor menor que 20, significa que la persona está por debajo 
de su peso ideal y la función devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25 
(incluidos), significa que la persona está en su peso ideal y la función devuelve un 0. Finalmente,
si el resultado de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y 
la función devuelve un 1.
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal, tiene sobrepeso 
o está por debajo de su peso ideal e indicar para cada objeto si la persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en distintas
variables(arrays), para después calcular un porcentaje de esas 4 personas cuantas están por debajo de su peso,
cuantas en su peso ideal y cuantos, por encima, y también calcularemos un porcentaje 
de cuantos son mayores de edad y cuantos menores. Para esto, podemos crear unos métodos adicionales.
 */
package guia8ej3;
 import Entidades.Persona;
import Servicios.PersonaServicio;
/**
 *
 * @author yesi piolita
 */
public class Guia8ej3 {

 public static void main(String[] args) {
       PersonaServicio personaServicio = new PersonaServicio();
        
        Persona persona1 = new Persona("OctaMaiLob", 30, 'H', 75.5, 1.8);
        Persona persona2 = new Persona("Luquitas Lolero", 17, 'M', 60.0, 1.65);
        Persona persona3 = new Persona("Coquero ama bultos", 40, 'H', 90.0, 1.75);
        Persona persona4 = new Persona("Dario y emi come trabucos", 29, 'M', 55.0, 1.6);
        
      
        
        personaServicio.esMayorDeEdad(persona1);
        personaServicio.calcularIMC(persona1);
        
        personaServicio.esMayorDeEdad(persona2);
        personaServicio.calcularIMC(persona2);
        
        personaServicio.esMayorDeEdad(persona3);
        personaServicio.calcularIMC(persona3);
        
        personaServicio.esMayorDeEdad(persona4);
        personaServicio.calcularIMC(persona4);
        
        int[] resultadosIMC = personaServicio.calcularIMC(persona1, persona2, persona3, persona4);
        int[] resultadosEdad = personaServicio.esMayorDeEdad(persona1, persona2, persona3, persona4);
        
        double porcentajePesoIdeal = personaServicio.calcularPorcentaje(resultadosIMC, 0);
        double porcentajeSobrepeso = personaServicio.calcularPorcentaje(resultadosIMC, 1);
        double porcentajeBajoPeso = personaServicio.calcularPorcentaje(resultadosIMC, -1);
        
        double porcentajeMayoresEdad = personaServicio.calcularPorcentaje(resultadosEdad, 1);
        double porcentajeMenoresEdad = personaServicio.calcularPorcentaje(resultadosEdad, 0);
        
        System.out.println("Porcentaje de personas en peso ideal: " + porcentajePesoIdeal + "%");
        System.out.println("Porcentaje de personas con sobrepeso: " + porcentajeSobrepeso + "%");
        System.out.println("Porcentaje de personas con bajo peso: " + porcentajeBajoPeso + "%");
        
        System.out.println("Porcentaje de personas mayores de edad: " + porcentajeMayoresEdad + "%");
        System.out.println("Porcentaje de personas menores de edad: " + porcentajeMenoresEdad + "%");
    }
}


   