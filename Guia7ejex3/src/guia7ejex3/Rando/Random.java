
package guia7ejex3.Rando;


    import java.util.Random;
import java.util.Scanner;

public class Juego {
    private int numIntentos;
    private int ganador1;
    private int ganador2;

    public void iniciar_juego() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean seguirJugando = true;

        while (seguirJugando) {

            int numAdivinar = random.nextInt(100) + 1;
            System.out.println("Jugador 1, elige un número entre 1 y 100:");

     
            int numElegido = scanner.nextInt();
            while (numElegido < 1 || numElegido > 100) {
                System.out.println("Número inválido. Elige un número entre 1 y 100:");
                numElegido = scanner.nextInt();
            }

          
            numIntentos = 0;
            boolean adivinado = false;


            System.out.println("Jugador 2, adivina el número elegido por Jugador 1 (tienes 10 intentos):");
            while (!adivinado && numIntentos < 10) {
                int intento = scanner.nextInt();
                numIntentos++;

                if (intento == numAdivinar) {
                    System.out.println("¡Correcto! Lo adivinaste en " + numIntentos + " intentos.");
                    adivinado = true;

                
                    if (numIntentos % 2 == 0) {
                        ganador2++;
                    } else {
                        ganador1++;
                    }
                } else if (intento < numAdivinar) {
                    System.out.println("Más alto.");
                } else {
                    System.out.println("Más bajo.");
                }
            }

            if (!adivinado) {
                System.out.println("Se acabaron los intentos. El número era " + numAdivinar + ".");
                ganador1++;
            }

           
            System.out.println("¿Quieres seguir jugando? (s/n)");
            char respuesta = scanner.next().charAt(0);
            if (respuesta != 's' && respuesta != 'S') {
                seguirJugando = false;
            }
        }

        
        System.out.println("Resultados:");
        System.out.println("Jugador 1 ganó " + ganador1 + " veces.");
        System.out.println("Jugador 2 ganó " + ganador2 + " veces.");
    }
}
