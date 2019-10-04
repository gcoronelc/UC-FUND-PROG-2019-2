package pe.uc.hablabien.service;

public class PagoService {

  public static double calcImporte(int minutos) {
    // variables
    double importe;
    int min_proc;
    // Proceso
    importe = 0;
    for (int tramo = 1; tramo <= 5; tramo++) {
      switch (tramo) {
        case 1: // Tramo 1
          min_proc = 50;
          if (minutos < min_proc) {
            min_proc = minutos;
            minutos = 0;
          } else {
            minutos = minutos - min_proc;
          }
          importe = importe + min_proc * 1.30;
        case 2: // Tramo 2
          min_proc = 30;
          if (minutos < min_proc) {
            min_proc = minutos;
            minutos = 0;
          } else {
            minutos = minutos - min_proc;
          }
          importe = importe + min_proc * 1.20;
        case 3: // Tramo 3
          min_proc = 70;
          if (minutos < min_proc) {
            min_proc = minutos;
            minutos = 0;
          } else {
            minutos = minutos - min_proc;
          }
          importe = importe + min_proc * 1.10;
        case 4: // Tramo 4
          min_proc = 150;
          if (minutos < min_proc) {
            min_proc = minutos;
            minutos = 0;
          } else {
            minutos = minutos - min_proc;
          }
          importe = importe + min_proc * 1.00;
        case 5: // Tramo 5
          min_proc = minutos;
          importe = importe + min_proc * 0.70;
      }
      if(minutos == 0){
        break;
      }
    }
    // Reporte
    return dosDec( importe );
  }
  
  public static double calcDonacion(int minutos) {
    // variables
    double importe;
    int min_proc;
    // Proceso
    importe = 0;
    for (int tramo = 1; tramo <= 5; tramo++) {
      switch (tramo) {
        case 1: // Tramo 1
          min_proc = 50;
          if (minutos < min_proc) {
            min_proc = minutos;
            minutos = 0;
          } else {
            minutos = minutos - min_proc;
          }
          importe = importe + min_proc * 1.30 * 0.018;
        case 2: // Tramo 2
          min_proc = 30;
          if (minutos < min_proc) {
            min_proc = minutos;
            minutos = 0;
          } else {
            minutos = minutos - min_proc;
          }
          importe = importe + min_proc * 1.20 * 0.02;
        case 3: // Tramo 3
          min_proc = 70;
          if (minutos < min_proc) {
            min_proc = minutos;
            minutos = 0;
          } else {
            minutos = minutos - min_proc;
          }
          importe = importe + min_proc * 1.10 * 0.025;
        case 4: // Tramo 4
          min_proc = 150;
          if (minutos < min_proc) {
            min_proc = minutos;
            minutos = 0;
          } else {
            minutos = minutos - min_proc;
          }
          importe = importe + min_proc * 1.00 * 0.03;
        case 5: // Tramo 5
          min_proc = minutos;
          importe = importe + min_proc * 0.70 * 0.04;
      }
      if(minutos == 0){
        break;
      }
    }
    // Reporte
    return dosDec(importe);
  }

  
  // 2 decimales
  public static double dosDec( double valor ){
    valor *= 100;
    valor = Math.round(valor);
    valor /= 100;
    return valor;
  }
  
}
