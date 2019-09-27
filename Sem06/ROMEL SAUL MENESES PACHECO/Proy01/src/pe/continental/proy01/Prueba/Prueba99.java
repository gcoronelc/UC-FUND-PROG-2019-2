package pe.continental.proy01.Prueba;

import pe.continental.proy01.Service.ComisionService;

public class Prueba99 {

    public static void main(String[] args) {
        //Variables
        int idCat;
        int participantes;
        double importe;
        //Inicializacion de variables
        idCat = 2;
        participantes = 20;
        //Proceso 
        importe = ComisionService.getImporte(idCat, participantes);
        //Reporte 
        System.out.println("idCat: " + idCat);
        System.out.println("participantes: " + participantes);
        System.out.println("importe: " + importe);
    }
}
