package pe.uc.appsem15.prueba;

import pe.uc.appsem15.dto.PagoDto;
import pe.uc.appsem15.service.VentaService;

public class Prueba02 {

  public static void main(String[] args) {
    // Variable
    PagoDto dto = new PagoDto();
    // Datos
    dto.setPrecio(200);
    dto.setCantidad(10);
    // Proceso
    dto = VentaService.procesarVenta(dto);
    // Reporte
    System.out.println("DATOS");
    System.out.println("====================");
    System.out.println("Precio: " + dto.getPrecio());
    System.out.println("Cantidad: " + dto.getCantidad());
    System.out.println("");
    System.out.println("REPORTE");
    System.out.println("====================");
    System.out.println("Importe: " + dto.getImporte());
    System.out.println("Impuesto: " + dto.getImpuesto());
    System.out.println("Total: " + dto.getTotal());
  }

  
}
