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
    private int indice;

    public Tarjeta(String numero, String nombre, int cvv , int numCuentas) {
        this.numero = numero;
        this.nombre = nombre;
        this.cvv = cvv;
        this.cuentas = new Cuenta[numCuentas]; 
        this.indice = 0;
    }

    public String getNumero() {
        return numero;
    }
    
}
