package pe.continental.proy01.Prueba;

import pe.continental.proy01.Service.ComisionService;

public class Prueba01 {

  public static void main(String[] args) {
    //Variables
    int idCat;
    String nombre;
    //Inicializacion de variables
    idCat = 2;
    //Proceso 
    nombre = ComisionService.getNombreCategoria(idCat);
    //Reporte 
    System.out.println("idCat: " + idCat);
    System.out.println("nombre: " + nombre);
  }
}
