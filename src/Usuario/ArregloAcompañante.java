/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuario;

/**
 *
 * @author USER
 */
public class ArregloAcompañante {
    private Acompañante arregloU[];
    private Acompañante arregloU2[];
    private int indice;
    private int tamaño;
    
    public ArregloAcompañante(int tamaño) {
        this.indice = 0;
        this.tamaño = tamaño;
        this.arregloU = new Acompañante[this.tamaño];
    }

    public ArregloAcompañante() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public boolean agregar(){
         boolean result = false;
        
            
        
        return result;
    }
     private void crecerArreglo(){//hara que el arreglo crezca
        if(estaLleno()){
            arregloU2 = new Acompañante[tamaño];
            for(int i=0;i<tamaño;i++){
                arregloU2[i] = arregloU[i];
            }
            arregloU = new Acompañante[tamaño+1];
            for(int i=0;i<tamaño-1;i++){
                arregloU[i]=arregloU2[i];
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
}
