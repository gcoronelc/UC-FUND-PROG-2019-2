package pe.uc.proyectos.prueba;

import pe.uc.proyectos.service.McmymcdService;

public class Prueba02 {
         public static void main(String[] args) {
        //Datos
        int a = 24;
        int b = 12;
        //Proceso
        int mcm = McmymcdService.Calcmcm(a, b);
        //Reporte
        System.err.println("MCM: " + mcm);

    }
}
    
