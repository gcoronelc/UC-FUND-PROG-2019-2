package pe.uc.hablabien.service;

public class PagoService {

  public static double calcImporte(int minutos) {
    // variables
    double importe, costoMinuto = 0.0;
    int rangoTramo = 0;
    // Proceso
    importe = 0;
    for (int tramo = 1; tramo <= 5; tramo++) {
      rangoTramo = calcRangoTramo(tramo);
      costoMinuto = calcCostoMinuto(tramo);
      // Encontrando el rango
      if (tramo == 5) {
        rangoTramo = minutos;
        minutos = 0;
      } else if (minutos < rangoTramo) {
        rangoTramo = minutos;
        minutos = 0;
      } else {
        minutos = minutos - rangoTramo;
      }
      importe = importe + rangoTramo * costoMinuto;
      if (minutos == 0) {
        break;
      }
    }
    // Reporte
    return dosDec(importe);
  }

  public static double calcDonacion(int minutos) {
    // variables
    double donacion, porcentajeDonacion, importeTramo;
    int rangoTramo;
    // Proceso
    donacion = 0.0;
    for (int tramo = 1; tramo <= 5; tramo++) {
      rangoTramo = calcRangoTramo(tramo);
      porcentajeDonacion = calcPorcentajeDonacion(tramo);
      // Encontrando el rango
      if (tramo == 5) {
        rangoTramo = minutos;
        minutos = 0;
      } else if (minutos < rangoTramo) {
        rangoTramo = minutos;
        minutos = 0;
      } else {
        minutos = minutos - rangoTramo;
      }
      // Importe del tramo
      importeTramo = rangoTramo * calcCostoMinuto(tramo);
      // Donación
      donacion = donacion + importeTramo * porcentajeDonacion;
      if (minutos == 0) {
        break;
      }
    }
    // Reporte
    return dosDec(donacion);
  }

  // 2 decimales
  public static double dosDec(double valor) {
    valor *= 100;
    valor = Math.round(valor);
    valor /= 100;
    return valor;
  }

  public static int calcRangoTramo(int tramo) {
    // Variables
    int minutos = 0;
    // Proceso
    switch (tramo) {
      case 1:
        minutos = 50;
        break;
      case 2:
        minutos = 30;
        break;
      case 3:
        minutos = 70;
        break;
      case 4:
        minutos = 150;
        break;
      case 5:
        minutos = 0;
        break;

    }

    // Reporte
    return minutos;
  }

  public static double calcCostoMinuto(int tramo) {
    //variables
    double costoMinuto = 0;
    //Proceso      
    switch (tramo) {
      case 1:
        costoMinuto = 1.30;
        break;
      case 2:
        costoMinuto = 1.20;
        break;
      case 3:
        costoMinuto = 1.10;
        break;
      case 4:
        costoMinuto = 1.00;
        break;
      case 5:
        costoMinuto = 0.70;
        break;
    }
    //Reporte
    return costoMinuto;

  }

  public static double calcPorcentajeDonacion(int tramo) {
    //Variable
    double porcentaje = 0;
    //Proceso
    switch (tramo) {
      case 1:
        porcentaje = 0.018;
        break;
      case 2:
        porcentaje = 0.02;
        break;
      case 3:
        porcentaje = 0.025;
        break;
      case 4:
        porcentaje = 0.03;
        break;
      case 5:
        porcentaje = 0.4;
        break;

    }
    //Reporte
    return porcentaje;

  }

}
