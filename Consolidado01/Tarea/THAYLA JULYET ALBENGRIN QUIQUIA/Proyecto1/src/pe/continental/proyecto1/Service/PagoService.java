package pe.continental.proyecto1.Service;

public class PagoService {

  public static double calHoraTrabajadas(int horastrabajadas, int diastrabajados) {
    double HoraTrabajadas;
    HoraTrabajadas = (horastrabajadas * diastrabajados);
    return HoraTrabajadas;
  }

  public static double calSueldo(int horastrabajadas, int diastrabajados, double pagoxhora) {
    double sueldo;
    sueldo = (horastrabajadas * diastrabajados * pagoxhora);
    return sueldo;
  }

  public static double calAsignacion(int hijos) {
    double asignacion;
    asignacion = (hijos) * 90.0;
    return asignacion;
  }

  public static double calBono(int horastrabajadas, int diastrabajados, double pagoxhora) {
    double bono;
    bono = (calSueldo(horastrabajadas, diastrabajados, pagoxhora) * 0.20);
    return bono;
  }

  public static double calIngresos(int horastrabajadas, int diastrabajados, double pagoxhora, int hijos) {
    double ingresos;
    ingresos = calBono(horastrabajadas, diastrabajados, pagoxhora) + calAsignacion(hijos) + calSueldo(diastrabajados, horastrabajadas, pagoxhora);
    return ingresos;
  }

  public static double calNeto(int horastrabajadas, int diastrabajados, double pagoxhora, int hijos) {
    double neto;
    neto = calIngresos(horastrabajadas, diastrabajados, pagoxhora, hijos) * 0.92;
    return neto;
  }

  public static double calRenta(int horastrabajadas, int diastrabajados, double pagoxhora, int hijos) {
    double renta;
    renta = calIngresos(horastrabajadas, diastrabajados, pagoxhora, hijos) * 0.08;
    return renta;
  }

}
