package edu.ejercicios;

import edu.ejercicios.Padre.Empleado;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
  Empleado em= new Empleado();

  em.setNombre("Garrido");
  em.setSueldo(3500.0);
  System.out.println(em.obntenerDetalles());
  //System.out.println("nombre"+em.getNombre()+"Sueldo"+ em.getSueldo());
  //System.out.println(em.toString());



    }
}