
package Usuario;

import java.io.File;


public class cliente extends Usuario{
    private String numCel;
    private String correo;
    private File carneVacunacion;
    private String confirmarcontraseña;
    private int numC=0;
    private static int correlativo = 1;

    public cliente(String numCel, String correo,  String nombre, 
            String apellido, String documento, String contraseña, String confirmarcontraseña) {
        super(nombre, apellido, documento, contraseña);
        this.numCel = numCel;
        this.correo = correo;
        this.numC = cliente.correlativo++;
        this.confirmarcontraseña = confirmarcontraseña;
    }

    public int getNumC() {
        return numC;
    }

    public void setNumC(int numC) {
        this.numC = numC;
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
        return  "Numero de cliente= "+numC
                +" \nNombre: "+getNombre()+
                " \nApellido: "+getApellido()+
                " \nNumero de Celular: "+numCel + 
                " \nDocumento: " +getDocumento()+
                " \nCorreo: "+correo+
                " \nContraseña: "+getContraseña()+ 
                " \n"
                
                +"---------------------------------\n" ;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
