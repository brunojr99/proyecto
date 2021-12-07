
package Modelo;

import java.util.Date;

/**
 *
 * @author USER
 */
public class Cuenta {
    private String numero;
    private float saldo;
    private Date fechaApertura;
    private Cliente cliente;
    private Tarjeta tarjeta;

    public Cuenta(String numero, Date fechaApertura,float saldo) {
        this.numero = numero;
        this.fechaApertura = fechaApertura;
        this.saldo = saldo;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public Date getFechaApertura() {
        return fechaApertura;
    }
     
      
    public String getNumero() {
        return numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }
    
    public boolean depositar(float monto){
        this.saldo = this.saldo + monto;
        return true;
    }
    public boolean retirar(float monto){
        if(this.saldo - monto >= 0){
         this.saldo = this.saldo - monto;
         return true;
         }
        return false;
    }
    public boolean transferir(float monto){
        if(this.saldo - monto < 0){
         this.saldo = this.saldo - monto;
         return true;
         }
        return false;
    }
    public float consultarSaldo(){
        return this.saldo;
    }
    public boolean validarTarjeta(String clave){
        if(this.tarjeta.validar(clave)){
            return true;
            }
        return false;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "numero=" + numero + ", saldo=" + saldo + ", fechaApertura=" + fechaApertura + ", cliente=" + cliente + ", tarjeta=" + tarjeta + '}';
    }
    
}
