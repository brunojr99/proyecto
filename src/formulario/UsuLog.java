/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulario;

import Usuario.ArregloCliente;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author ssant
 */
public class UsuLog extends javax.swing.JFrame {
    ArregloCliente arreglocliente;
    private ImageIcon imagen;
    private Icon icono;  
/**
     * Creates new form UsuLog
     */
    public UsuLog(ArregloCliente arreglocliente) {
        initComponents();
        this.arreglocliente=arreglocliente;
        this.pintarImagen(this.Photo, "src/imagen/RemRamp.jpg");
        this.setLocationRelativeTo(null);
        this.setTitle("Login");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        btnVolver = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        txtPasword = new javax.swing.JTextField();
        pswContra = new javax.swing.JPasswordField();
        Photo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Usuario: ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jLabel2.setText("Contraseña: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 153, -1));

        btnVolver.setText("volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, -1, -1));

        btnLogin.setText("Logearse");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, -1, -1));
        getContentPane().add(txtPasword, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 150, -1));
        getContentPane().add(pswContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 150, -1));
        getContentPane().add(Photo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
       String usuario, contraseña;
       
       usuario = this.txtUsuario.getText();
       contraseña = String.valueOf(this.pswContra.getPassword());
       
        if(arreglocliente.VerificaLogeo(usuario,contraseña)){
           PerUsu ingresar = new PerUsu(this.arreglocliente);
           JOptionPane.showMessageDialog(this, "Hola");
           ingresar.setVisible(true);
           this.setVisible(false);
           
       }else{
           JOptionPane.showMessageDialog(this, "Sigue intentando compa");
       }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        Usuario volver = new Usuario(this.arreglocliente);
        volver.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVolverActionPerformed
private void pintarImagen(JLabel lbl, String ruta){
        this.imagen = new ImageIcon(ruta);
        this.icono = new ImageIcon(this.imagen.getImage().getScaledInstance(
                lbl.getWidth(), 
                lbl.getHeight(), 
                Image.SCALE_DEFAULT));
        lbl.setIcon(this.icono);
        this.repaint();
    }
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Photo;
    public javax.swing.JButton btnLogin;
    public javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField pswContra;
    public javax.swing.JTextField txtPasword;
    public javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
