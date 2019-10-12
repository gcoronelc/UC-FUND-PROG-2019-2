
package pe.continental.renta.Prueba;
import pe.continental.renta.Service.RentaAnualService;  

public class prueba02 {
     public static void main(String[] args) {
        int ingreso = 40000;
        double tasa = RentaAnualService.calcularTasa(ingreso);
        double renta = RentaAnualService.calcularRenta(ingreso);
        double ingresoNeto = RentaAnualService.calcularIngresoNeto(ingreso);
        
        System.out.println("Tasa de impuesto: " + tasa);
        System.out.println("Ingreso anual: " + ingreso);
        System.out.println("renta anual a pagar: " + renta);
        System.out.println("Ingreso Neto: " + ingresoNeto);
       
}
}