package pe.continental.promedioapp.service;

public class PromedioService {

  public static int getMenor(int n1, int n2, int n3, int n4) {
    //Variable
    int menor = 0;
    //proceso 
    menor = n1;
    if(n2<menor){
      menor=n2; 
    }
    if(n3<menor){
      menor=n3; 
    }
    if(n4<menor){
      menor=n4; 
    }
    //reporte
    return menor;
  }
  
  public static int getPromedio(int n1, int n2, int n3, int n4){
    //Variable
    int menor, promedio;
    //Proceso
    menor= getMenor(n1, n2, n3, n4);
    promedio= (n1 + n2 + n3 + n4 - menor)/3;
    //Reporte
    return promedio;
  }
  
  public static String getEstado(int nota){
    //Variables
    String estado;
    //Proceso
    if(nota>=14){
      estado= "aprobado";
    }else{
      estado= "desaprobado";
    }
    //Reporte
    return estado;
  }
  
  
}
