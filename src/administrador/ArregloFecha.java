/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package administrador;

import java.util.Date;

/**
 *
 * @author USER
 */
public class ArregloFecha {
    private Fecha fcita[];
    private int indice;
    
    public ArregloFecha(){
        this.fcita = new Fecha[50];
        this.indice = 0;
        this.fcita[indice] = new Fecha("06/01/22");indice++;
        this.fcita[indice] = new Fecha("07/01/22");indice++;
        this.fcita[indice] = new Fecha("08/01/22");indice++;
        this.fcita[indice] = new Fecha("09/01/22");indice++;
        this.fcita[indice] = new Fecha("10/01/22");indice++;
        this.fcita[indice] = new Fecha("11/01/22");indice++;
        this.fcita[indice] = new Fecha("12/01/22");indice++;
        this.fcita[indice] = new Fecha("13/01/22");indice++;
        this.fcita[indice] = new Fecha("14/01/22");indice++;
        this.fcita[indice] = new Fecha("15/01/22");indice++;
        this.fcita[indice] = new Fecha("16/01/22");indice++;
        this.fcita[indice] = new Fecha("17/01/22");indice++;
        this.fcita[indice] = new Fecha("18/01/22");indice++;
        this.fcita[indice] = new Fecha("19/01/22");indice++;
        this.fcita[indice] = new Fecha("20/01/22");indice++;
        this.fcita[indice] = new Fecha("21/01/22");indice++;
        this.fcita[indice] = new Fecha("");indice++;   
    }

    public Fecha[] getFcita() {      
        
        return this.fcita;
    }


    
    
}
