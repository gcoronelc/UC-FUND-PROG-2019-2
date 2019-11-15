package pe.uc.mcmymcd.prueba;

import pe.uc.mcmymcd.service.mcdymcmService;

public class Prueba02 {

    public static void main(String[] args) {
        //Datos
        int a = 8;
        int b = 20;
        //Proceso
        int mcm = mcdymcmService.Calcmcm(a, b);
        //Reporte
        System.err.println("MCM: " + mcm);

    }
}
