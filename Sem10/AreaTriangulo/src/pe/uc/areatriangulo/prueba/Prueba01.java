package pe.uc.areatriangulo.prueba;

import pe.uc.areatriangulo.service.TrianguloService;

public class Prueba01 {

  public static void main(String[] args) {
    // Variables
    int a, b, c;
    double area1, area2;
    // Datos
    a = 3;
    b = 4;
    c = 5;
    // Proceso
    area1 = TrianguloService.calcAreaTriangular(a, b, c);
    area2 = TrianguloService.calcAreaTriangular(a, b);
    // Reporte
    System.out.println("Area 1: " + area1);
    System.out.println("Area 2: " + area2);
  }

  
}
