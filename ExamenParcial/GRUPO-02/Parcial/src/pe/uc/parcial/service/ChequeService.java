package pe.uc.parcial.service;

public class ChequeService {

    public static double calcNota(int puntaje) {
        //Variables
        double nota;
        int punt_proc;
        //Proceso
        nota = 0;
        for (int tramo = 1; tramo <= 5; tramo++) {
            switch (tramo) {
                case 1:
                    punt_proc = 5;
                    if (puntaje < punt_proc) {
                        punt_proc = puntaje;
                        puntaje = 0;
                    } else {
                        puntaje = puntaje - punt_proc;
                    }
                    nota = nota + punt_proc * 50;
                case 2:
                    punt_proc = 7;
                    if (puntaje < punt_proc) {
                        punt_proc = puntaje;
                        puntaje = 0;
                    } else {
                        puntaje = puntaje - punt_proc;
                    }
                    nota = (nota + punt_proc * 80);
                case 3:
                    punt_proc = 5;
                    if (puntaje < punt_proc) {
                        punt_proc = puntaje;
                        puntaje = 0;
                    } else {
                        puntaje = puntaje - punt_proc;
                    }
                    nota = (nota + punt_proc * 120);
                case 4:
                    punt_proc = 3;
                    if (puntaje < punt_proc) {
                        punt_proc = puntaje;
                        puntaje = 0;
                    } else {
                        puntaje = puntaje - punt_proc;
                    }
                    nota = (nota + punt_proc * 150);
                case 5:
                    punt_proc = 1000;
                    if (puntaje < punt_proc) {
                        punt_proc = puntaje;
                        puntaje = 0;
                    } else {
                        puntaje = puntaje - punt_proc;
                    }
                    nota = (nota + punt_proc * 0);
            }
            if (puntaje == 0) {
                break;
            }
        }
        //Reporte
        return nota;
    }
}