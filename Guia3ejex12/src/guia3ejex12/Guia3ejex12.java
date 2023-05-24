/*
necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los
números del 0-0-0 al 9-9-9, con la particularidad que cada vez que
aparezca un 3 lo sustituya por una E. Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E
Nota: investigar función equals() y como convertir números a String
 */
package guia3ejex12;


public class Guia3ejex12 {

   
    public static void main(String[] args) {
       

        for (int i = 0; i < 1000; i++) {
            String contador = String.format("%03d", i);
            contador = contador.replace("3", "E");
          // los 3 por E

            System.out.println(contador);
        }
    }
}
    
    

