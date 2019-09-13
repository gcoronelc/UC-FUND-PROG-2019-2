
package pe.continental.diasmes.prueba;

import pe.continental.diasmes.service.DiasService;

public class Prueba01 {
  
  public static void main(String[] args) {
    //Variables
    int mes, anio, dias ;
    //Datos
    mes = 2;
    anio = 1965;
    //Proceso
    dias = DiasService.diasMes(anio, mes);
    //Reporte
    System.out.println("dias: " + dias);
            
  }
}
