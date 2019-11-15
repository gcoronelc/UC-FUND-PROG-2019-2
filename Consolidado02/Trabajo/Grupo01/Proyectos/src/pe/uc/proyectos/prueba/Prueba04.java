package pe.uc.proyectos.prueba;

import pe.uc.proyectos.service.PrimoService;

public class Prueba04 {
    public static void main(String[] args) {
        int numero = 8;
        boolean primo;
        primo = PrimoService.CalcPrimo(numero);
        if(primo){
        System.out.println("El numero es primo");
      }   else{
        System.out.println("El numero es compuesto");
       }
}
}
