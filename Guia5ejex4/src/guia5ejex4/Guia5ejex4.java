/*
Los profesores del curso de programación de Egg necesitan llevar un registro de las notas adquiridas 
por sus 10 alumnos para luego obtener una cantidad de aprobados y desaprobados. Durante el período de cursado 
cada alumno obtiene 4 notas, 2 por trabajos prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final del programa 
los profesores necesitan obtener por pantalla la cantidad de aprobados y desaprobados, teniendo en cuenta que
solo aprueban los alumnos con promedio mayor o igual al 7 de sus notas del curso.
*/
package guia5ejex4;

import java.util.Scanner;


public class Guia5ejex4 {

    
    public static void main(String[] args) {
 
        double[][] notas = new double[10][4];
        double[] promedios = new double[10];
        int aprobados = 0;
        int desaprobados = 0;
        
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Notas del alumno " + (i+1) + ":");
            System.out.print("Primer trabajo práctico evaluativo: ");
            notas[i][0] = scanner.nextDouble();
            System.out.print("Segundo trabajo práctico evaluativo: ");
            notas[i][1] = scanner.nextDouble();
            System.out.print("Primer Integrador: ");
            notas[i][2] = scanner.nextDouble();
            System.out.print("Segundo integrador: ");
            notas[i][3] = scanner.nextDouble();
            System.out.println();
        }
        
        for (int i = 0; i < 10; i++) {
            double promedio = notas[i][0] * 0.1 + notas[i][1] * 0.15 + notas[i][2] * 0.25 + notas[i][3] * 0.5;
            promedios[i] = promedio;
        }
        
        for (int i = 0; i < 10; i++) {
            if (promedios[i] >= 7.0) {
                aprobados++;
            } else {
                desaprobados++;
            }
        }
        
        System.out.println("Cantidad de aprobados: " + aprobados);
        System.out.println("Cantidad de desaprobados: " + desaprobados);
    }
}
