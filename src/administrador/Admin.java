
package administrador;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class Admin extends Trabajador{
    private int indice = 0;
    private Date fechaIngreso;
    private Date fechaSalida;
    private Date horaIngreso;
    private Date horaSalida;

    public Admin(LocalTime[] fechaIngreso, LocalTime[] horaIngreso, LocalTime[] fechaSalida, LocalTime[] horaSalida, String contraseña, String usuario) {
        super(fechaIngreso, horaIngreso, fechaSalida, horaSalida, contraseña, usuario);
        this.indice = 0;
        
    
    }

    
    
}
