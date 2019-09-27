package pe.continental.practicaconsolidado.prueba;

import pe.continental.practicaconsolidado.service.ProgService;

public class Prueba01 {

  public static void main(String[] args) {
    //Variable
    int idCat;
    String nombre, descripcion;
    int participantes;
    double importe, impuesto, comision, precio, total;

    //Inicialización de variables;
    idCat = 2;
    participantes = 20;
    descripcion = "CUALQUIER COSA";
    
    //Procesos
    nombre = ProgService.getCategoría(idCat);
    precio = ProgService.getPrecio(idCat);
    total = ProgService.getTotal(idCat, participantes);
    importe = ProgService.getImporte(idCat, participantes);
    impuesto = ProgService.getImpuesto(idCat, participantes);
    comision = ProgService.getComision(idCat, participantes);
    //descripcion = ProgService.getDescripcion(idCat);
    //Reporte
    System.out.println("IdCat: " + idCat);
    System.out.println("Nombre: " + nombre);
    System.out.println("Descripción: " + descripcion);
    System.out.println("Participantes: " + participantes);
    System.out.println("Precio: " + precio);
    System.out.println("Total: " + total);
    System.out.println("Importe: " + importe);
    System.out.println("Impuesto: " + impuesto);
    System.out.println("Comisión: " + comision);
  }
}
