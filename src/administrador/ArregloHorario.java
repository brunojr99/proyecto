/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package administrador;

/**
 *
 * @author USER
 */
public class ArregloHorario {
     private Horario hcita[];
    private int indice;
    
    public ArregloHorario(){
        this.hcita = new Horario[7];
        this.indice = 0;
        this.hcita[indice] = new Horario("8-9:30");indice++;
        this.hcita[indice] = new Horario("10-11:30");indice++;
        this.hcita[indice] = new Horario("13-14:30");indice++;
        this.hcita[indice] = new Horario("15-16:30");indice++;
        this.hcita[indice] = new Horario("17-18:30");indice++;
        this.hcita[indice] = new Horario("");indice++;   
    }

    public Horario[] getHcita() {      
        
        return this.hcita;
    }


}
