/*
 Crear en el Main dos arreglos. El arreglo A de 50 números reales y el arreglo
B de 20 números reales. Crear la clase ArregloService, en el paquete servicio, 
con los siguientes métodos:
Método inicializarA recibe un arreglo por parámetro y lo inicializa con 
números aleatorios.
Método mostrar recibe un arreglo por parámetro y lo muestra por pantalla.
Método ordenar recibe un arreglo por parámetro y lo ordena de mayor a menor.
Método inicializarB copia los primeros 10 números del arreglo A en el arreglo 
B. Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
En el Main nuevamente: inicializar A, mostrar A, ordenar A, inicializar B,
mostrar A y B.
 */
package guia9ej3;

import guia9ej3.Servicio.ArregloService;

public class Main {

    public static void main(String[] args) {
        double[] arregloA = new double[50];
        double[] arregloB = new double[20];

        ArregloService servicio = new ArregloService();

        servicio.inicializarA(arregloA);

        System.out.println("Arreglo A:");
        servicio.mostrar(arregloA);

        servicio.ordenar(arregloA);

        System.out.println("Arreglo A ordenado:");
        servicio.mostrar(arregloA);

        servicio.inicializarB(arregloA, arregloB);

        System.out.println("Arreglo B:");
        servicio.mostrar(arregloB);

        System.out.println("Arreglo A después de inicializar B:");
        servicio.mostrar(arregloA);
    }

}