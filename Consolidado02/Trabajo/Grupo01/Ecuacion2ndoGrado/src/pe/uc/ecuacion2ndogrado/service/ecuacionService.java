package pe.uc.ecuacion2ndogrado.service;

public class ecuacionService {

    public static double calcularDet(int a, int b, int c){
 
    double det = 0.0;
    
    det = b*b - (4*a*c);
    return det;
}


public static double CalcularRaicesX1(int a, int b, int c){
 
    double x1 = 0.0;
 
       x1 = ((b*-1) + Math.sqrt(calcularDet(a, b, c)))/(2*a);
       
    
  return x1;  
}
public static double CalcularRaicesX2(int a, int b, int c){
 
    double x2 = 0.0;
    
    x2 =  ((b*-1) - Math.sqrt(calcularDet(a, b, c)))/(2*a);
    return x2;
}
}