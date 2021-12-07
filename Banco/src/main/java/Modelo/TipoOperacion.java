
package Modelo;


public class TipoOperacion {
    private String nombre;
    private String codigo;

    public TipoOperacion(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

   public String getTipo(){
       return this.nombre;
      
   }
   
    
}
