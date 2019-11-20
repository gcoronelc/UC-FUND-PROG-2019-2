package pe.uc.proyectos.service;

public class PrimoService {
    public static boolean CalcPrimo(int numero){
    boolean prim = true;
    int divisor = 2;
    while ((prim)&&(divisor !=numero)){
        if (numero%divisor == 0){
            prim = false;
        }else{
            divisor++;
        }
    }
    return prim;
}

}
