
package Usuario;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;

public class Cita{
    private String fechaCita;
    private String horaCita;
    private int cupos;
    private ArrayList<String> listaVisitante;
    private int indice;

    public Cita(String fechaCita, String horaCita, int cupos, ArrayList<String> listaVisitante) {
        this.fechaCita = fechaCita;
        this.horaCita = horaCita;
        this.cupos = cupos;
        this.listaVisitante = listaVisitante;
    }
    
    
    
}
