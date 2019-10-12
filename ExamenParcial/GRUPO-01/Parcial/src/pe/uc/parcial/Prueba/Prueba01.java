package pe.uc.parcial.Prueba;

import pe.uc.parcial.service.ChequeService;

public class Prueba01 {
    
     public static void main(String[] args) {
        //Datos 
        int puntaje = 20;
        //Proceso
        double nota = ChequeService.calcNota(puntaje);
        //Reporte
        System.out.println("nota: " + nota);
    }
    
}