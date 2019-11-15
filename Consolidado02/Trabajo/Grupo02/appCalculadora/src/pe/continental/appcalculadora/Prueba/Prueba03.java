
package pe.continental.appcalculadora.Prueba;
import pe.continental.appcalculadora.Service.AppCalculadoraService;

public class Prueba03 {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        int c = -16;
        double det = AppCalculadoraService.calcularDet(a, b, c);
        double x1 = AppCalculadoraService.CalcularRaicesX1(a, b, c);
        double x2 = AppCalculadoraService.CalcularRaicesX2(a, b, c);
        System.out.println("El determinante es: "+ det);
        System.out.println("La raiz mayor es: "+ x1);
        System.out.println("La raiz menor es: "+ x2);
       
        
        
    }
}
