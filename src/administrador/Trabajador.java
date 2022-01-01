
package administrador;

import Usuario.Usuario;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class Trabajador extends Usuario{
    private Date turno;
    private LocalTime fechaIngreso[];
    private LocalTime horaIngreso[];
    private LocalTime fechaSalida[];
    private LocalTime horaSalida[];
    

    public Trabajador(LocalTime[] fechaIngreso, LocalTime[] horaIngreso, LocalTime[] fechaSalida, LocalTime[] horaSalida, String contraseña, String usuario) {
        super(contraseña, usuario);
        
        
    }
    
    

    
    
    
}
