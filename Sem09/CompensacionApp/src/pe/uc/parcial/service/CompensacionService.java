package pe.uc.parcial.service;

public class CompensacionService {

  public static double calcCompensacion(int nota) {
    // Variables
    double compensacion;
    int rango = 0, factor = 0;
    // Validacion
    if (nota < 0 || nota > 20) {
      return 0.0;
    }
    // Proceso
    compensacion = 0.0;
    for (int tramo = 1; tramo <= 4; tramo++) {
      rango = calcRango(tramo);
      factor = calcFactor(tramo);
      if (nota < rango) {
        rango = nota;
        nota = 0;
      } else {
        nota -= rango;
      }
      compensacion += rango * factor;
      if (nota == 0) {
        break;
      }
    }
    //Reporte
    return compensacion;
  }

  public static double calcCompensacion_Old(int nota) {
    // Variables
    double compensacion;
    int rango = 0, factor = 0;
    // Validacion
    if (nota < 0 || nota > 20) {
      return 0.0;
    }
    // Proceso
    compensacion = 0.0;
    for (int tramo = 1; tramo <= 4; tramo++) {
      switch (tramo) {
        case 1:
          rango = 5;
          factor = 50;
          break;
        case 2:
          rango = 7;
          factor = 80;
          break;
        case 3:
          rango = 5;
          factor = 120;
          break;
        case 4:
          rango = 3;
          factor = 150;
          break;
      }
      if (nota < rango) {
        rango = nota;
        nota = 0;
      } else {
        nota -= rango;
      }
      compensacion += rango * factor;
      if (nota == 0) {
        break;
      }
    }
    //Reporte
    return compensacion;
  }

  private static int calcRango(int tramo) {
    int rango = 0;
    switch (tramo) {
      case 1:
        rango = 5;
        break;
      case 2:
        rango = 7;
        break;
      case 3:
        rango = 5;
        break;
      case 4:
        rango = 3;
        break;
    }
    return rango;
  }

  private static int calcFactor(int tramo) {
    int factor = 0;
    switch (tramo) {
      case 1:
        factor = 50;
        break;
      case 2:
        factor = 80;
        break;
      case 3:
        factor = 120;
        break;
      case 4:
        factor = 150;
        break;
    }
    return factor;
  }

}
