package pe.uc.hablabien.prueba;

import pe.uc.hablabien.service.PagoService;

public class Prueba07 {
 
  public static void main(String[] args) {
    //Variables
    int tramo;
    double costoMinuto;
    //Datos
    tramo = 3;
    //Proceso
    costoMinuto = PagoService.calcCostoMinuto(tramo);
    //Reporte
    System.out.println("tramo: " + tramo);
    System.out.println("Costo minuto: " + costoMinuto);
    
  }
}
