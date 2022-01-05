/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package administrador;

import Usuario.cliente;
import java.util.Arrays;

/**
 *
 * @author USER
 */
public class ArregloAdmin {
    private Admin arregloA[];
    private Admin arregloA2[];
    private int indice;
    private int tamaño;
    
    
    public ArregloAdmin(int tamaño) {
        this.indice = 0;
        this.tamaño = tamaño;
        this.arregloA = new Admin[this.tamaño];
    }
    
    
    public boolean VerificaLogeo(String usuario, String contraseña){
        boolean result = false;
        
        for(int i=0;i<this.indice;i++){
            
            if(this.arregloA[i].getUsuario().equals(usuario)&&this.arregloA[i].getContraseña().equals(contraseña)){
                
                result = true;
                break;
                
            }
        }
        
        return result;
    }
    
    public boolean UsuValido(Admin documento){//Ver si un usuario ya esta registrado antes de crear otro
        boolean result = false;
        
        
        if(documento.getContraseña().equals(documento.getConfirmarcontraseña())){//valida si son iguales
            result = true;
            if(indice>0){//si el indice es mayor a 0
                for(int i=0; i<this.indice;i++){//recorre el indice
                    if(documento.getDocumento().equals(this.arregloA[i].getDocumento())){//compara si hay un documento ya registrado
                    result = false;
                    break;
                    }  
                }
            }
        }
        
        return result;
    }
    
    
    public boolean agregar(Admin usuario){
        boolean result = false;
        Admin documento = null;
        documento = usuario;
        
            if(UsuValido(documento)){//Si es true va a agregar
                if(estaLleno()){//Si esta lleno aumentara tamaño
                    crecerArreglo(); 
                }
            this.arregloA[this.indice] = usuario;
            this.indice = indice +1;
            result = true;
        
            }
        
        return result;
    } 
    
    
    private void crecerArreglo(){//hara que el arreglo crezca
        if(estaLleno()){
            arregloA2 = new Admin[tamaño];
            for(int i=0;i<tamaño;i++){
                arregloA2[i] = arregloA[i];
            }
            arregloA = new Admin[tamaño+1];
            for(int i=0;i<tamaño-1;i++){
                arregloA[i]=arregloA2[i];
            }
        }
    }
    
    private boolean estaLleno(){//metodo para validar si el arreglo esta lleno para hacerlo crecer
        boolean result = false;
        if(this.indice == this.tamaño){
            
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
    
       
    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }
    
    @Override
    public String toString() {
        String result=" ";
        
        for(int i =0;i<this.indice;i++){
            result += this.arregloA[i];
        }
        
        return result;
}
}