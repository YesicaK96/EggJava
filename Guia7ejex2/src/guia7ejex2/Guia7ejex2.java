/*

 */
package guia7ejex2;

import guia7ejex2.Puentos.Punto;


public class Guia7ejex2 {


    public static void main(String[] args) {
// Crear un objeto Puntos
      Punto puntos;
        puntos = Punto.crearPuntos();
      
      // Calcular la distancia entre los dos puntos
      double distancia = puntos.calcularDistancia();
      
      // Imprimir el resultado
      System.out.println("La distancia entre los dos puntos es: " + distancia);
   }
}

    
    

