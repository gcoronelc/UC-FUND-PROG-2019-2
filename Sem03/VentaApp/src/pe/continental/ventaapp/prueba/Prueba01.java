package pe.continental.ventaapp.prueba;

import pe.continental.ventaapp.service.VentaService;

public class Prueba01 {

  public static void main(String[] args) {
    // Datos
    double precio = 450.79;
    int cant = 10;
    // Proceso
    double total = VentaService.calcTotal(precio, cant);
    double importe = VentaService.calcImporte(precio, cant);
    double impuesto = VentaService.calcImpuesto(precio, cant);
    // Reporte
    System.out.println("Importe: " + importe);
    System.out.println("Impuesto: " + impuesto);
    System.out.println("Total: " + total);
  }
  
}
