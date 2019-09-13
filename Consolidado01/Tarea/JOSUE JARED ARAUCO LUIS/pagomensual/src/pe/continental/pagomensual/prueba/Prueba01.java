package pe.continental.pagomensual.prueba;

import pe.continental.pagomensual.service.Pagos;

public class Prueba01 {

  public static void main(String[] args) {
    //Datos
    double pagoxhora = 120.0;
    int canthorastrabajadas = 6;
    int cantdiastrabajados = 28;
    int hijosmenores = 3;
    //Proceso
    int horatrabajo = Pagos.calcHoratrabajo(canthorastrabajadas, cantdiastrabajados);
    double pagoporhora = Pagos.calcPagoporhora(pagoxhora);
    double sueldo = Pagos.calcSueldo(canthorastrabajadas, cantdiastrabajados, pagoxhora);
    double asignacion = Pagos.calcAsignacion(hijosmenores);
    double bono = Pagos.calcBono(canthorastrabajadas, cantdiastrabajados, pagoxhora);
    double ingresos = Pagos.calcIngresos(canthorastrabajadas, cantdiastrabajados, pagoxhora, hijosmenores);
    double neto = Pagos.calcNeto(canthorastrabajadas, cantdiastrabajados, pagoxhora, hijosmenores);
    double renta = Pagos.calcRenta(canthorastrabajadas, cantdiastrabajados, pagoxhora, hijosmenores);
    //Report
    System.out.println("Pagoporhora: " + pagoporhora);
    System.out.println("Horatrabajo: " + horatrabajo);
    System.out.println("Sueldo: " + sueldo);
    System.out.println("Asignacion: " + asignacion);
    System.out.println("Bono: " + bono);
    System.out.println("Ingresos: " + ingresos);
    System.out.println("Neto: " + neto);
    System.out.println("Renta: " + renta);
  }
}
