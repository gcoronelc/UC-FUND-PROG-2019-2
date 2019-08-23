package pe.continental.apppromedio.service;

public class NotaService {
  
  public static int calcularPromedio (int nota1, int nota2, int nota3){
    // Variables
    int promedio;
    // Proceso
    promedio = (nota1 + nota2 + nota3) / 3;
    // Reporte
    return promedio;  
  }
    
  
}
