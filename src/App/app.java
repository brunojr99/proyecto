
package App;

import Controlador.controladorInicio;
import Usuario.ArregloCliente;
import administrador.ArregloAdmin;
import formulario.Inicio;


public class app {
    public static void main(String[] args) {
        ArregloCliente arregloCliente = new ArregloCliente(100);
        Inicio vistaI = new Inicio();
        ArregloAdmin  arregloadmin = new ArregloAdmin(5);
        controladorInicio Controlador = new controladorInicio(arregloCliente,arregloadmin,vistaI);
        
        Controlador.iniciar();
    }
}
