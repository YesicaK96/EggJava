/*
 Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada en punto, y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se reemplaza por el carácter que se indica en la tabla y el resto de los caracteres (incluyendo a las vocales acentuadas) se mantienen sin cambios.
a
e
i
o
u
@
#
$
%
*

Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación correspondiente. Utilice la estructura “según” para la transformación. 
Por ejemplo, si el usuario ingresa:     Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser:  @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.

 */
package guia4ej11;

import java.util.Scanner;


public class Guia4ej11 {

   
 public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese una secuencia de caracteres terminada en punto: ");
        String entrada = input.nextLine();
        String codificada = codificarVocales(entrada);
        System.out.println("La secuencia de caracteres codificada es: " + codificada);
    }
    
    public static String codificarVocales(String entrada) {
        
        String codificada = "";
        for (int i = 0; i < entrada.length() - 1; i++) {
            char c = entrada.charAt(i);
            switch(c) {
                case 'a':
                    codificada += '@';
                    break;
                case 'e':
                    codificada += '#';
                    break;
                case 'i':
                    codificada += '$';
                    break;
                case 'o':
                    codificada += '%';
                    break;
                case 'u':
                    codificada += '*';
                    break;
                case 'A':
                    codificada += '@';
                    break;
                case 'E':
                    codificada += '#';
                    break;
                case 'I':
                    codificada += '$';
                    break;
                case 'O':
                    codificada += '%';
                    break;
                case 'U':
                    codificada += '*';
                    break;
                default:
                    codificada += c;
            }
        }
        codificada += ".";
        return codificada;
    }
}


    
    

