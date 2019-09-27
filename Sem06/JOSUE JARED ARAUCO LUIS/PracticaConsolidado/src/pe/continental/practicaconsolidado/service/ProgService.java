package pe.continental.practicaconsolidado.service;

public class ProgService {

  public static String getCategoría(int idCat) {
    String nombre = "no existe";
    if (idCat == 1) {
      nombre = "Programación";
    }
    if (idCat == 2) {
      nombre = "Ofimática";
    }
    if (idCat == 3) {
      nombre = "Administración";
    }
    if (idCat == 4) {
      nombre = "Otros";
    }
    return nombre;
  }

  public static String getDescripcion(int idCat) {
    String descripcion = "no existe";
    if (idCat == 1) {
      descripcion = "Java";
    }
    if (idCat == 2) {
      descripcion = "Java";
    }
    if (idCat == 3) {
      descripcion = "Java";
    }
    if (idCat == 4) {
      descripcion = "Java";
    }
    return descripcion;
  }

  public static double getPrecio(int idCat) {
    double precio = 0.0;
    if (idCat == 1) {
      precio = 800.00;
    }
    if (idCat == 2) {
      precio = 500.00;
    }
    if (idCat == 3) {
      precio = 1800.00;
    }
    if (idCat == 4) {
      precio = 1000.00;
    }
    return precio;
  }

  public static double getTotal(int idCat, int participantes) {
    double total = 0.0;
    if (idCat == 1) {
      total = 800.00 * participantes;
    }
    if (idCat == 2) {
      total = 500.00 * participantes;
    }
    if (idCat == 3) {
      total = 1800.00 * participantes;
    }
    if (idCat == 4) {
      total = 1000.00 * participantes;
    }
    return total;
  }

  public static double getImporte(int idCat, int participantes) {
    double importe = 0.0;
    importe = getTotal(idCat, participantes) / 1.18;
    /*
    if (idCat == 1) {
      importe = (800.00 * participantes) / 1.18;
    }
    if (idCat == 2) {
      importe = (500.00 * participantes) / 1.18;
    }
    if (idCat == 3) {
      importe = (1800.00 * participantes) / 1.18;
    }
    if (idCat == 4) {
      importe = (1000.00 * participantes) / 1.18;
    }*/
    return importe;
  }

  public static double getImpuesto(int idCat, int participantes) {
    double impuesto = 0.0, importe, total;
    total = getTotal(idCat, participantes);
    importe = getImporte(idCat, participantes);
    impuesto = total - importe;
    /*
    if (idCat == 1) {
      impuesto = (800.00 * participantes) - getImporte(idCat, participantes);
    }
    if (idCat == 2) {
      impuesto = (500.00 * participantes) - getImporte(idCat, participantes);
    }
    if (idCat == 3) {
      impuesto = (1800.00 * participantes) - getImporte(idCat, participantes);
    }
    if (idCat == 4) {
      impuesto = (1000.00 * participantes) - getImporte(idCat, participantes);
    }
    */
    return impuesto;
  }

  public static double getPorcComision(int idCat, int participantes){
    double porcComison = 0.0;
    if (idCat == 1) {
      if(participantes > 12){
        porcComison = 0.07;
      } else {
        porcComison = 0.05;
      }
    }
    if (idCat == 2) {
      if(participantes > 12){
        porcComison = 0.05;
      } else {
        porcComison = 0.03;
      }
    }
    if (idCat == 3) {
      if(participantes > 12){
        porcComison = 0.10;
      } else {
        porcComison = 0.08;
      }
    }
    if (idCat == 4) {
      if(participantes > 12){
        porcComison = 0.06;
      } else {
        porcComison = 0.04;
      }
    }
    return porcComison;
  }
  
  public static double getComision(int idCat, int participantes) {
    double comision = 0.0, importe, porcComison;
    importe = getImporte(idCat, participantes);
    porcComison = getPorcComision(idCat, participantes);
    comision = importe * porcComison;
    /*
    if (idCat == 1) {
      comision = (800.00 * participantes) / 1.18 * 0.07;
    }
    if (idCat == 2) {
      comision = (500.00 * participantes) / 1.18 * 0.05;
    }
    if (idCat == 3) {
      comision = (1800.00 * participantes) / 1.18 * 0.1;
    }
    if (idCat == 4) {
      comision = (1000.00 * participantes) / 1.18 * 0.06;
    }
  */
    return comision;
  }
}
