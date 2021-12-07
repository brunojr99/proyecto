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
public class Cliente {
    private String nombre;
    private String documento;
    private String direccion;
    private Cuenta[] cuentas;
    public Cliente(String nombre, String documento, String direccion) {
        this.nombre = nombre;
        this.documento = documento;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Cuenta[] getCuentas() {
        return cuentas;
    }

    public void setCuentas(Cuenta[] cuentas) {
        this.cuentas = cuentas;
    }
    public boolean depositar(float monto,Cuenta cuenta){
        boolean temporal = cuenta.depositar(monto);
        return temporal;        
    }
    
    public boolean retirar(float monto,Cuenta cuenta){
        boolean temporal = cuenta.retirar(monto);
        return temporal;        
    }
    public boolean transferir(float monto,Cuenta cuenta){
        boolean temporal = cuenta.transferir(monto);
        return temporal;        
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", documento=" + documento + ", direccion=" + direccion + ", cuentas=" + cuentas + '}';
    }
    
    
}
