package pe.uc.numerosprimos.prueba;

import pe.uc.numerosprimos.service.primosService;

public class Prueba01 {
    public static void main(String[] args) {
        int numero = 1;
        boolean primo;
        primo = primosService.CalcPrimo(numero);
        if(primo){
        System.out.println("El numero es primo");
      }   else{
        System.out.println("El numero no es primo");
       }
}
}

