
package Controlador;

import Usuario.ArregloCliente;
import Usuario.cliente;
import formulario.UsuRegis;
import formulario.Usuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class controladorRegis {
    private ArregloCliente modelo;
    private UsuRegis vistaRegis;

    
    public controladorRegis(ArregloCliente modelo, UsuRegis vistaRegis) {
        this.modelo = modelo;
        this.vistaRegis = vistaRegis;
        
        this.vistaRegis.btnSalir.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        
        this.vistaRegis.btnVolver.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                Usuario usario = new Usuario();
                
            }
            
        });
        
        this.vistaRegis.btnRegistrar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!modelo.UsuValido(vistaRegis.txtDoc.toString(), vistaRegis.txtContraseña.toString(),vistaRegis.txtConfirmar.toString())){
                    cliente Cliente;
                    Cliente = new cliente(vistaRegis.txtNumCel.getText(), 
                            vistaRegis.txtCorreo.getText()
                            ,vistaRegis.txtNombre.getText()
                            ,vistaRegis.txtApellido.getText(), 
                            vistaRegis.txtDoc.getText(), 
                            vistaRegis.txtContraseña.getText(),
                            vistaRegis.txtConfirmar.getText(),
                            vistaRegis.txtUsuario.getText());
                    modelo.agregar(Cliente);
                    limpiar();
                    JOptionPane.showMessageDialog(vistaRegis, "Documento Registrado exitosamente");
                }else{
                    JOptionPane.showMessageDialog(vistaRegis, "Documento Registrado previamente pipipipi");
                }
            }
            
            
        });
        
        this.vistaRegis.btnImprimir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(vistaRegis, modelo);
            }
        });
        
        
        
        
    }
    public void iniciar(){
        vistaRegis.setLocationRelativeTo(null);
        vistaRegis.setVisible(true);//hago que el formulario sea visible
        
    }
    
    private void limpiar(){
                this.vistaRegis.txtApellido.setText("");
                this.vistaRegis.txtCorreo.setText("");
                this.vistaRegis.txtDoc.setText("");
                this.vistaRegis.txtNombre.setText("");
                this.vistaRegis.txtNumCel.setText("");
                this.vistaRegis.txtContraseña.setText("");
                this.vistaRegis.txtConfirmar.setText("");
                this.vistaRegis.txtUsuario.setText("");
                
        }
    
    
}
