package pe.uc.proyectos.prueba;

import pe.uc.proyectos.service.Ecuacion2ndogradoService;

public class Prueba05 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 1;
        double det = Ecuacion2ndogradoService.calcularDet(a, b, c);
        double x1 = Ecuacion2ndogradoService.CalcularRaicesX1(a, b, c);
        double x2 = Ecuacion2ndogradoService.CalcularRaicesX2(a, b, c);
        System.out.println("El determinante es: "+ det);
        System.out.println("La raiz mayor es: "+ x1);
        System.out.println("La raiz menor es: "+ x2);
       
        
        
    }
}

   
