package pe.uc.appsem15.service;

import pe.uc.appsem15.dto.PagoDto;

public class VentaService {

  public static PagoDto procesarVenta(PagoDto dto) {
    // Variables
    double importe, impuesto, total;
    // Proceso
    total = dto.getPrecio() * dto.getCantidad();
    importe = total / 1.18;
    impuesto = total - importe;
    // Reporte
    dto.setImporte(dosDec(importe));
    dto.setImpuesto(dosDec(impuesto));
    dto.setTotal(dosDec(total));
    return dto;
  }

  // 2 decimales
  public static double dosDec(double valor) {
    valor *= 100;
    valor = Math.round(valor);
    valor /= 100;
    return valor;
  }
  
}
