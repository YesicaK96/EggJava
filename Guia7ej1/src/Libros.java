
import java.util.Scanner;




public class Libros {



public class Guia7ej1 {

    
  

public class Libro {
    
   public int isbn;
   public String titulo; 
   public String autor;
   public int numero_de_paginas;

    public Libro(int isbn, String titulo, String autor, int numero_de_paginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numero_de_paginas = numero_de_paginas;
    }

    public Libro() {
    }

    public void cargar() {
        System.out.println(" Escriba el isbn :");
        Scanner sc=new Scanner(System.in);
       
        this.isbn =sc.nextInt();
        System.out.println(" Ingrese el titulo : ");
        
        this.titulo =sc.next();
        System.out.println(" ingrese el autor : ");
       
        this.autor = sc.next();
        System.out.println(" Ingrese el numero de paginas : ");
    
        this.numero_de_paginas =sc.nextInt();
        
    }

 public void mostrar() {
        System.out.println("  el isbn es :" + isbn );
        
        System.out.println(" el titulo es : " + titulo);
       
        System.out.println("el autor es : " + autor);
       
        System.out.println(" numero de paginas : " + numero_de_paginas );
     
    }  
    
}

    