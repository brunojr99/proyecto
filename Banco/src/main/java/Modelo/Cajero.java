/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author USER
 */
public class Cajero {
    private String nombre;
    private String direccion;

    public Cajero(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public boolean depositar(Tarjeta tarjeta,Cuenta cuenta,float monto){
        boolean temporal = tarjeta.depositar(monto, cuenta);
        return temporal;
    }
    public boolean retirar(Tarjeta tarjeta,Cuenta cuenta,float monto){
        boolean temporal = tarjeta.retirar(monto, cuenta);
        return temporal;
    }
    public boolean transferir(Tarjeta tarjeta,Cuenta cuenta,float monto){
        boolean temporal = tarjeta.transferir(monto, cuenta);
        return temporal;
    }
    public boolean validarTarjeta(String RUCBanco,String numTarjeta,String documento,String clave){
        
        return true;
    }

    @Override
    public String toString() {
        return "Cajero{" + "nombre=" + nombre + ", direccion=" + direccion + '}';
    }
    
}
