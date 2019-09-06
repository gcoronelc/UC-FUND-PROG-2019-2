package pe.continental.apppromedio.prueba;

import pe.continental.apppromedio.service.NotaService;

public class Prueba01 {
  
  
  public static void main(String[] args) {
    
    // Datos
    int nota1 = 18;
    int nota2 = 20;
    int nota3 = 17;
    
    // Proceso
    int promedio = NotaService.calcularPromedio(nota1, nota2, nota3);
    
    // Reporte
    System.out.println("Nota 1: " + nota1);
    System.out.println("Nota 2: " + nota2);
    System.out.println("Nota 3: " + nota3);
    System.out.println("Promedio: " + promedio);
    
  }
  
  
}
