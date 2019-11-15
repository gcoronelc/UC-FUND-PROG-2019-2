
package pe.continental.appcalculadora.Prueba;
import pe.continental.appcalculadora.Service.AppCalculadoraService;

public class Prueba02 {
    public static void main(String[] args) {
        int num = -10;
        int factorial = AppCalculadoraService.CalcularFactorial(num);
       
         System.out.println("El factorial es: "+ factorial);
    }
}
