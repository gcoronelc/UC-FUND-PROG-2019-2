package pe.uc.hablabien.prueba;

import pe.uc.hablabien.service.PagoService;

public class Prueba08 {
 
  public static void main(String[] args) {
    //Variables
    int tramo;
    double porcentaje;
    //Datos
    tramo = 1;
    //Proceso
    porcentaje = PagoService.calcPorcentajeDonacion(tramo);
    //Reporte
    System.out.println("tramo: " + tramo);
    System.out.println("Porcentaje: " + porcentaje);
    
  }
}
