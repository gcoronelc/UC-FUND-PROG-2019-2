package pe.continental.ventaapp.service;

public class VentaService {

  public static double calcTotal(double precio, int cant) {
    double total;
    total = precio * cant;
    return total;
  }

  public static double calcImporte(double precio, int cant) {
    double importe;
    importe = calcTotal(precio, cant) / 1.18;
    return importe;
  }

  public static double calcImpuesto(double precio, int cant) {
    double impuesto;
    impuesto = calcTotal(precio, cant) - calcImporte(precio, cant);
    return impuesto;
  }

}
