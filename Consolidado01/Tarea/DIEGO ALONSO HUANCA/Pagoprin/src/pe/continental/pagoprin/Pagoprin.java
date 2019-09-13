/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.continental.pagoprin;

import pe.continental.pagoprin.view.contadorView;

/**
 *
 * @author alumno
 */
public class Pagoprin {
    
   public double pagoxhora;
   public int canthorastrabajadas;
   public int cantdiastrabajados; 
   public int hijosmenores; 

    public Pagoprin() {
    }
   
   

    public double getPagoxhora() {
        return pagoxhora;
    }

    public void setPagoxhora(double pagoxhora) {
        this.pagoxhora = pagoxhora;
    }

    public int getCanthorastrabajadas() {
        return canthorastrabajadas;
    }

    public void setCanthorastrabajadas(int canthorastrabajadas) {
        this.canthorastrabajadas = canthorastrabajadas;
    }

    public int getCantdiastrabajados() {
        return cantdiastrabajados;
    }

    public void setCantdiastrabajados(int cantdiastrabajados) {
        this.cantdiastrabajados = cantdiastrabajados;
    }

    public int getHijosmenores() {
        return hijosmenores;
    }

    public void setHijosmenores(int hijosmenores) {
        this.hijosmenores = hijosmenores;
    }

    public Pagoprin(double pagoxhora, int canthorastrabajadas, int cantdiastrabajados, int hijosmenores) {
        this.pagoxhora = pagoxhora;
        this.canthorastrabajadas = canthorastrabajadas;
        this.cantdiastrabajados = cantdiastrabajados;
        this.hijosmenores = hijosmenores;
    }
   
   
   
   /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        contadorView.main(args);
    }
    
}
