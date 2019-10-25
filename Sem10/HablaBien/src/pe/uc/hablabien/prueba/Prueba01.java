package pe.uc.hablabien.prueba;

import pe.uc.hablabien.service.PagoService;

public class Prueba01 {
  
  public static void main(String[] args) {
    // Dato
    int minutos = 40;
    // Proceso
    double donacion = PagoService.calcDonacion(minutos);
    double importe = PagoService.calcImporte(minutos);
    // Reporte
    System.out.println("Importe: " + importe);
    System.out.println("Donacion: " + donacion);
  }
}
