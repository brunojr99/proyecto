
package Usuario;

public class Usuario {
    private String nombre;
    private String apellido;
    private String documento;
    private String contraseña;
    private String usuario;
    
    

    public Usuario(String nombre, String apellido, String documento, String contraseña) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.contraseña = contraseña;
    }

    public Usuario(String contraseña, String usuario) {
        this.contraseña = contraseña;
        this.usuario = usuario;
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
        return  nombre + 
                apellido + 
                documento + 
                contraseña + 
                usuario;
    }
    
    
    
    
    
}
