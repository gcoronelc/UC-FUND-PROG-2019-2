package pe.uc.ecuacion2ndogrado.prueba;

import pe.uc.ecuacion2ndogrado.service.ecuacionService;

public class Prueba01 {

    public static void main(String[] args) {
        int a = 1;
        int b = 16;
        int c = -16;
        double det = ecuacionService.calcularDet(a, b, c);
        double x1 = ecuacionService.CalcularRaicesX1(a, b, c);
        double x2 = ecuacionService.CalcularRaicesX2(a, b, c);
        System.out.println("El determinante es: "+ det);
        System.out.println("La raiz mayor es: "+ x1);
        System.out.println("La raiz menor es: "+ x2);
       
        
        
    }
}
