
package Usuario;

import java.io.File;


public class cliente extends Usuario{
    private String numCel;
    private String correo;
    private File carneVacunacion;
    private String confirmarcontraseña;
    
    
    ArregloCliente arre = new ArregloCliente();

    public cliente(String numCel, String correo,  String nombre, 
            String apellido, String documento, String contraseña, String confirmarcontraseña, String usuario) {
        super(nombre, apellido, documento, contraseña, usuario);
        this.numCel = numCel;
        this.correo = correo;
        
        this.confirmarcontraseña = confirmarcontraseña;
    }

    
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    

    public String getNumCel() {
        return numCel;
    }

    public void setNumCel(String numCel) {
        this.numCel = numCel;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public File getCarneVacunacion() {
        return carneVacunacion;
    }

    public void setCarneVacunacion(File carneVacunacion) {
        this.carneVacunacion = carneVacunacion;
    }

    public String getConfirmarcontraseña() {
        return confirmarcontraseña;
    }

    public void setConfirmarcontraseña(String confirmarcontraseña) {
        this.confirmarcontraseña = confirmarcontraseña;
    }

    
    
    
    
    @Override
    public String toString() {
        return  " \nNombre: "+getNombre()+
                " \nApellido: "+getApellido()+
                " \nNumero de Celular: "+numCel + 
                " \nDocumento: " +getDocumento()+
                " \nCorreo: "+correo+
                " \nContraseña: "+getContraseña()+ 
                "\nUsuario: "+getUsuario()+
                " \n"
                
                +"---------------------------------\n" ;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
