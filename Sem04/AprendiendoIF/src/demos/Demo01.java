package demos;

public class Demo01 {
  
  public static void main(String[] args) {
    
    // Variables
    int n1, n2, n3, n4, mayor;
    
    // Datos
    n1 = 18;
    n2 = 11;
    n3 = 19;
    n4 = 20;
    
    // Proceso
    mayor = n1;
    if( n2 > mayor ){
      mayor = n2;
    }
    if( n3 > mayor ){
      mayor = n3;
    }
    if( n4 > mayor ){
      mayor = n4;
    }
    
    // Reporte
    System.out.println("Mayor: " + mayor);
    
  }
  
}
