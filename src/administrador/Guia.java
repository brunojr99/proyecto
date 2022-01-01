
package administrador;

import java.time.LocalTime;
import java.util.Date;

public class Guia extends Trabajador{
    private Date horarioTrabajo;

    public Guia(Date horarioTrabajo, LocalTime[] fechaIngreso, LocalTime[] horaIngreso, LocalTime[] fechaSalida, LocalTime[] horaSalida, String contraseña, String usuario) {
        super(fechaIngreso, horaIngreso, fechaSalida, horaSalida, contraseña, usuario);
        this.horarioTrabajo = horarioTrabajo;
    }

    
    
    
}
