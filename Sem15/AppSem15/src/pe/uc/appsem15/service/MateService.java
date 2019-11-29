package pe.uc.appsem15.service;

public class MateService {
  
  // Aplicando recursividad
  public static long factorial(long n){
    if(n == 1 || n == 0){
      return 1;
    } else {
      return n * factorial(n-1);
    }
  }
  
  
}
