package pe.uc.proyectos.service;

public class FactorialService {
    public static int Calcfactorial(int numero) {
        int factorial = 1;

        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        return factorial;
    }
}

    