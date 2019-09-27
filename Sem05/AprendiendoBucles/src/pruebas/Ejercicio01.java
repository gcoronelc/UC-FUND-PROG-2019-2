/**
 * Tabla de multiplicar de "n".
 */
package pruebas;

public class Ejercicio01 {


  public static void main(String[] args) {
    
    // Variables
    int n, prod, cont;
    String repo;
    // Inicializando variables
    n = 3;
    repo = "";
    // proceso
    cont = 1;
    while( cont <= 12 ){
      prod = n * cont;
      repo += n + " * " + cont + " = " + prod + "\n";
      cont++;
    }
    // reporte
    System.out.println("N = " + n);
    System.out.println("---------------------");
    System.out.println(repo);
    
  } // main
  
  
} // class
