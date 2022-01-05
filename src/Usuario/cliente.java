
package Usuario;

import java.io.File;


public class cliente extends Usuario{

    public cliente(String nombre, String usuario, String apellido, String numCel, String correo, String documento, String contraseña, String confirmarcontraseña) {
        super(nombre, usuario, apellido, numCel, correo, documento, contraseña, confirmarcontraseña);
    }
  
    
    @Override
    public String toString() {
        String result = super.toString()+"\n"+
                    "---------------------------------\n";
        return  result;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
