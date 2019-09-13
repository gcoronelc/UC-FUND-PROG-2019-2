
package pe.continental.diasmes.service;


public class DiasService {
  
  public static int diasMes(int anio, int mes){
    //Variables
    int dias = 0 ;
    //Proceso
    switch(mes){
      case 1:
      case 3:
      case 5:
      case 7:
      case 8:
      case 10:
      case 12:
        dias = 31;
        break;
      case 4:
      case 6:
      case 9:
      case 11:
        dias = 30;
        break;
      case 2:
        if (anio % 4 == 0){
          dias = 29; 
        } else{
          dias = 28;
        }
    }
    //Reporte
    return dias;
  }
  
}
