package pe.uc.proyectos.prueba;

import pe.uc.proyectos.service.McmymcdService;

public class Prueba01 {
    public static void main(String[] args) {
        //Datos
        int a = 15;
        int b = 3;
        //Procesos
        int mcd = McmymcdService.Calcmcd(a, b);
        //Reporte
        System.err.println("MCD: " + mcd);

    }
}
