
package Modelo;

/**
 *
 * @author USER
 */
public class Cuenta {
    private String numero;
    private float saldo;
    private Tarjeta[] tarjetas;

    public Cuenta(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }
    public boolean depositar(Tarjeta tarjeta){
        boolean result = false;
        return false;
    }
}
