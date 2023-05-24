/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import Entidades.Empleado;

/**
 *
 * @author a
 */
public class Main {

   
  public static void main(String[] args) {
        Empleado[] empleados = new Empleado[6];
        EmpleadoServicio es = new EmpleadoServicio();

        es.cargarEmpleado( empleados);
        es.empleadosSuperior(empleados);
    }

    private static class EmpleadoServicio {

        public EmpleadoServicio() {
        }
    }
}
