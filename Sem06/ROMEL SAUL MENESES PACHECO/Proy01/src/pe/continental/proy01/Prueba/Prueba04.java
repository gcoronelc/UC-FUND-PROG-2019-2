
package pe.continental.proy01.Prueba;

import pe.continental.proy01.Service.ComisionService;

public class Prueba04 {
    public static void main(String[] args) {
          //Variables
        int idCat ;
        int participantes ;
        double impuesto ;
        //Inicializacion de variables
        idCat = 1;
        participantes = 15 ;
        //Proceso 
        impuesto = ComisionService.getImpuesto(idCat, participantes);
        //Reporte 
        System.out.println("idCat: " + idCat);
        System.out.println("participantes: " + participantes);
        System.out.println("impuesto: " + impuesto);
    }
}
