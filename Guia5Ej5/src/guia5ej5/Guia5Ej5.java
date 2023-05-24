/*
 Realice un programa que compruebe si una matriz dada es antisimétrica. 
Se dice que una matriz A es antisimétrica cuando ésta es igual a su propia traspuesta,
pero cambiada de signo. Es decir, A es antisimétrica si A = -AT. La matriz traspuesta de una
matriz A se denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).

 */
package guia5ej5;


public class Guia5Ej5 {

 
    public static boolean esAntisimetrica(int[][] matriz) {
    
        int[][] matriz; matriz = {{0, 1, -2}, {-1, 0, 3}, {2, -3, 0}}; {
{
        if (esAntisimetrica(matriz)) {
    System.out.println("La matriz es antisimétrica");
} else {
    System.out.println("La matriz no es antisimétrica");
}



// Verificar si la matriz es cuadrada
    if (matriz.length != matriz[0].length) {
        return false;
    }
    
    // Comprobar si cada elemento cumple la condición de antisimetría
    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz.length; j++) {
            if (matriz[i][j] != -matriz[j][i]) {
                return false;
            }
        }
    }
    
    // Si se han comprobado todos los elementos y se cumple la condición de antisimetría, entonces la matriz es antisimétrica
    return true;
    }
    

