
package App;

import Controlador.controladorInicio;
import Usuario.ArregloCliente;
import formulario.Inicio;


public class app {
    public static void main(String[] args) {
        ArregloCliente arregloCliente = new ArregloCliente(100);
        Inicio vistaI = new Inicio(arregloCliente);
        controladorInicio Controlador = new controladorInicio(arregloCliente,vistaI);
        
        Controlador.iniciar();
    }
}
