package pe.continental.proy01.prueba;

import pe.continental.proy01.pagodecheque.cheque;

public class prueba01 {

  public static void main(String[] args) {
    //Datos
    double pagoxhora = 120.0;
    int canthorastrabajadas = 6;
    int cantdiastrabajados = 28;
    int hijosmenores = 3;
    //Proceso
    double sueldo = cheque.calcSueldo(canthorastrabajadas, cantdiastrabajados, pagoxhora);
    double asignacion = cheque.calcAsignacion(hijosmenores);
    double bono = cheque.calcBono(canthorastrabajadas, cantdiastrabajados, pagoxhora);
    double ingresos = cheque.calcIngresos(canthorastrabajadas, cantdiastrabajados, pagoxhora, hijosmenores);
    double neto = cheque.calcNeto(canthorastrabajadas, cantdiastrabajados, pagoxhora, hijosmenores);
    double renta = cheque.calcRenta(canthorastrabajadas, cantdiastrabajados, pagoxhora, hijosmenores);
    double horastrabajadas = cheque.calcHorastrabajadas(canthorastrabajadas, cantdiastrabajados);
    double pagoporhora = cheque.CalcPagoporhora(pagoxhora);
    //Reporte
    System.out.println("sueldo:" + sueldo);
    System.out.println("asignacion: " + asignacion);
    System.out.println("bono: " + bono);
    System.out.println("ingresos: " + ingresos);
    System.out.println("renta: " + renta);
    System.out.println("neto: " + neto);
    System.out.println("renta" + renta);
    System.out.println("horastrabajadas" + horastrabajadas);
    System.out.println("pagoporhora" + pagoporhora);

  }

}
