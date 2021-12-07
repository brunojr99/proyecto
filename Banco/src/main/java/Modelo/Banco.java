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
public class Banco {
    private String RUC;
    private String nombre;
    private String direccion;
    private Cuenta[] cuentas;
    private int indice;

    public Banco(String RUC, String nombre, String direccion,int numCuentas) {
        this.RUC = RUC;
        this.nombre = nombre;
        this.direccion = direccion;
        this.cuentas = new Cuenta[numCuentas];
        this.indice = 0;
    }

    public Cuenta[] getCuentas() {
        return this.cuentas;
    }
  
    
    public boolean registrarCliente(){
    
    return false;
    }
    
}
