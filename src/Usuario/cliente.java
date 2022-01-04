
package Usuario;

import java.io.File;


public class cliente extends Usuario{
    private String numCel;
    private String correo;
    private String confirmarcontraseña;
    private String nombre;
    private String apellido;
    private String documento;
    

    public cliente(String nombre,String usuario,
            String apellido,String numCel, String correo, String documento, String contraseña, String confirmarcontraseña) {
        super(contraseña,usuario);
        this.numCel = numCel;
        this.correo = correo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.confirmarcontraseña = confirmarcontraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
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
        String result = "Nombre: "+getNombre()+"\n"+
                        "Apellido: "+getApellido()+"\n"+
                        super.toString()+"\n"+
                        "Documento: "+getDocumento()+"\n"+
                        "Numero de celular: "+getNumCel()+"\n"+
                        "Correo: "+getCorreo()+"\n"+
                    "---------------------------------\n";
        return  result;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
