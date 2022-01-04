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
public class Sistema {
    private String fechaCita;
    private String horaCita;
    private int cupo;

    public Sistema(String fechaCita, String horaCita, int cupo) {
        this.fechaCita = fechaCita;
        this.horaCita = horaCita;
        this.cupo = cupo;
    }

    public String getFechaCita() {
        return fechaCita;
    }

    public void setFechaCita(String fechaCita) {
        this.fechaCita = fechaCita;
    }

    public String getHoraCita() {
        return horaCita;
    }

    public void setHoraCita(String horaCita) {
        this.horaCita = horaCita;
    }

    public int getCupo() {
        return cupo;
    }

    public void setCupo(int cupo) {
        this.cupo = cupo;
    }
    
}
