/*
Realizar un programa que simule el funcionamiento de un dispositivo
RS232, este tipo de dispositivo lee cadenas enviadas por el usuario. Las
cadenas deben llegar con un formato fijo: tienen que ser de un máximo
de 5 caracteres de largo, el primer carácter tiene que ser X y el último
tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas,
la secuencia especial “&&&&&” marca el final de los envíos (llamémosla
FDE), y toda secuencia distinta de FDE, que no respete el formato se
considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de
lecturas correctas e incorrectas recibidas. Para resolver el ejercicio
deberá investigar cómo se utilizan las siguientes funciones de Java
Substring(), Length(), equals()
 */
package guia3ej7;

import java.util.Scanner;


public class Guia3ej7 {

    public static void main(String[] args) {
      
        Scanner scan = new Scanner(System.in);
        
        
        int lecturasCorrectas = 0;
        
        int lecturasIncorrectas = 0;
        
        String cadena;
        
        do {
        
            System.out.print("Ingrese una cadena (&&&&& para finalizar): ");
            
            cadena = scan.nextLine();
            
            if (cadena.equals("&&&&&")) {
                break;
            }
            
            if (cadena.length() <= 5 && cadena.substring(0, 1).equals("X") && cadena.substring(cadena.length() - 1).equals("O")) {
                lecturasCorrectas++;
            } else {
                lecturasIncorrectas++;
            }
        
        } while (true);
        
        System.out.println("Informe:");
        
        System.out.println("Lecturas correctas: " + lecturasCorrectas);
        
        System.out.println("Lecturas incorrectas: " + lecturasIncorrectas);
    }
}
    
    

