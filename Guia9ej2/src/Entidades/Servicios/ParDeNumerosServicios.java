
package Entidades.Servicios;



import entidades.ParDeNumeros;

public class ParDeNumerosServicios {
    private ParDeNumeros par;
    
    public ParDeNumerosServicios() {
        this.par = new ParDeNumeros();
    }
    
    public void mostrarValores() {
        System.out.println("Número 1: " + par.getNumero1());
        System.out.println("Número 2: " + par.getNumero2());
    }
    
    public double devolverMayor() {
        return Math.max(par.getNumero1(), par.getNumero2());
    }
    
    public double calcularPotencia() {
        double mayor = devolverMayor();
        double menor = Math.min(par.getNumero1(), par.getNumero2());
        mayor = Math.round(mayor);
        menor = Math.round(menor);
        return Math.pow(mayor, menor);
    }
    
    public double calcularRaiz() {
        double menor = Math.min(par.getNumero1(), par.getNumero2());
        menor = Math.abs(menor);
        return Math.sqrt(menor);
    }
}
ser
package Entidades.Servicios;



import entidades.ParDeNumeros;

public class ParDeNumerosServicios {
    private ParDeNumeros par;
    
    public ParDeNumerosServicios() {
        this.par = new ParDeNumeros();
    }
    
    public void mostrarValores() {
        System.out.println("Número 1: " + par.getNumero1());
        System.out.println("Número 2: " + par.getNumero2());
    }
    
    public double devolverMayor() {
        return Math.max(par.getNumero1(), par.getNumero2());
    }
    
    public double calcularPotencia() {
        double mayor = devolverMayor();
        double menor = Math.min(par.getNumero1(), par.getNumero2());
        mayor = Math.round(mayor);
        menor = Math.round(menor);
        return Math.pow(mayor, menor);
    }
    
    public double calcularRaiz() {
        double menor = Math.min(par.getNumero1(), par.getNumero2());
        menor = Math.abs(menor);
        return Math.sqrt(menor);
    }
}