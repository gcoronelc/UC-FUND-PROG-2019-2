package pe.uc.appsem15.prueba;

import pe.uc.appsem15.service.MateService;

public class Prueba01 {
  
  public static void main(String[] args) {
    // Dato
    long n = 6;
    // Proceso
    long fact = MateService.factorial(n);
    // Reporte
    System.out.println("Número: " + n);
    System.out.println("Factorial: " + fact);
  }
  
  
}
