
package Usuario;

public class Usuario {
    
    private String contraseña;
    private String usuario;
         
    public Usuario(String contraseña, String usuario) {
        this.contraseña = contraseña;
        this.usuario = usuario;
    }
    
    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return   
                "Usuario: "+this.getUsuario()+"\n" + 
                "Contraseña: " + this.getContraseña();
    }
    
    
    
    
    
}
