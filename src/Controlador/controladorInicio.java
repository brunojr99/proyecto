
package Controlador;

import Usuario.ArregloCliente;
import Usuario.cliente;
import formulario.Inicio;
import formulario.UsuAdmin;
import formulario.UsuRegis;
import formulario.Usuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class controladorInicio {
    
    private ArregloCliente modelo;
    private Inicio vistaI;
    
    public controladorInicio(ArregloCliente modelo, Inicio vistaI) {
        this.modelo = modelo;
        this.vistaI = vistaI;
        
        this.vistaI.btnSalir.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        
        
        this.vistaI.btnIngresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                UsuAdmin usuadmin = new UsuAdmin(modelo);
                usuadmin.setVisible(true);
                vistaI.setVisible(false);
            }
        });
        
        
        
        
    }
    public void iniciar(){
        vistaI.setLocationRelativeTo(null);
        vistaI.setVisible(true);//hago que el formulario sea visible
        
    }
}
