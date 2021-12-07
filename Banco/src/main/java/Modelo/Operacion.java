/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;


public class Operacion {
    private Date fecha;
    private String monto;

    public Operacion(Date fecha, String monto) {
        this.fecha = fecha;
        this.monto = monto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getMonto() {
        return monto;
    }

    public void setMonto(String monto) {
        this.monto = monto;
    }
    
    public boolean registrar(Date fecha,float monto){
            return true;
        
    }

    @Override
    public String toString() {
        return "Operacion{" + "fecha=" + fecha + ", monto=" + monto + '}';
    }
    
}
