package pe.uc.proyectos.service;

public class McmymcdService {
 public static int Calcmcd(int a, int b) {
        if (a % b == 0) {
            return b;
        } else {
            return Calcmcd(b, a % b);
        }

    }

    public static int Calcmcm(int a, int b) {
        //Datos
        int mcm;
        //Procesos
        mcm = (a * b) / Calcmcd(a, b);
        //Reporte
        return mcm;
    }
}
   
