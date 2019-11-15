package pe.uc.numerosprimos.service;

public class primosService {

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