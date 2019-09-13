package pe.continental.pagoprin.prueba;

import pe.continental.pagoprin.service.utilidad;

public class prueba1 {
    public static void main(String[] args){
    //Datos
    double pagoxhora =120.0;
    int canthorastrabajadas = 6;
    int cantdiastrabajados = 28; 
    int hijosmenores =3; 
    //Proceso 
    double sueldo = utilidad.CalcSueldo(canthorastrabajadas, cantdiastrabajados, pagoxhora);
    double asignacion = utilidad.calcAsignacion(hijosmenores);
    double bono = utilidad.calcBono(canthorastrabajadas, cantdiastrabajados, pagoxhora);
    double ingresos = utilidad.calcIngresos(canthorastrabajadas, cantdiastrabajados, pagoxhora, hijosmenores);
    double neto = utilidad.calcNeto(canthorastrabajadas, cantdiastrabajados, pagoxhora, hijosmenores);
    double renta = utilidad.calcRenta(canthorastrabajadas, cantdiastrabajados, pagoxhora, hijosmenores);
    //Reporte
    
    
    System.out.println("sueldo: " + sueldo);
    System.out.println("Asignacion: " + asignacion);
    System.out.println("Bono: " + bono);
    System.out.println("Ingresos: " + ingresos);
    System.out.println("Neto: " + neto);
    System.out.println("Renta: " + renta);
    }
    
}
