/*
Crea una clase en Java donde declares una variable de tipo array de Strings
que contenga los doce meses del año, en minúsculas. A continuación, declara una
variable mesSecreto de tipo String, y hazla igual a un elemento del array
(por ejemplo, mesSecreto = mes[9]. El programa debe pedir al usuario que adivine el mes secreto. 
Si el usuario acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a 
intentar adivinar el mes secreto.  Un ejemplo de ejecución del programa podría ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
¡Ha acertado!

 */
package guia9ej1ex;
import java.util.Scanner;

public class Guia9ej1ex {
    public static void main(String[] args) {
        String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        String mesSecreto = meses[9]; // Octubre
        Scanner sc = new Scanner(System.in);
        
        boolean acierto = false;
        while (!acierto) {
            System.out.print("Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: ");
            String mesAdivinado = sc.nextLine();
            if (mesAdivinado.equals(mesSecreto)) {
                System.out.println("¡Ha acertado!");
                acierto = true;
            } else {
                System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes.");
            }
        }
        
        sc.close();
    }
}