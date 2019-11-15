package pe.uc.factorial.service;

public class factorialService {

    public static int Calcfactorial(int numero) {
        int factorial = 1;

        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
