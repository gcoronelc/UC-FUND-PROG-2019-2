package pe.uc.proyectos.prueba;

import pe.uc.proyectos.service.FactorialService;

public class Prueba03 {
 
    public static void main(String[] args) {
        //Datos
        int numero = 5;
        //Procesos
        int factorial = FactorialService.Calcfactorial(numero);
        //Reporte
        System.err.println("Factorial: " + factorial);

    }
}
    
