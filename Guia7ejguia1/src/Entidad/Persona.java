package Entidad;

import java.util.Date;

public class Persona {
  
   private String nombre;
   private String numeroID;
   private Date fechaNacimiento;


   public Persona(String nombre, String numeroID, Date fechaNacimiento) {
      this.nombre = nombre;
      this.numeroID = numeroID;
      this.fechaNacimiento = fechaNacimiento;
   }


   public String getNombre() {
      return nombre;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   public String getNumeroID() {
      return numeroID;
   }

   public void setNumeroID(String numeroID) {
      this.numeroID = numeroID;
   }

   public Date getFechaNacimiento() {
      return fechaNacimiento;
   }

   public void setFechaNacimiento(Date fechaNacimiento) {
      this.fechaNacimiento = fechaNacimiento;
   }
}
