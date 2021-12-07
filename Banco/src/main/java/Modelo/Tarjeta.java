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
public class Tarjeta {
    private String numero;
    private String nombre;
    private int cvv;
    private String clave;
    private Cuenta[] cuentas;
   

    public Tarjeta(String numero, String nombre, int cvv ) {
        this.numero = numero;
        this.nombre = nombre;
        this.cvv = cvv;
        
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Cuenta[] getCuentas() {
        return cuentas;
    }

    public void setCuentas(Cuenta[] cuentas) {
        this.cuentas = cuentas;
    }

    
    public boolean validar(String clave){
        if(clave.equals(this.clave)){
               return true;
        }
        return false;
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
        return "Tarjeta{" + "numero=" + numero + ", nombre=" + nombre + ", cvv=" + cvv + '}';
    }

   
    
}
