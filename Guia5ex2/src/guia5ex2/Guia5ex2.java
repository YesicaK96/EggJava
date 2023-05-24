/*
Utilizando un Bucle for, aloja en el vector Equipo, los nombres 
de tus compañeros de equipo

 */
package guia5ex2;


public class Guia5ex2 {

    public static void main(String[] args) {

String[] Equipo = new String[5];

for (int i = 0; i < Equipo.length; i++) {
    System.out.println("Ingresa el nombre del compañero " + (i+1) + ":");
    Equipo[i] = scan.nextLine();
}

System.out.println("Los nombres de los compañeros de equipo son:");
for (int i = 0; i < Equipo.length; i++) {
    System.out.println(Equipo[i]);
}
    }
    
}
