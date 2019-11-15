
package pe.continental.appcalculadora.Prueba;
import pe.continental.appcalculadora.Service.AppCalculadoraService;

public class Prueba01 {
    public static void main(String[] args) {
        int n1 = 15;
        int n2 = 20;       
        int mcd= AppCalculadoraService.CalcularMcd(n1, n2);
        int mcm= AppCalculadoraService.CalcularMcm(n1, n2);
        System.out.println("El MCD es: "+ mcd);
        System.out.println("El MCM es: "+ mcm);
        
    }
}
