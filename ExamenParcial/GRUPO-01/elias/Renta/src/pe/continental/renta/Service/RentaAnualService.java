/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.continental.renta.Service;


public class RentaAnualService {
     public static double calcularTasa(int ingreso){
        double tasa = 0.0;
        int uit = 4150;
        if (ingreso <= 5*uit){   // para ingresos menores a 20,750 soles 
            tasa = 0.08;
        }else if(ingreso <= 20*uit){ //para ingresos entre 20,7500 a 830,000 soles
            tasa = 0.14;
            }else if(ingreso <= 35*uit){ //para ingresos entre 830,000 a 145,250 soles
             tasa = 0.17;   
            }else if(ingreso <= 45*uit){ //para ingresos entre 145,250 a 186,750 soles
             tasa = 0.2;
            }else{ //para ingresos mayores a 186,750 soles
             tasa = 0.3;   
        }       
        return tasa;        
    }
    
    public static double calcularRenta(int ingreso){
        double renta = 0.0;
        renta = ingreso*calcularTasa(ingreso);
        
       return truncar2Dec(renta);
    }
    
    public static double calcularIngresoNeto (int ingreso){
        double ingresoNeto = 0.0;
        
        ingresoNeto = ingreso - calcularRenta(ingreso); 
        
        
        return truncar2Dec(ingresoNeto);
    }
   public static double truncar2Dec (double dato){
       dato = dato*100;
       dato = Math.round(dato)*1.0;
       dato = dato/100.0;
       
       return dato;
   }
    
}
