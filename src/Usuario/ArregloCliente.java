
package Usuario;

import ControladorUsuCit.controladorU;
import java.util.Arrays;
import java.util.Collections;

public class ArregloCliente {
    private Usuario arregloU[];
    private Usuario arregloU2[];
    private int indice;
    
    public ArregloCliente() {
        this.indice = 0;
        this.arregloU = new Usuario[controladorU.maxUsuario];
        
    }
    
    public boolean UsuRegistrado(String documento){//Ver si un usuario ya esta registrado antes de crear otro
        boolean result = false;
        for(int i=0; i<this.indice;i++){
            if(this.arregloU[i].getDocumento().equalsIgnoreCase(documento)){//revisa si el numero de doc enviado es el mismo o no
                result=true;
                break;
            }
        }
        
        return result;
    }
    
    public boolean agregar(Usuario usuario){
        boolean result = false;
        if(!UsuRegistrado(usuario.getDocumento())){//Si es true va a agregar
            if(estaLleno()){//Si esta lleno lo agrega
               crecerArreglo(); 
            }
            this.arregloU[this.indice] = usuario;
            this.indice++;
            result = true;
        }
        return result;
    }
    
    public boolean eliminarUsuario(Usuario usuario){
        boolean result = false;
        
        
        
        return result;
    }
    
    public Usuario getUsuario(String documento){
        Usuario result = null;
        
        
        return result;
    }
    
    private void crecerArreglo(){//hara que el arreglo cresca
        if(estaLleno()==true){
            arregloU2 = new Usuario[controladorU.maxUsuario];
            for(int i=0;i<controladorU.maxUsuario;i++){
                arregloU2[i] = arregloU[i];
            }
            arregloU = new Usuario[controladorU.maxUsuario+1];
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
    
    public void ordenarPorCorreo(){
        Arrays.sort(arregloU);
        
    }
    
    public void ordenarPorApellido(){
        Arrays.sort(arregloU);
    }
    
    public void ordenarPorDocumento(){
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
