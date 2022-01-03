
package Usuario;

import ControladorUsuCit.controladorU;
import java.util.Arrays;


public class ArregloCliente {
    private cliente arregloU[];
    private cliente arregloU2[];
    private int indice;
    private int tamaño;
    
    
    public ArregloCliente(int tamaño) {
        this.indice = 0;
        this.tamaño = tamaño;
        this.arregloU = new cliente[this.tamaño];
    }
    
    
    public boolean VerificaLogeo(String usuario, String contraseña){
        boolean result = false;
        for(int i=0;i<this.indice;i++){
            if(this.arregloU[i].getUsuario()==usuario){
                for(int j=0;i<this.indice;j++){
                if(this.arregloU[j].getContraseña()==contraseña){
                    return true;
                }}
                
            }
            
        }
        return result;
    }
    
    public boolean UsuValido(cliente documento){//Ver si un usuario ya esta registrado antes de crear otro
        boolean result = false;
        
        
            
            for(int i=0; i<this.indice;i++){
            
            if(documento.getDocumento().equals(this.arregloU[i].getDocumento())){//revisa si el numero de doc enviado es el mismo o no
                if(documento.getContraseña()==documento.getConfirmarcontraseña()){
                    return true;
                }
            }
            
        
        
        }
        return result;
    }
    
    
    public boolean agregar(cliente usuario){
        boolean result = false;
        cliente documento = null;
        documento = usuario;
        
            if(!UsuValido(documento)){//Si es true va a agregar
            if(estaLleno()){//Si esta lleno aumentara tamaño
               crecerArreglo(); 
            }
            this.arregloU[this.indice] = usuario;
            this.indice++;
            result = true;
        
        }
        
        return result;
    }
    
    public boolean eliminarUsuario(cliente usuario){
        boolean result = false;
        
        
        
        return result;
    }
    
    
    
    private void crecerArreglo(){//hara que el arreglo cresca
        if(estaLleno()==true){
            arregloU2 = new cliente[controladorU.maxUsuario];
            for(int i=0;i<controladorU.maxUsuario;i++){
                arregloU2[i] = arregloU[i];
            }
            arregloU = new cliente[controladorU.maxUsuario+1];
            for(int i=0;i<controladorU.maxUsuario-1;i++){
                arregloU[i]=arregloU2[i];
            }
        }
    }
    
    private boolean estaLleno(){//metodo para validar si el arreglo esta lleno para hacerlo crecer
        boolean result = false;
        if(this.indice == controladorU.maxUsuario){
            
            result = true;
        }
        return result;
    }
    
    private boolean estaVacio(){
        boolean result = false;
        if(this.indice == 0){
            result=true;
        }
        return result;
    }
    
    public void ordenarPorCorreo(){//Para que el Admin pueda ordenar a los Usuarios por correo
        Arrays.sort(arregloU);
        
    }
    
    public void ordenarPorApellido(){//Para que el Admin pueda ordenar a los Usuarios por Apellido
        Arrays.sort(arregloU);
    }
    
    public void ordenarPorDocumento(){//Para que el Admin pueda ordenar a los Usuarios por Doc
        Arrays.sort(arregloU);
    }

    @Override
    public String toString() {
        String result=" ";
        for(int i =0;i<this.indice;i++){
            result += this.arregloU[i];
        }
        
        return result;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    

    

    
    
}
