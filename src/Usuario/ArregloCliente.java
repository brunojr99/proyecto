
package Usuario;

import ControladorUsuCit.controladorU;
import java.util.Arrays;
import java.util.Collections;

public class ArregloCliente {
    private cliente arregloU[];
    private cliente arregloU2[];
    private int indice = 0;
    
    public ArregloCliente() {
        
        this.arregloU = new cliente[controladorU.maxUsuario];
        this.indice = indice;
    }
    public ArregloCliente(int tamaño) {
        this.indice = 0;
        this.arregloU = new cliente[tamaño];
    }
    
    
    public boolean VerificaLogeo(String usuario, String contraseña){
        boolean result = false;
        for(int i=0;i<this.indice;i++){
            if(this.arregloU[i].getUsuario().equalsIgnoreCase(usuario)){
                if(this.arregloU[i].getContraseña().equalsIgnoreCase(contraseña)){
                    result = true;
                }
                
            }
            
        }
        return result;
    }
    
    public boolean UsuValido(String documento, String contraseña, String confirm){//Ver si un usuario ya esta registrado antes de crear otro
        boolean result = false;
        for(int i=0; i<this.indice;i++){
            
            if(this.arregloU[i].getDocumento().equalsIgnoreCase(documento)){//revisa si el numero de doc enviado es el mismo o no
                result=true;
                    break;
            }
            
        
        }
        if(contraseña == confirm){
            result=true;
                    
        }
        return result;
    }
    
    
    public boolean agregar(cliente usuario){
        boolean result = false;
        if(!UsuValido(usuario.getDocumento(),usuario.getContraseña(), usuario.getConfirmarcontraseña())){//Si es true va a agregar
            if(estaLleno()){//Si esta lleno lo agrega
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

    

    

    
    
}
