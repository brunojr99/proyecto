
package App;

import Controlador.controladorRegis;
import Usuario.ArregloCliente;
import Usuario.cliente;
import formulario.UsuRegis;

public class app {
    public static void main(String[] args) {
        cliente Cliente;
        ArregloCliente arregloCliente;
        UsuRegis usuregis = new UsuRegis();
        arregloCliente = new ArregloCliente();
        
        controladorRegis Controlado = new controladorRegis(arregloCliente, usuregis);
        
        Controlado.iniciar();
    }
}
