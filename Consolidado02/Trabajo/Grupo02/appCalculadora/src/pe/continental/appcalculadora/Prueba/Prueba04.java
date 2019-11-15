
package pe.continental.appcalculadora.Prueba;
import pe.continental.appcalculadora.Service.AppCalculadoraService;
public class Prueba04 {
    public static void main(String[] args) {
        int num = 4;
        boolean primo;
        primo = AppCalculadoraService.CalcularPrimo(num);
        if(primo){
        System.out.println("El numero es primo");
      }   else{
        System.out.println("El numero no es primo");
       }
}
}
