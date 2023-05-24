
package guia9ej1.Entidades.Servicios;

import guia9ej1.Entidades.Cadena;


public class CadenaServicio {

    public void mostrarVocales(Cadena cadena) {
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < cadena.getFrase().length(); i++) {
            if (vowels.indexOf(cadena.getFrase().charAt(i)) != -1) {
                count++;
            }
        }
        System.out.println("La frase ingresada contiene " + count + " vocales.");
    }

    public void invertirFrase(Cadena cadena) {
        StringBuilder sb = new StringBuilder(cadena.getFrase());
        sb.reverse();
        System.out.println("La frase invertida es: " + sb.toString());
    }

    public void vecesRepetido(Cadena cadena, String letra) {
        int count = 0;
        for (int i = 0; i < cadena.getFrase().length(); i++) {
            if (cadena.getFrase().charAt(i) == letra.charAt(0)) {
                count++;
            }
        }
        System.out.println("El carácter '" + letra + "' se repite " + count + " veces.");
    }

    public void compararLongitud(Cadena cadena, String frase) {
        if (cadena.getLongitud() > frase.length()) {
            System.out.println("La frase ingresada es más corta que la frase almacenada.");
        } else if (cadena.getLongitud() < frase.length()) {
            System.out.println("La frase ingresada es más larga que la frase almacenada.");
        } else {
            System.out.println("La frase ingresada tiene la misma longitud que la frase almacenada.");
        }
    }

    public void unirFrases(Cadena cadena, String frase) {
        System.out.println("La frase resultante es: " + cadena.getFrase() + " " + frase);
    }

    public void reemplazar(Cadena cadena, String letra, String reemplazo) {
        String replaced = cadena.getFrase().replace(letra.charAt(0), reemplazo.charAt(0));
        System.out.println("La frase resultante es: " + replaced);
    }

    public boolean contiene(Cadena cadena, String letra) {
        return cadena.getFrase().contains(letra);
    }

}