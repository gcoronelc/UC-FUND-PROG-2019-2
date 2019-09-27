package pe.continental.proy01.Service;

public class ComisionService {

    public static String getNombreCategoria(int idCat) {
        String nombre = "no existe";
        if (idCat == 1) {
            nombre = "programacion";
        }
        if (idCat == 2) {
            nombre = "ofimatica";
        }
        if (idCat == 3) {
            nombre = "administracion";
        }
        if (idCat == 4) {
            nombre = "otros";
        }
        return nombre;
    }

    public static double getPrecio(int idCat) {
        double precio = 0.0;
        if (idCat == 1) {
            precio = 800;
        }
        if (idCat == 2) {
            precio = 500;
        }
        if (idCat == 3) {
            precio = 1800;
        }
        if (idCat == 4) {
            precio = 1000;
        }
        return precio;
    }

    public static double getTotal(int idCat, int participantes) {
        double total;
        total = getPrecio(idCat) * participantes;
        return total;
    }

    public static double getImporte(int idCat, int participantes) {
        double importe;
        importe = getTotal(idCat, participantes) / 1.18;
        return importe;
    }

    public static double getImpuesto(int idCat, int participantes) {
        double impuesto;
        impuesto = getTotal(idCat, participantes) - getImporte(idCat, participantes);
        return impuesto;
    }

    public static double getComision(int idCat, int participantes) {
        double comision, importe, porcentaje;
        importe = getImporte(idCat, participantes);
        comision = 0.0;

        if (idCat == 1 && participantes < 12) {
            comision = 5;
        }
        if (idCat == 1 && participantes >= 12) {
            comision = 7;
        }
        if (idCat == 2 && participantes < 12) {
            comision = 3;
        }
        if (idCat == 2 && participantes >= 12) {
            comision = 5;
        }
        if (idCat == 3 && participantes < 12) {
            comision = 8;
        }
        if (idCat == 3 && participantes >= 12) {
            comision = 10;
        }
        if (idCat == 4 && participantes < 12) {
            comision = 4;
        }
        if (idCat == 4 && participantes >= 12) {
            comision = 6;
        }

        comision = importe * comision / 100;
        return comision;
    }

    public static String getDescripciondelcurso(int idCat) {
        String descripciondelcurso = "no existe";
        if (idCat == 1) {
            descripciondelcurso = "Desarrollo de Aplicaciones con Spring Framework";
        }
        if (idCat == 2) {
            descripciondelcurso = "Aplicación de la informática a las técnicas y trabajos de oficina.";
        }
        if (idCat == 3) {
            descripciondelcurso = "Acción de administrar (gobernar, organizar una economía).";
        }
        if (idCat == 4) {
            descripciondelcurso = "otros";
        }
        return descripciondelcurso;
    }
}
