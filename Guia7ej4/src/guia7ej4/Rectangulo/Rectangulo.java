
package guia7ej4.Rectangulo;


    public class Rectangulo {
    private double base;
    private double altura;
    
    // Constructor con parámetros
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    // Constructor sin parámetros
    public Rectangulo() {
        this.base = 0;
        this.altura = 0;
    }
    
    
    public double getBase() {
        return base;
    }
    
    public void setBase(double base) {
        this.base = base;
    }
    
    public double getAltura() {
        return altura;
    }
    
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    // Método para crear el rectángulo con los datos del usuario
    public void crearRectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    // Método para calcular la superficie del rectángulo
    public double calcularSuperficie() {
        return base * altura;
    }
    
    // Método para calcular el perímetro del rectángulo
    public double calcularPerimetro() {
        return (base + altura) * 2;
    }
    
    // Método para dibujar el rectángulo con asteriscos
    public void dibujarRectangulo() {
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
