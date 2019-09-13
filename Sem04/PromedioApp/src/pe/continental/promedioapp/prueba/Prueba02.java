
package pe.continental.promedioapp.prueba;

import pe.continental.promedioapp.service.PromedioService;

public class Prueba02 {
  
  public static void main(String[] args) {
     //variable
    int n1, n2, n3, n4, promedio;
    String estado;
    //Datos
    n1 = 01;
    n2 = 10;
    n3 = 17;
    n4 = 10;
    //proceso
    promedio = PromedioService.getPromedio(n1, n2, n3, n4);
    estado= PromedioService.getEstado(promedio);
    //reporte
    System.out.println("promedio: " + promedio);
    System.out.println("estado: " + estado);
  }
  
}
