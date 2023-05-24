/*
Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos,
sus atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto 
puntos usando un método crearPuntos()
que le pide al usuario los dos números y los ingresa en los atributos del objeto. 
Después, a través de otro método calcular y devolver la distancia que existe entre
los dos puntos que existen en la clase Puntos.
 */
package guia7ejex2.Puentos;

import java.util.Scanner;



public class Punto {
   // Atributos
   private int x1, y1, x2, y2;

   // Constructor
   public Punto(int x1, int y1, int x2, int y2) {
      this.x1 = x1;
      this.y1 = y1;
      this.x2 = x2;
      this.y2 = y2;
   }

   // Método para calcular la distancia entre dos puntos
   public double calcularDistancia() {
      int deltaX = x2 - x1;
      int deltaY = y2 - y1;
      return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
   }

   // Método para crear un objeto Puntos y pedir al usuario los valores
   public static Punto crearPuntos() {
      Scanner sc = new Scanner(System.in);
      System.out.print("Ingresa el valor de x1: ");
      int x1 = sc.nextInt();
      System.out.print("Ingresa el valor de y1: ");
      int y1 = sc.nextInt();
      System.out.print("Ingresa el valor de x2: ");
      int x2 = sc.nextInt();
      System.out.print("Ingresa el valor de y2: ");
      int y2 = sc.nextInt();
      return new Punto(x1, y1, x2, y2);
   }
}