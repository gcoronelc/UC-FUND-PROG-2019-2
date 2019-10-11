package pe.continental.proyecto1.Prueba;

import pe.continental.proyecto1.Service.PagoService;

public class Prueba01 {

  public static void main(String[] args) {
    //Datos
    double pagoxhora = 1.0;
    int horastrabajadas = 6;
    int diastrabajados = 28;
    int hijos = 3;
    //Proceso
    double HoraTrabajadas = PagoService.calHoraTrabajadas(horastrabajadas, diastrabajados);
    double sueldo = PagoService.calSueldo(horastrabajadas, diastrabajados, pagoxhora);
    double asignacion = PagoService.calAsignacion(hijos);
    double bono = PagoService.calBono(horastrabajadas, diastrabajados, pagoxhora);
    double ingresos = PagoService.calIngresos(horastrabajadas, diastrabajados, pagoxhora, hijos);
    double neto = PagoService.calNeto(horastrabajadas, diastrabajados, pagoxhora, hijos);
    double renta = PagoService.calRenta(horastrabajadas, diastrabajados, pagoxhora, hijos);

    //Reporte
    System.out.println("HorasTrabajadas: " + HoraTrabajadas);
    System.out.println("sueldo: " + sueldo);
    System.out.println("asignacion: " + asignacion);
    System.out.println("bono: " + bono);
    System.out.println("ingresos: " + ingresos);
    System.out.println("renta: " + renta);
    System.out.println("neto: " + neto);

  }

}
