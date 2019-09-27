package pe.uc.billetesapp.service;

public class BilletesService {
  
  
  public static String calcBilletes(int importe){
    // Variables
    String repo = "", tipo = "";
    int valorBillete = 0, cantidad = 0;
    // Proceso
    for (int i = 1; i <= 8; i++) {
      // Determinar tipo y valor del billete o moneda
      switch(i){
        case 1:
          tipo = "BILLETE(S) de 200: ";
          valorBillete = 200;
          break;
        case 2:
          tipo = "BILLETE(S) de 100: ";
          valorBillete = 100;
          break;
        case 3:
          tipo = "BILLETE(S) de 50: ";
          valorBillete = 50;
          break;
        case 4:
          tipo = "BILLETE(S) de 20: ";
          valorBillete = 20;
          break;
        case 5:
          tipo = "BILLETE(S) de 10: ";
          valorBillete = 10;
          break;
      }
      // Calculo
      cantidad = importe / valorBillete;
      // Nuevo importe
      importe = importe % valorBillete;
      // Agregar fila al reporte
      repo += tipo + cantidad + "\n";
    }
    // Reporte
    return repo;
  }
  
  
}
