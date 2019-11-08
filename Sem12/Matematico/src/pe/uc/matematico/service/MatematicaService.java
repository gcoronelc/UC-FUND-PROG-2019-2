package pe.uc.matematico.service;

public class MatematicaService {
 
  
  public static double calcSemiPerimetro(int a, int b, int c) {
    //Variable
    int semiPerimetro;
    //Proceso
    semiPerimetro = (a + b + c) / 2;
    //Reporte
    return semiPerimetro;
  }

  public static double calcAreaTriangular(int a, int b, int c) {
    //Variable
    double areaTriangular, semiPerimetro;
    //Proceso
    semiPerimetro = calcSemiPerimetro(a, b, c);
    areaTriangular = Math.sqrt(semiPerimetro * (semiPerimetro - a)
            * (semiPerimetro - b) * (semiPerimetro - c));
    //Reporte
    return areaTriangular;
  }

  public static double calcAreaTriangular(int base, int altura) {
    //Variable
    double areaTriangular;
    //Proceso
    areaTriangular = (base * altura) / 2;
    //Reporte
    return areaTriangular;
  }
  
  
}
