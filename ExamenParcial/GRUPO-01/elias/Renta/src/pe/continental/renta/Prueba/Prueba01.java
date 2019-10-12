
package pe.continental.renta.Prueba;
import pe.continental.renta.Service.RentaAnualService;  
/**
 *
 * @author elias
 */
public class Prueba01 {
    public static void main(String[] args) {
        int ingreso = 2000;
        double tasa = RentaAnualService.calcularTasa(ingreso);
        double renta = RentaAnualService.calcularRenta(ingreso);
        double ingresoNeto = RentaAnualService.calcularIngresoNeto(ingreso);
        
        System.out.println("Tasa de impuesto: " + tasa);
         System.out.println("Ingreso anual: " + ingreso);
        System.out.println("renta anual a pagar: " + renta);
        System.out.println("Ingreso Neto: " + ingresoNeto);
       
    }
    
}
