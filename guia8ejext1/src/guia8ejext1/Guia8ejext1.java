/*
ostrarlo. ¡Muchas gracias!
Vamos a realizar una clase llamada Raices, donde representaremos los valores de
una ecuación de 2º grado. Tendremos los 3 coeficientes como atributos, llamémosles 
a, b y c. Hay que insertar estos 3 valores para construir el objeto a través de un método constructor
Luego, en RaicesServicio las operaciones que se podrán realizar son las siguientes:
Método getDiscriminante(): devuelve el valor del discriminante (double). 
El discriminante tiene la siguiente fórmula: (b^2)-4*a*c
Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones,
para que esto ocurra, el discriminante debe ser mayor o igual que 0.
Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución,
para que esto ocurra, el discriminante debe ser igual que 0.
Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 
2 posibles soluciones.
Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz. 
Es en el caso en que se tenga una única solución posible.
Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará 
por pantalla las posibles soluciones que tiene nuestra ecuación con los métodos obtenerRaices()
o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso de no existir
solución, se mostrará un mensaje.
Nota: Fórmula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varía el signo delante de -b
 */
package guia8ejext1;

import java.util.Scanner;
import guia8ejext1.Entidad.Servicios.RaicesServicio;

public class Guia8ejext1 {

    public static void main(String[] args) {
       RaicesServicio servicio = new RaicesServicio(a, b, c);
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        System.out.println("Ingrese los coeficientes de la ecuación de segundo grado: ");
        System.out.print("a = ");
        a = sc.nextDouble();
        System.out.print("b = ");
        b = sc.nextDouble();
        System.out.print("c = ");
        c = sc.nextDouble();

      RaicesServicio(Raices raices);

        double discriminante = servicio.getDiscriminante();
        boolean tieneRaices = servicio.tieneRaices();
        boolean tieneRaiz = servicio.tieneRaiz();

        if (tieneRaices) {
            System.out.println("La ecuación tiene dos raíces: ");
            servicio.obtenerRaices();
        } else if (tieneRaiz) {
            System.out.println("La ecuación tiene una única raíz: ");
            servicio.obtenerRaiz();
        } else {
            System.out.println("La ecuación no tiene solución.");
        }
    }
}
