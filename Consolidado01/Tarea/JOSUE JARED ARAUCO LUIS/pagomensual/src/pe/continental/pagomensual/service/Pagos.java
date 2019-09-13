package pe.continental.pagomensual.service;

public class Pagos {

  public static double calcSueldo(int canthorastrabajadas, int cantdiastrabajados, double pagoxhora) {
    double sueldo;
    sueldo = (canthorastrabajadas * cantdiastrabajados * pagoxhora);
    return sueldo;
  }

  public static double calcAsignacion(int hijosmenores) {
    double asignacion;
    asignacion = (hijosmenores) * 90.0;
    return asignacion;
  }

  public static double calcBono(int canthorastrabajadas, int cantdiastrabajados, double pagoxhora) {
    double bono;
    bono = (calcSueldo(canthorastrabajadas, cantdiastrabajados, pagoxhora) * 0.20);
    return bono;
  }

  public static double calcIngresos(int canthorastrabajadas, int cantdiastrabajados, double pagoxhora, int hijosmenores) {
    double ingresos;
    ingresos = calcBono(canthorastrabajadas, cantdiastrabajados, pagoxhora) + calcAsignacion(hijosmenores) + calcSueldo(canthorastrabajadas, cantdiastrabajados, pagoxhora);
    return ingresos;
  }

  public static double calcNeto(int canthorastrabajadas, int cantdiastrabajados, double pagoxhora, int hijosmenores) {
    double neto;
    neto = calcIngresos(canthorastrabajadas, cantdiastrabajados, pagoxhora, hijosmenores) * 0.08;
    return neto;
  }

  public static double calcRenta(int canthorastrabajadas, int cantdiastrabajados, double pagoxhora, int hijosmenores) {
    double renta;
    renta = calcIngresos(canthorastrabajadas, cantdiastrabajados, pagoxhora, hijosmenores) * 0.92;
    return renta;
  }

  public static int calcHoratrabajo(int canthorastrabajadas, int cantdiastrabajados) {
    int horatrabajo;
    horatrabajo = canthorastrabajadas * cantdiastrabajados;
    return horatrabajo;
  }

  public static double calcPagoporhora(double pagoxhora) {
    double pagoporhora;
    pagoporhora = pagoxhora;
    return pagoporhora;
  }
}
