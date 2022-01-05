
package Usuario;

public class Usuario {
    
    private String contraseña;
    private String usuario;
    private String numCel;
    private String correo;
    private String confirmarcontraseña;
    private String nombre;
    private String apellido;
    private String documento;     
    
    public Usuario(String nombre,String usuario,
            String apellido,String numCel, String correo, String documento, String contraseña, String confirmarcontraseña) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.confirmarcontraseña = confirmarcontraseña;
        this.numCel = numCel;
        this.correo = correo;
        this.contraseña = contraseña;
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

    public String getConfirmarcontraseña() {
        return confirmarcontraseña;
    }

    public void setConfirmarcontraseña(String confirmarcontraseña) {
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
                "Nombre: "+this.getNombre()+"\n" +
                "Apellido: "+this.getApellido()+"\n" +
                "Documento: "+this.getDocumento()+"\n" +
                "Correo: "+this.getCorreo()+"\n" +
                "Nro Celular: "+this.getNumCel()+"\n" +
                "Usuario: "+this.getUsuario()+"\n" + 
                "Contraseña: " + this.getContraseña();
    }
    
    
    
    
    
}
