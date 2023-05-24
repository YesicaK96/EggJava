/*
Recorrer un vector de N enteros 
contabilizando cuántos números son de 1 dígito, 
cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package guia5ej3;



public class Guia5Ej3 {

    
     
    public static void main(String[] args) {
    
      int[] numeros = {1, 10, 200, 3000, 40000, 500000};  //LOS 5 DIG
        int[] contadores = new int[5]; 
        
      
        for (int i = 0; i < numeros.length; i++) {  //0 A 4
            String numeroStr = String.valueOf(numeros[i]);
            int longitud = numeroStr.length();
            if (longitud <= 5) {
                contadores[longitud - 1]++; 
            }
        }
        
        for (int i = 0; i < contadores.length; i++) {
            System.out.println("Cantidad de números de " + (i+1) + " dígito(s): " + contadores[i]);
        }
    }
}