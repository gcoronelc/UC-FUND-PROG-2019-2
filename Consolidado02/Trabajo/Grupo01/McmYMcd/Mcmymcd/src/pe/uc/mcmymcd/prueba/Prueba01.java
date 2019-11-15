package pe.uc.mcmymcd.prueba;

import pe.uc.mcmymcd.service.mcdymcmService;

public class Prueba01 {

    public static void main(String[] args) {
        //Datos
        int a = 8;
        int b = 20;
        //Procesos
        int mcd = mcdymcmService.Calcmcd(a, b);
        //Reporte
        System.err.println("MCD: " + mcd);

    }
}