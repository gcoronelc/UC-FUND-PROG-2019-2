package pe.uc.hablabien.prueba;

import pe.uc.hablabien.service.PagoService;

public class Prueba06 {
 
  public static void main(String[] args) {
    //Variables
    int tramo, rango;
    //Datos
    tramo = 5;
    //Proceso
    rango = PagoService.calcRangoTramo(tramo);
    //Reporte
    System.out.println("tramo: " + tramo);
    System.out.println("rango: " + rango);
    
  }
}
