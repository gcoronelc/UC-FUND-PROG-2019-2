package pe.uc.billetesapp.prueba;

import pe.uc.billetesapp.service.BilletesService;

public class Prueba02 {

  public static void main(String[] args) {
    // datos
    int importe = 1180;
    // Proceso
    String repo = BilletesService.calcBilletes(importe);
    System.out.println(repo);
  }
}
