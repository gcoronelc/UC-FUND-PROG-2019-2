
package pe.continental.proy01.Prueba;

import pe.continental.proy01.Service.ComisionService;

public class Prueba02 {
    public static void main(String[] args) {
        //Variables
        int idCat ;
        double precio ;
        //Inicializacion de variables
        idCat = 1;
        //Proceso 
        precio = ComisionService.getPrecio(idCat);
        //Reporte 
        System.out.println("idCat: " + idCat);
        System.out.println("precio: " + precio);
    }
}
