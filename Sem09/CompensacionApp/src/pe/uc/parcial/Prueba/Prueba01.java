package pe.uc.parcial.Prueba;

import pe.uc.parcial.service.CompensacionService;

public class Prueba01 {

  public static void main(String[] args) {
    
    // Datos 
    int nota = 13;
    
    // Proceso
    double compensacion = CompensacionService.calcCompensacion(nota);
    
    // Reporte
    System.out.println("Compensacion: " + compensacion);
    
  }

}
