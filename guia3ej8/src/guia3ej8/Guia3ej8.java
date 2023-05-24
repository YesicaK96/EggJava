                     /*
  Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar
lo siguiente:
* * * *
*     *
*     *
* * * *
 */
package guia3ej8;

import java.util.Scanner;


public class Guia3ej8 {

    
    
    public static void main(String[] args) {
    
       
        
    Scanner sc = new Scanner(System.in);
        
    System.out.print("Ingrese el tamaño del cuadrado: ");
       
        int n = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
    
            for (int j = 1; j <= n; j++) {
            
                if (i == 1 || i == n || j == 1 || j == n) {
                
                    // borde
                    System.out.print("* ");
                } else {
                    // espacio 
                    System.out.print("  ");
                }
            }
            // Salto de línea
            System.out.println();
        }
    }
}

