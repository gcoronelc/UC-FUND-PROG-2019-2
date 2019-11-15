package pe.uc.factorial.prueba;

import pe.uc.factorial.service.factorialService;

public class Prueba01 {

    public static void main(String[] args) {
        //Datos
        int numero = 6;
        //Procesos
        int factorial = factorialService.Calcfactorial(numero);
        //Reporte
        System.err.println("Factorial: " + factorial);

    }
}
