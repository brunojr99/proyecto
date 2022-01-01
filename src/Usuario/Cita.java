
package Usuario;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;

public class Cita{
    private Date fechaCita;
    private Date horaCita;
    private int cupos;
    private ArrayList<String> listaVisitante;
    private int indice;

    public Cita(Date fechaCita, Date horaCita, int cupos, ArrayList<String> listaVisitante) {
        this.fechaCita = fechaCita;
        this.horaCita = horaCita;
        this.cupos = cupos;
        this.listaVisitante = listaVisitante;
    }
    
    
    
}
