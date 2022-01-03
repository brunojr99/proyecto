
package Usuario;

import java.io.File;


public class cliente extends Usuario{
    private String numCel;
    private String correo;
    private String confirmarcontraseña;
    

    public cliente(  String nombre,String usuario,
            String apellido,String numCel, String correo, String documento, String contraseña, String confirmarcontraseña) {
        super(nombre,usuario,apellido, documento, contraseña);
        this.numCel = numCel;
        this.correo = correo;
        
        this.confirmarcontraseña = confirmarcontraseña;
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

    public String getConfirmarcontraseña() {
        return confirmarcontraseña;
    }

    public void setConfirmarcontraseña(String confirmarcontraseña) {
        this.confirmarcontraseña = confirmarcontraseña;
    }

    
    
    @Override
    public String toString() {
        String result = super.toString()+"\n"+
                        getNumCel()+"\n"+
                        getCorreo()+"\n"+
                    "---------------------------------\n";
        return  result;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
