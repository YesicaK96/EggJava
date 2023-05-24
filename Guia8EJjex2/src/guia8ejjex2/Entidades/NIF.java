
package guia8ejjex2.Entidades;

public class NIF {
    private long dni;
    private char letra;

    public NIF() {
    }

    public NIF(long dni, char letra) {
        this.dni = dni;
        this.letra = letra;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    @Override
    public String toString() {
        return String.format("%08d-%c", dni, letra);
    }

    public void setNumeroDNI(long numeroDNI) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public long getNumeroDNI() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}