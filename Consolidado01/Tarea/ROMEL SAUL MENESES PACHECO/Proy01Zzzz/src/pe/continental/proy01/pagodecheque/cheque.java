package pe.continental.proy01.pagodecheque;

public class cheque {

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
    ingresos = calcBono(canthorastrabajadas, cantdiastrabajados, pagoxhora) + calcAsignacion(hijosmenores) + calcSueldo(cantdiastrabajados, canthorastrabajadas, pagoxhora);
    return ingresos;
  }

  public static double calcNeto(int canthorastrabajadas, int cantdiastrabajados, double pagoxhora, int hijosmenores) {
    double neto;
    neto = calcIngresos(canthorastrabajadas, cantdiastrabajados, pagoxhora, hijosmenores) * 0.92;
    return neto;
  }

  public static double calcRenta(int canthorastrabajadas, int cantdiastrabajados, double pagoxhora, int hijosmenores) {
    double renta;
    renta = calcIngresos(canthorastrabajadas, cantdiastrabajados, pagoxhora, hijosmenores) * 0.80;
    return renta;
  }

  public static double calcHorastrabajadas(int canthorastrabajadas, int cantdiastrabajados) {
    double horastrabajadas;
    horastrabajadas = canthorastrabajadas * cantdiastrabajados;
    return horastrabajadas;
  }

  public static double CalcPagoporhora(double pagoxhora) {
    double pagoporhora;
    pagoporhora = (pagoxhora);
    return pagoporhora;
  }

}
