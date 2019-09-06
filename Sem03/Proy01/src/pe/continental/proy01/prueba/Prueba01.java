package pe.continental.proy01.prueba;

import pe.continental.proy01.service.AreaService;

public class Prueba01 {

  public static void main(String[] args) {
    
    // Datos
    int base = 5;
    int altura = 7;
    
    // Proceso
    double area = AreaService.areaTriangulo(base, altura);
    
    // Reporte
    System.out.println("Area es: " + area);
    
  }

  
}
