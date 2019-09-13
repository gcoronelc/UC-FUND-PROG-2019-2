package pe.continental.promedioapp.prueba;

import pe.continental.promedioapp.service.PromedioService;

public class Prueba01 {

  public static void main(String[] args) {
    //variable
    int n1, n2, n3, n4, menor;
    //Datos
    n1 = 15;
    n2 = 18;
    n3 = 13;
    n4 = 05;
    //proceso
    menor = PromedioService.getMenor(n1, n2, n3, n4);
    //reporte
    System.out.println("menor: " + menor);
  }
   
}
