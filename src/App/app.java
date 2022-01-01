
package App;

import Controlador.controlador;
import Usuario.ArregloCliente;
import Usuario.cliente;
import formulario.UsuRegis;

public class app {
    public static void main(String[] args) {
        cliente Cliente;
        ArregloCliente arregloCliente;
        UsuRegis usuregis = new UsuRegis();
        arregloCliente = new ArregloCliente();
        
        controlador Controlado = new controlador(arregloCliente, usuregis);
        
        Controlado.iniciar();
    }
}
