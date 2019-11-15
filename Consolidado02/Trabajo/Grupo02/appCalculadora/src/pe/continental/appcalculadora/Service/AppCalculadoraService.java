package pe.continental.appcalculadora.Service;

public class AppCalculadoraService {

  public static int CalcularMcd(int n1, int n2) {

    int mcd = 0;
    while (n1 != n2) {
      if (n1 > n2) {
        n1 = n1 - n2;
      } else {
        n2 = n2 - n1;
      }
    }
    mcd = n1;
    return mcd;
  }

  public static int CalcularMcm(int a, int b) {
    int mcm = 0;
    int n1 = a;
    int n2 = b;
    while (n1 != n2) {
      if (n1 > n2) {
        n1 = n1 - n2;
      } else {
        n2 = n2 - n1;
      }

    }
    mcm = (a * b) / n1;

    return mcm;
  }

  public static int CalcularFactorial(int num) {
    if (num < 0) {
      return 0;
    }
    int factorial = 1;

    while (num > 0) {
      factorial *= num;
      num--;
    }
    return factorial;
  }

  public static double calcularDet(int a, int b, int c) {

    double det = 0.0;

    det = b * b - (4 * a * c);
    return det;
  }

  public static double CalcularRaicesX1(int a, int b, int c) {

    double x1 = 0.0;

    x1 = ((b * (-1)) + Math.sqrt(calcularDet(a, b, c))) / (2 * a);

    return x1;
  }

  public static double CalcularRaicesX2(int a, int b, int c) {

    double x2 = 0.0;

    x2 = ((b * (-1)) - Math.sqrt(calcularDet(a, b, c))) / (2 * a);
    return x2;
  }

  public static boolean CalcularPrimo(int num) {
    int cont = 0;
    int divisor = 1;
    while (divisor <= num) {
      if (num % divisor == 0) {
        cont++;
      }
      divisor++;
    }
    return (cont == 2);
  }

}
